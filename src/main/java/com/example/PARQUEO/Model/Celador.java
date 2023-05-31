package com.example.PARQUEO.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="celador")
public class Celador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_celador;
    private String nombre;
    private String apellido;
    private String placa;



}
