package com.example.PARQUEO.impservice;

import com.example.PARQUEO.Model.Tipo_lugar;
import com.example.PARQUEO.Model.Visitante;

import java.util.List;
import java.util.Optional;

public interface ITipolugarService {
    public List<Tipo_lugar> listar_tipolugar();
    public Optional<Tipo_lugar> editar_tipolugar(int id);
    public void guardar_tipolugar(Tipo_lugar tipo_lugar);
    public void eliminar_tipolugar(int id);
}
