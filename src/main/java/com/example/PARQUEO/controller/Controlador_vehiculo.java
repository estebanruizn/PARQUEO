package com.example.PARQUEO.controller;

import com.example.PARQUEO.Model.Vehiculo;
import com.example.PARQUEO.impservice.IVehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class Controlador_vehiculo {
    @Autowired
    private IVehiculoService servehiculo;
    @GetMapping("/vehiculo")
    public String listar(Model model){

        model.addAttribute("titulo_vehiculo","VEHICULOS");
        model.addAttribute("cuerpo_vehiculo","Vehiculos");

        List<Vehiculo> vehi = servehiculo.listar_vehiculo();


        model.addAttribute("datos_vehiculo",vehi);
        return "vehiculo";
    }

    @GetMapping("/nuevo_vehiculo")
    public String AgregarVehiculo(Model model){

        model.addAttribute("titulo_nuevo_vehiculo","Nuevo vehiculo");
        model.addAttribute("cuerpo_nuevo_vehiculo","VEHICULO NUEVO");
        model.addAttribute("vehiculo",new Vehiculo());

        return "nuevo_vehiculo";
    }

    @PostMapping("/guardar_vehiculo")
    public String Guardarvehiculo(@ModelAttribute Vehiculo vehi){

        servehiculo.guardar_vehiculo(vehi);

        return "redirect:/vehiculo";
    }

    @GetMapping("/editar_vehiculo/{id}")
    public String editarvehiculo(@PathVariable("id") int id, Model model){


        model.addAttribute("vehiculo",servehiculo.editar_vehiculo(id));

        return "nuevo_vehiculo";
    }

    @GetMapping("/eliminar_vehiculo/{id}")
    public String eliminarVehiculo(@PathVariable("id") int id, Model model){

        servehiculo.eliminar_vehiculo(id);
        return "redirect:/vehiculo";
    }

}
