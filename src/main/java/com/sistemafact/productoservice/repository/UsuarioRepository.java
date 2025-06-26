package com.sistemafact.productoservice.repository;

import com.sistemafact.productoservice.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
