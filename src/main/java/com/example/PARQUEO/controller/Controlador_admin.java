package com.example.PARQUEO.controller;

import com.example.PARQUEO.Model.Admin;
import com.example.PARQUEO.Model.Celador;
import com.example.PARQUEO.impservice.IAdminService;
import com.example.PARQUEO.impservice.ICeladorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class Controlador_admin {

    @Autowired
    private IAdminService servadmin;

    @GetMapping("/admin")
    public String listar(Model model){
        model.addAttribute("titulo_celador","ADMIN");
        model.addAttribute("cuerpo_celador","Admin");

        List<Admin> admin = servadmin.lis();


        model.addAttribute("datos_admin",admin);
        return "admin";
    }
    @PostMapping("/access")
    public String iniciarSesion(@RequestParam int password, Model model) {
        if (password == 123456) {
            // Credenciales válidas, iniciar sesión exitosamente
            return "redirect:/propietarios"; // Redirigir a la página de inicio del sistema
        } else {
            // Credenciales inválidas, mostrar mensaje de error
            model.addAttribute("error", "Contraseña incorrecta");
            return "admin"; // Renderizar directamente la vista del inicio de sesión
        }
    }
}
