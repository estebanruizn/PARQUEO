package com.example.PARQUEO.Model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="lugar")
public class Lugar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_lugar;
    private String lugar;
    private String estado;
    @ManyToOne
    @JoinColumn(name = "id_tipolugar")
    private Tipo_lugar id_tipolugar;

}
