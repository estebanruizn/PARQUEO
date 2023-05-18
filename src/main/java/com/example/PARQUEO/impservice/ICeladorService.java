package com.example.PARQUEO.impservice;

import com.example.PARQUEO.Model.Celador;
import com.example.PARQUEO.Model.Visitante;

import java.util.List;
import java.util.Optional;

public interface ICeladorService {
    public List<Celador> listar_celador();
    public Optional<Celador> editar_celador(int id);
    public void guardar_celador(Celador celador);
    public void eliminar_celador(int id);
}
