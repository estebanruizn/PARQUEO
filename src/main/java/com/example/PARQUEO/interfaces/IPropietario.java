package com.example.PARQUEO.interfaces;

import com.example.PARQUEO.Model.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPropietario extends JpaRepository<Propietario, Integer> {
}
