package com.example.PARQUEO.controller;
import com.example.PARQUEO.Model.Lugar;
import com.example.PARQUEO.Model.Tipo_lugar;
import com.example.PARQUEO.Model.Vehiculo;
import com.example.PARQUEO.Model.Visitante;

import com.example.PARQUEO.impservice.ILugarService;
import com.example.PARQUEO.impservice.IVehiculoService;
import com.example.PARQUEO.impservice.IVisitanteService;
import com.example.PARQUEO.impservice.ITipolugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parqueo")
public class ParqueoController {

    private final IVehiculoService vehiculoService;
    private final IVisitanteService visitanteService;
    private final ILugarService lugarService;
    private final ITipolugarService tipoLugarService;

    @Autowired
    public ParqueoController(IVehiculoService vehiculoService, IVisitanteService visitanteService, ILugarService lugarService, ITipolugarService tipoLugarService) {
        this.vehiculoService = vehiculoService;
        this.visitanteService = visitanteService;
        this.lugarService = lugarService;
        this.tipoLugarService = tipoLugarService;
    }

    @PostMapping("/vehiculo")
    public Vehiculo guardarVehiculo(@RequestBody Vehiculo vehiculo) {
        return vehiculoService.guardar_vehiculo(vehiculo);
    }

    @PostMapping("/visitante")
    public Visitante guardarVisitante(@RequestBody Visitante visitante) {
        return visitanteService.guardar_visitante(visitante);
    }

    @PostMapping("/lugar")
    public Lugar guardarLugar(@RequestBody Lugar lugar) {
        return lugarService.guardar_lugar(lugar);
    }

    @PostMapping("/tipo-lugar")
    public Tipo_lugar guardarTipoLugar(@RequestBody Tipo_lugar tipoLugar) {
        return tipoLugarService.guardar_tipolugar(tipoLugar);
    }
}
