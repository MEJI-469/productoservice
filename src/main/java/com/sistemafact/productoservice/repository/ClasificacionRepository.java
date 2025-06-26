package com.sistemafact.productoservice.repository;

import com.sistemafact.productoservice.model.Clasificacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClasificacionRepository extends JpaRepository<Clasificacion, Integer> {
}

