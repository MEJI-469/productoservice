package com.sistemafact.productoservice.repository;

import com.sistemafact.productoservice.model.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Integer> {
}
