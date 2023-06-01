package com.example.PARQUEO.impservice;

import com.example.PARQUEO.Model.Lugar;

import java.util.List;
import java.util.Optional;

public interface ILugarService {
    public List<Lugar> listar_lugar();
    public Optional<Lugar> editar_lugar(int id);
    public Lugar guardar_lugar(Lugar lugar);
    public void eliminar_lugar(int id);

}
