package com.example.PARQUEO.interfaces;

import com.example.PARQUEO.Model.Propietario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPropietario extends JpaRepository<Propietario, Integer> {


}
