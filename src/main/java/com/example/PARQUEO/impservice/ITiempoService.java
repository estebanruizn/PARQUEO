package com.example.PARQUEO.impservice;

import com.example.PARQUEO.Model.Tiempo;
import com.example.PARQUEO.Model.Visitante;

import java.util.List;
import java.util.Optional;

public interface ITiempoService {
    public List<Tiempo> listar_tiempo();
    public Optional<Tiempo> editar_tiempo(int id);
    public void guardar_tiempo(Tiempo tiempo);
    public void eliminar_tiempo(int id);
}
