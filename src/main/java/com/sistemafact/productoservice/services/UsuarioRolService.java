package com.sistemafact.productoservice.services;

import com.sistemafact.productoservice.model.UsuarioRol;

import java.util.List;

public interface UsuarioRolService {

    List<UsuarioRol> findAll();

    UsuarioRol save(UsuarioRol usuarioRol);

    UsuarioRol findById(Integer idUsuarioRol);

    void delete(Integer idUsuarioRol);
}
