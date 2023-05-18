package com.example.PARQUEO.service;

import com.example.PARQUEO.Model.Propietario;
import com.example.PARQUEO.impservice.IPropietarioService;
import com.example.PARQUEO.interfaces.IPropietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropietarioService implements IPropietarioService {
    @Autowired
    private IPropietario data;

    @Override
    public List<Propietario> listar_propietario() {
        return data.findAll();
    }

    @Override
    public Optional<Propietario> editar_propietario(int id) {
        return data.findById(id);
    }

    @Override
    public void guardar_propietario(Propietario propietario) {
        data.save(propietario);
    }

    @Override
    public void eliminar_propietario(int id) {
        data.deleteById(id);
    }
}
