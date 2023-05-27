package com.example.PARQUEO.interfaces;

import com.example.PARQUEO.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Iadmin extends JpaRepository<Admin, Integer> {
}
