package com.example.PARQUEO.service;

import com.example.PARQUEO.Model.Tipo_lugar;
import com.example.PARQUEO.impservice.ITipolugarService;
import com.example.PARQUEO.interfaces.ITipolugar;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TipolugarService implements ITipolugarService {
    @Autowired
    private ITipolugar data;

    @Override
    public List<Tipo_lugar> listar_tipolugar() {
        return data.findAll();
    }

    @Override
    public Optional<Tipo_lugar> editar_tipolugar(int id) {
        return data.findById(id);
    }

    @Override
    public void guardar_tipolugar(Tipo_lugar tipo_lugar) {
        data.save(tipo_lugar);
    }

    @Override
    public void eliminar_tipolugar(int id) {
        data.deleteById(id);
    }
}
