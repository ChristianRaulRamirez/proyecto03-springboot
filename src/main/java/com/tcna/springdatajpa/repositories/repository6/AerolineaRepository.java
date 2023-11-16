package com.tcna.springdatajpa.repositories.repository6;

import com.tcna.springdatajpa.entities.entity6.Aerolinea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AerolineaRepository extends JpaRepository<Aerolinea,Long> {
}
