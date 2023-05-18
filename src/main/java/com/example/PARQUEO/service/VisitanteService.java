package com.example.PARQUEO.service;

import com.example.PARQUEO.Model.Visitante;
import com.example.PARQUEO.impservice.IVisitanteService;
import com.example.PARQUEO.interfaces.IVisitante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VisitanteService implements IVisitanteService {
    @Autowired
    private IVisitante data;

    @Override
    public List<Visitante> listar_visitante() {
        return data.findAll();
    }

    @Override
    public Optional<Visitante> editar_visitante(int id) {
        return data.findById(id);
    }

    @Override
    public void guardar_visitante(Visitante visitante) {
        data.save(visitante);
    }

    @Override
    public void eliminar_visitante(int id) {
        data.deleteById(id);
    }
}
