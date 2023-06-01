package com.example.PARQUEO.service;

import com.example.PARQUEO.Model.Vehiculo;
import com.example.PARQUEO.impservice.IVehiculoService;
import com.example.PARQUEO.interfaces.IVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService implements IVehiculoService {
    @Autowired
    private IVehiculo data;

    @Override
    public List<Vehiculo> listar_vehiculo() {
        return data.findAll();
    }

    @Override
    public Optional<Vehiculo> editar_vehiculo(int id) {
        return data.findById(id);
    }

    @Override
    public Vehiculo guardar_vehiculo(Vehiculo vehiculo) {
        data.save(vehiculo);
        return vehiculo;
    }

    @Override
    public void eliminar_vehiculo(int id) {
        data.deleteById(id);
    }
}
