package com.example.PARQUEO.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "visitante")
public class Visitante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_visitante;
    private String nombre;
    private String apellido;
    private int numero_documento;
    @ManyToOne
    @JoinColumn(name = "id_vehiculo")
    private Vehiculo id_vehiculo;
}
