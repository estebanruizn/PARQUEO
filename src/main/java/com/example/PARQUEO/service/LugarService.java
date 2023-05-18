package com.example.PARQUEO.service;

import com.example.PARQUEO.Model.Lugar;
import com.example.PARQUEO.impservice.ILugarService;
import com.example.PARQUEO.interfaces.ILugar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LugarService implements ILugarService {
    @Autowired
    private ILugar data;

    @Override
    public List<Lugar> listar_lugar() {
        return data.findAll();
    }

    @Override
    public Optional<Lugar> editar_lugar(int id) {
        return data.findById(id);
    }

    @Override
    public void guardar_lugar(Lugar lugar) {
        data.save(lugar);
    }

    @Override
    public void eliminar_lugar(int id) {
        data.deleteById(id);
    }
}
