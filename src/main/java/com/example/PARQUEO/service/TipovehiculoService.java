package com.example.PARQUEO.service;

import com.example.PARQUEO.Model.Tipo_vehiculo;
import com.example.PARQUEO.impservice.ITipovehiculoService;
import com.example.PARQUEO.interfaces.ITipovehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipovehiculoService implements ITipovehiculoService {
    @Autowired
    private ITipovehiculo data;

    @Override
    public List<Tipo_vehiculo> listar_tipovehiculo() {
        return data.findAll();
    }

    @Override
    public Optional<Tipo_vehiculo> editar_tipovehiculo(int id) {
        return data.findById(id);
    }

    @Override
    public void guardar_tipovehiculo(Tipo_vehiculo tipo_vehiculo) {
        data.save(tipo_vehiculo);
    }

    @Override
    public void eliminar_tipovehiculo(int id) {
        data.deleteById(id);
    }
}
