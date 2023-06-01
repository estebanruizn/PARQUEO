package com.example.PARQUEO.controller;

import com.example.PARQUEO.Model.Lugar;
import com.example.PARQUEO.impservice.ILugarService;
import com.example.PARQUEO.interfaces.ILugar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

@Controller
@RequestMapping
public class Controlador_lugar {
    @Autowired
    private ILugarService servlugar;

    @GetMapping("/lugar")
    public String listar_lugar(Model model){

        model.addAttribute("titulo_lugar","LUGARES");
        model.addAttribute("cuerpo_lugar","Lugares");

        List<Lugar> lug = servlugar.listar_lugar();
        model.addAttribute("datos_lugar",lug);
        return "lugares";
    }


    @PostMapping("/guardar_lugar")
    public String Guardarlugar(@ModelAttribute Lugar lug){

        servlugar.guardar_lugar(lug);

        return "redirect:/lugares";
    }

    @GetMapping("/editar_lugar/{id}")
    public String editarLugar(@PathVariable("id") int id, Model model){


        model.addAttribute("lugar",servlugar.editar_lugar(id));

        return "nuevo_lugar";
    }
    @GetMapping("/asignar_puesto")
    @ResponseBody
    public ResponseEntity<?> asignarPuesto() {
        // Obtener la lista de lugares disponibles desde el servicio
        List<Lugar> lugaresDisponibles = servlugar.listar_lugar();

        if (!lugaresDisponibles.isEmpty()) {
            // Seleccionar un lugar aleatorio
            Random random = new Random();
            int randomIndex = random.nextInt(lugaresDisponibles.size());
            Lugar lugarAsignado = lugaresDisponibles.get(randomIndex);

            // Actualizar el estado del lugar asignado en la base de datos
            lugarAsignado.setEstado("Asignado");
            servlugar.guardar_lugar(lugarAsignado);

            // Devolver el lugar asignado como respuesta
            Map<String, String> respuesta = new HashMap<>();
            respuesta.put("lugar", lugarAsignado.getLugar());
            return ResponseEntity.ok(respuesta);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No hay lugares disponibles.");
        }
    }


}
