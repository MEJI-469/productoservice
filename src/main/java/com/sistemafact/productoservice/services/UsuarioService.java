package com.sistemafact.productoservice.services;

import com.sistemafact.productoservice.model.Usuario;

import java.util.List;

public interface UsuarioService {

    List<Usuario> findAll();

    Usuario save(Usuario usuario);

    Usuario findById(Integer idUsuario);

    void delete(Integer idUsuario);
}
