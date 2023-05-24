package com.example.PARQUEO.controller;

import com.example.PARQUEO.Model.Tiempo;
import com.example.PARQUEO.impservice.ITiempoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class Controlador_tiempo {

    @Autowired
    private ITiempoService servtiempo;

    @GetMapping("/tiempo")
    public String listar_tiempo(Model model){

        model.addAttribute("titulo_tiempo","TIEMPO");
        model.addAttribute("cuerpo_tiempo","Tiempo");

        List<Tiempo> time = servtiempo.listar_tiempo();


        model.addAttribute("datos_tiempo",time);
        return "tiempo";
    }

    @GetMapping("/nuevo_tiempo")
    public String AgregarTiempo(Model model){

        model.addAttribute("titulo_nuevo_tiempo","Nuevo tiempo");
        model.addAttribute("cuerpo_nuevo_tiempo","TIEMPO NUEVO");
        model.addAttribute("tiempo",new Tiempo());

        return "nuevo_tiempo";
    }

    @PostMapping("/guardar_tiempo")
    public String Guardartiempo(@ModelAttribute Tiempo time){

        servtiempo.guardar_tiempo(time);

        return "redirect:/tiempo";
    }
}
