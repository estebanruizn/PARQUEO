package com.example.PARQUEO.controller;

import com.example.PARQUEO.Model.Lugar;
import com.example.PARQUEO.Model.Tipo_vehiculo;
import com.example.PARQUEO.impservice.ICeladorService;
import com.example.PARQUEO.impservice.ITipovehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping
public class Controlador_tipovehiculo {
    @Autowired
    private ITipovehiculoService servtipoveh;
    @GetMapping("/elegir")
    public String listar_tipo_vehiculo(Model model){

        model.addAttribute("titulo_tipo_vehiculo","TVEHICULOS");
        model.addAttribute("cuerpo_tipo_vehiculo","TVehiculos");

        List<Tipo_vehiculo> tv = servtipoveh.listar_tipovehiculo();


        model.addAttribute("datos_tipo_vehiculo", tv);
        return "elegir";
    }
}
