package com.sistemafact.productoservice.repository;

import com.sistemafact.productoservice.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {
    // Aquí puedes agregar métodos personalizados si lo necesitas
}
