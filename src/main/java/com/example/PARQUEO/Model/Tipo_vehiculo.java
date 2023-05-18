package com.example.PARQUEO.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_vehiculo")
public class Tipo_vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipovehiculo;
    private String tipo_vehiculo;
}
