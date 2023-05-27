package com.example.PARQUEO.impservice;

import com.example.PARQUEO.Model.Admin;
import com.example.PARQUEO.Model.Celador;

import java.util.List;
import java.util.Optional;

public interface IAdminService {
    public List<Admin> lis();
    Optional<Admin> findById(Integer id_admin);
}
