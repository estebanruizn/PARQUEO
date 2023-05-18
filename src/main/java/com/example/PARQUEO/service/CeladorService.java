package com.example.PARQUEO.service;

import com.example.PARQUEO.Model.Celador;
import com.example.PARQUEO.impservice.ICeladorService;
import com.example.PARQUEO.interfaces.ICelador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CeladorService implements ICeladorService {
    @Autowired
    private ICelador data;

    @Override
    public List<Celador> listar_celador() {
        return data.findAll();
    }

    @Override
    public Optional<Celador> editar_celador(int id) {
        return data.findById(id);
    }

    @Override
    public void guardar_celador(Celador celador) {
        data.save(celador);
    }

    @Override
    public void eliminar_celador(int id) {
        data.deleteById(id);
    }
}
