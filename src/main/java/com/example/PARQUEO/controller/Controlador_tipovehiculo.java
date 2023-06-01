package com.example.PARQUEO.controller;

import com.example.PARQUEO.Model.Celador;
import com.example.PARQUEO.Model.Lugar;
import com.example.PARQUEO.Model.Tipo_vehiculo;
import com.example.PARQUEO.impservice.ICeladorService;
import com.example.PARQUEO.impservice.ILugarService;
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
    @Autowired
    private ICeladorService servcelador;
    @Autowired
    private ILugarService servlugar;
    @GetMapping("/elegir")
    public String listar_tipo_vehiculo(Model model){

        model.addAttribute("titulo_tipo_vehiculo","TVEHICULOS");
        model.addAttribute("cuerpo_tipo_vehiculo","TVehiculos");

        List<Tipo_vehiculo> tv = servtipoveh.listar_tipovehiculo();

        model.addAttribute("titulo_celador","CELADORES");
        model.addAttribute("cuerpo_celadores","Celadores");

        List<Celador> cela = servcelador.listar_celador();

        model.addAttribute("datos_celador", cela);

        model.addAttribute("datos_tipo_vehiculo", tv);

        model.addAttribute("titulo_lugar","LUGARES");
        model.addAttribute("cuerpo_lugar","Lugares");

        List<Lugar> lug = servlugar.listar_lugar();
        model.addAttribute("datos_lugar",lug);





        return "elegir";
    }
}
