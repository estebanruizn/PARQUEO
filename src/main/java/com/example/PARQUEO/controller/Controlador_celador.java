package com.example.PARQUEO.controller;

import com.example.PARQUEO.Model.Celador;
import com.example.PARQUEO.Model.Tipo_vehiculo;
import com.example.PARQUEO.impservice.ICeladorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RequestMapping
public class Controlador_celador {

    @Autowired
    private ICeladorService servcelador;

    @GetMapping("/celador")
    public String celador(Model model){
        model.addAttribute("titulo_celador", "CELADORES");
        model.addAttribute("cuerpo_celador", "Proveedores");
        List<Celador> cela = servcelador.listar_celador();
        model.addAttribute("datos_celador", cela);
        return "GestCelador";
    }

    @GetMapping("/elegirr")

    public String listar_tipo_vehiculo(Model model){

        model.addAttribute("titulo_celador","CELADORES");
        model.addAttribute("cuerpo_celadores","Celadores");

        List<Celador> cela = servcelador.listar_celador();

        model.addAttribute("datos_celador", cela);
        return "elegirr";
    }



    @GetMapping("/nuevo_celador")
    public String AgregarCelador(Model model){

        model.addAttribute("titulo_nuevo_celador","Nuevo guarda");
        model.addAttribute("cuerpo_nuevo_celador","GUARDA NUEVO");
        model.addAttribute("celador",new Celador());

        return "Registrar_Celador";
    }

    @PostMapping("/guardar_celador")
    public String Guardarcelador(@ModelAttribute Celador cela){

        servcelador.guardar_celador(cela);

        return "redirect:/celador";
    }

    @GetMapping("/editar_celador/{id}")
    public String editarCelador(@PathVariable("id") int id, Model model){


        model.addAttribute("celador",servcelador.editar_celador(id));

        return "Registrar_Celador";
    }

    @GetMapping("/eliminar_celador/{id}")
    public String eliminarCelador(@PathVariable("id") int id, Model model){

        servcelador.eliminar_celador(id);
        return "redirect:/celador";
    }

}
