package com.example.PARQUEO.interfaces;

import com.example.PARQUEO.Model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVehiculo extends JpaRepository<Vehiculo, Integer> {
}
