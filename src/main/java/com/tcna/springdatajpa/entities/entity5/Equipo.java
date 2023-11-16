package com.tcna.springdatajpa.entities.entity5;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Equipo {

    @Id
    @GeneratedValue
    private Long id;
    private String nombre;

    @OneToMany(mappedBy = "equipo",cascade = CascadeType.MERGE,fetch = FetchType.LAZY)
    private List<Jugador> jugadores = new ArrayList<>();
}
