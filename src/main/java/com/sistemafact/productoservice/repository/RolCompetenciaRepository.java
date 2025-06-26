package com.sistemafact.productoservice.repository;

import com.sistemafact.productoservice.model.RolCompetencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolCompetenciaRepository extends JpaRepository<RolCompetencia, Integer> {
}