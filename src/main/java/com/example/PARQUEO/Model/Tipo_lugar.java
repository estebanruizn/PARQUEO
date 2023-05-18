package com.example.PARQUEO.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_lugar")
public class Tipo_lugar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int tipo_lugar;
    private String tipolugar;
}
