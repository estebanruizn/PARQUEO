package com.example.PARQUEO.controller;

import com.example.PARQUEO.Model.Vehiculo;
import com.example.PARQUEO.Model.Visitante;
import com.example.PARQUEO.impservice.IVisitanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class Controlador_visitante {
    @Autowired
    private IVisitanteService servvisit;

    @GetMapping("/visitante")
    public String listarvisitante(Model model){

        model.addAttribute("titulo_visitante","VISITANTE");
        model.addAttribute("cuerpo_visitante","Visitante");

        List<Visitante> visi = servvisit.listar_visitante();


        model.addAttribute("datos_visitante",visi);
        return "visitante";
    }

    @GetMapping("/nuevo_visitante")
    public String Agregarvisitante(Model model){

        model.addAttribute("titulo_nuevo_visitante","Nuevo visitante");
        model.addAttribute("cuerpo_nuevo_visitante","VISITANTE NUEVO");
        model.addAttribute("visitante",new Visitante());

        return "nuevo_visitante";
    }

    @PostMapping("/guardar_visitante")
    public String Guardarvisitante(@ModelAttribute Visitante visi){

        servvisit.guardar_visitante(visi);

        return "redirect:/visitante";
    }

    @GetMapping("/editar_visitante/{id}")
    public String editarvisitante(@PathVariable("id") int id, Model model){


        model.addAttribute("visitante",servvisit.editar_visitante(id));

        return "nuevo_visitante";
    }

    @GetMapping("/eliminar_visitante/{id}")
    public String eliminarvisitante(@PathVariable("id") int id, Model model){

        servvisit.eliminar_visitante(id);
        return "redirect:/visitante";
    }
}
