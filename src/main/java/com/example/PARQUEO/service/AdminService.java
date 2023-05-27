package com.example.PARQUEO.service;

import com.example.PARQUEO.Model.Admin;
import com.example.PARQUEO.Model.Celador;
import com.example.PARQUEO.impservice.IAdminService;
import com.example.PARQUEO.interfaces.ICelador;
import com.example.PARQUEO.interfaces.Iadmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService implements IAdminService {

    @Autowired
    private Iadmin data;

    @Override
    public List<Admin> lis() {
        return data.findAll();
    }

    @Override
    public Optional<Admin> findById(Integer id_admin) {
        return data.findById(id_admin);
    }
}
