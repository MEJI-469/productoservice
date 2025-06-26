package com.sistemafact.productoservice.controller;

import com.sistemafact.productoservice.model.UsuarioRol;
import com.sistemafact.productoservice.repository.UsuarioRolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario-roles")
@CrossOrigin("*")
public class UsuarioRolController {

    @Autowired
    private UsuarioRolRepository usuarioRolRepository;

    @GetMapping
    public List<UsuarioRol> listar() {
        return usuarioRolRepository.findAll();
    }

    @PostMapping
    public UsuarioRol guardar(@RequestBody UsuarioRol usuarioRol) {
        return usuarioRolRepository.save(usuarioRol);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        usuarioRolRepository.deleteById(id);
    }
}