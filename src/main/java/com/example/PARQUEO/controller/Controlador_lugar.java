package com.example.PARQUEO.controller;

import com.example.PARQUEO.Model.Lugar;
import com.example.PARQUEO.impservice.ILugarService;
import com.example.PARQUEO.interfaces.ILugar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

}
