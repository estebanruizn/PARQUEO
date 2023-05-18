package com.example.PARQUEO.interfaces;

import com.example.PARQUEO.Model.Tiempo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITiempo extends JpaRepository<Tiempo, Integer> {
}
