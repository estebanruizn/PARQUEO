package com.example.PARQUEO.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Time;
import java.util.Date;


@Data
@Entity
@Table(name = "tiempo")
public class Tiempo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tiempo;
    private Date fecha;
    private Time hora_ingreso;
    private Time hora_salida;
    private Time tiempo_total;
}
