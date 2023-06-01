package com.example.PARQUEO.impservice;

import com.example.PARQUEO.Model.Propietario;
import com.example.PARQUEO.Model.Visitante;

import java.util.List;
import java.util.Optional;

public interface IPropietarioService {

    public List<Propietario> findByTorreAndApartamento(String torre, String apartamento);

    public List<Propietario> listar_propietario();
    public Optional<Propietario> editar_propietario(int id);
    public void guardar_propietario(Propietario propietario);
    public void eliminar_propietario(int id);
}
