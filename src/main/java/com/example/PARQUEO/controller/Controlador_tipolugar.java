package com.example.PARQUEO.controller;

import com.example.PARQUEO.impservice.ITipolugarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class Controlador_tipolugar {
    @Autowired
    private ITipolugarService servtipolugar;
}
