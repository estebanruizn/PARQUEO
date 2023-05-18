package com.example.PARQUEO.interfaces;

import com.example.PARQUEO.Model.Visitante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVisitante extends JpaRepository<Visitante, Integer> {
}
