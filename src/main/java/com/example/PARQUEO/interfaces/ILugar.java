package com.example.PARQUEO.interfaces;

import com.example.PARQUEO.Model.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILugar extends JpaRepository<Lugar, Integer> {
}
