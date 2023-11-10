package com.tcna.springdatajpa.entities.entity5;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@ToString
@Entity
@Data
public class Jugador {

    @Id
    @GeneratedValue
    private Long id;

    private String nombre;
    private int numeroCamiseta;

    @ManyToOne
    @JoinColumn(name = "equipo_id")
    private Equipo equipo;
}
