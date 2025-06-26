package com.sistemafact.productoservice.impl;

import com.sistemafact.productoservice.model.Usuario;
import com.sistemafact.productoservice.repository.UsuarioRepository;
import com.sistemafact.productoservice.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario save(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario findById(Integer id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
