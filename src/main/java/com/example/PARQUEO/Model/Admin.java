package com.example.PARQUEO.Model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name ="admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_admin;
    private int contraseña_admin;


}
