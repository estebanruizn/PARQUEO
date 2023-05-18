package com.example.PARQUEO.impservice;

import com.example.PARQUEO.Model.Tipo_vehiculo;
import com.example.PARQUEO.Model.Visitante;

import java.util.List;
import java.util.Optional;

public interface ITipovehiculoService {
    public List<Tipo_vehiculo> listar_tipovehiculo();
    public Optional<Tipo_vehiculo> editar_tipovehiculo(int id);
    public void guardar_tipovehiculo(Tipo_vehiculo tipo_vehiculo);
    public void eliminar_tipovehiculo(int id);
}
