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
    public Vehiculo guardarVehiculo(@RequestParam("color") String color,
                                    @RequestParam("modelo") String modelo,
                                    @RequestParam("placa") String placa,
                                    @RequestParam("celador") int idCelador,
                                    @RequestParam("tipo_vehiculo") int idTipoVehiculo,
                                    @RequestParam("lugar") String lugar) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setColor(color);
        vehiculo.setModelo(modelo);
        vehiculo.setPlaca(placa);
        return vehiculoService.guardar_vehiculo(vehiculo);
    }

    @PostMapping("/visitante")
    public Visitante guardarVisitante(@RequestParam("nombre") String nombre,
                                      @RequestParam("apellido") String apellido,
                                      @RequestParam("numero_documento") int numeroDocumento) {
        Visitante visitante = new Visitante();
        visitante.setNombre(nombre);
        visitante.setApellido(apellido);
        visitante.setNumero_documento(numeroDocumento);
        return visitanteService.guardar_visitante(visitante);
    }

}
