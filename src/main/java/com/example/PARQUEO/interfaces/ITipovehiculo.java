package com.example.PARQUEO.interfaces;

import com.example.PARQUEO.Model.Tipo_vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipovehiculo extends JpaRepository<Tipo_vehiculo, Integer> {
}
