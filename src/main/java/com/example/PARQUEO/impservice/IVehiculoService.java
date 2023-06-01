package com.example.PARQUEO.impservice;

import com.example.PARQUEO.Model.Vehiculo;

import java.util.List;
import java.util.Optional;

public interface IVehiculoService {
    public List<Vehiculo> listar_vehiculo();
    public Optional<Vehiculo> editar_vehiculo(int id);
    public Vehiculo guardar_vehiculo(Vehiculo vehiculo);
    public void eliminar_vehiculo(int id);
}
