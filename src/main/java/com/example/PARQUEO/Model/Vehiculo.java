package com.example.PARQUEO.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "vehiculo")
public class Vehiculo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_vehiculo;
    private String placa;
    private String modelo;
    private String color;
    @ManyToOne
    @JoinColumn(name = "id_tiempo")
    private Tiempo id_tiempo;
    @ManyToOne
    @JoinColumn(name = "id_lugar")
    private Lugar id_lugar;

    @ManyToOne
    @JoinColumn(name = "id_tipovehiculo")
    private Tipo_vehiculo id_tipovehiculo;
    @ManyToOne
    @JoinColumn(name = "id_celador")
    private Celador id_celador;
}
