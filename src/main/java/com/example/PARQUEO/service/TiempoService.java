package com.example.PARQUEO.service;

import com.example.PARQUEO.Model.Tiempo;
import com.example.PARQUEO.impservice.ITiempoService;
import com.example.PARQUEO.interfaces.ITiempo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TiempoService implements ITiempoService {
    @Autowired
    private ITiempo data;

    @Override
    public List<Tiempo> listar_tiempo() {
        return data.findAll();
    }

    @Override
    public Optional<Tiempo> editar_tiempo(int id) {
        return data.findById(id);
    }

    @Override
    public void guardar_tiempo(Tiempo tiempo) {
        data.save(tiempo);
    }

    @Override
    public void eliminar_tiempo(int id) {
        data.deleteById(id);
    }
}
