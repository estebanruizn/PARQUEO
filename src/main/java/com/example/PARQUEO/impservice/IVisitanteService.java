package com.example.PARQUEO.impservice;

import com.example.PARQUEO.Model.Visitante;

import java.util.List;
import java.util.Optional;

public interface IVisitanteService {
    public List<Visitante> listar_visitante();
    public Optional<Visitante> editar_visitante(int id);
    public void guardar_visitante(Visitante visitante);
    public void eliminar_visitante(int id);

}
