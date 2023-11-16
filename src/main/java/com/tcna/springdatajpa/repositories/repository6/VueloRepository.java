package com.tcna.springdatajpa.repositories.repository6;

import com.tcna.springdatajpa.entities.entity6.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VueloRepository extends JpaRepository<Vuelo,Long> {
}
