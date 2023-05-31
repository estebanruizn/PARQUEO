package com.example.PARQUEO.controller;

import com.example.PARQUEO.Model.Propietario;
import com.example.PARQUEO.impservice.IPropietarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class Controlador_propietario {

    @Autowired
    private IPropietarioService servpropietario;

    @GetMapping("/propietarios")
    public String listar_propietarios(Model model){

        model.addAttribute("titulo_propietarios","PROPIETARIOS");
        model.addAttribute("cuerpo_propietarios","Propietarios");

        List<Propietario> propi = servpropietario.listar_propietario();


        model.addAttribute("datos_propietarios",propi);
        return "propietarios";
    }

    @GetMapping("/nuevo_propietario")
    public String AgregarPropietario(Model model){

        model.addAttribute("titulo_nuevo_propie","Nuevo propietario");
        model.addAttribute("cuerpo_nuevo_propie","PROPIETARIO NUEVO");
        model.addAttribute("propietario",new Propietario());

        return "nuevo_propietario";
    }

    @PostMapping("/guardar_propietario")
    public String Guardarpropietario(@ModelAttribute Propietario provee){

        servpropietario.guardar_propietario(provee);

        return "redirect:/propietarios";
    }


    @GetMapping("/eliminar_propietario/{id}")
    public String eliminarPropietario(@PathVariable("id") int id, Model model){

        servpropietario.eliminar_propietario(id);
        return "redirect:/propietarios";
    }

    @GetMapping("/editar_propietario/{id}")
    public String editarPropietario(@PathVariable("id") int id, Model model){


        model.addAttribute("propietario",servpropietario.editar_propietario(id));

        return "nuevo_propietario";
    }
}
