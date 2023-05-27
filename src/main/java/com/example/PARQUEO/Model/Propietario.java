package com.example.PARQUEO.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="propietario")
public class Propietario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_propietario;
    private String nombre;
    private String apellido;
    private String apartamento;
    private String torre;
    @ManyToOne
    @JoinColumn(name = "id_visitante")
    public Visitante id_visitante;
}
