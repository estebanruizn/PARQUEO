package com.example.PARQUEO.service;

import com.example.PARQUEO.Model.Celador;
import com.example.PARQUEO.impservice.ICeladorService;
import com.example.PARQUEO.interfaces.ICelador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class CeladorService implements ICeladorService {
    @Autowired
    private ICelador data;

    @Override
    public List<Celador> listar_celador() {
        return data.findAll();
    }

    @Override
    public Optional<Celador> editar_celador(int id) {
        return data.findById(id);
    }

    @Override
    public void guardar_celador(Celador celador) {
        data.save(celador);
    }

    @Override
    public void eliminar_celador(int id) {
        data.deleteById(id);
    }

    @PostMapping("/access2")
    public String iniciarSesion3(@RequestParam int password, Model model) {
        if (password == 123456) {
            // Credenciales válidas, iniciar sesión exitosamente
            return "redirect:/celador"; // Redirigir a la página de inicio del sistema
        } else {
            // Credenciales inválidas, mostrar mensaje de error
            model.addAttribute("error", "Contraseña incorrecta");
            return "admincel"; // Renderizar directamente la vista del inicio de sesión
        }
    }

    public void agregarListaCeladoresAlModelo(Model model) {
        List<Celador> celadores = listar_celador();
        model.addAttribute("celadores", celadores);
    }
}
