package com.sistemafact.productoservice.impl;

import com.sistemafact.productoservice.model.UsuarioRol;
import com.sistemafact.productoservice.repository.UsuarioRolRepository;
import com.sistemafact.productoservice.services.UsuarioRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioRolImpl implements UsuarioRolService {

    @Autowired
    private UsuarioRolRepository usuarioRolRepository;

    @Override
    public List<UsuarioRol> findAll() {
        return usuarioRolRepository.findAll();
    }

    @Override
    public UsuarioRol save(UsuarioRol usuarioRol) {
        return usuarioRolRepository.save(usuarioRol);
    }

    @Override
    public UsuarioRol findById(Integer id) {
        return usuarioRolRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        usuarioRolRepository.deleteById(id);
    }
}
