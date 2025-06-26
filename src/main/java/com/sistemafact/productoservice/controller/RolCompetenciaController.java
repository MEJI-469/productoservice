package com.sistemafact.productoservice.controller;

import com.sistemafact.productoservice.model.RolCompetencia;
import com.sistemafact.productoservice.repository.RolCompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/rol-competencias")
@CrossOrigin("*")
public class RolCompetenciaController {

    @Autowired
    private RolCompetenciaRepository rolCompetenciaRepository;

    @GetMapping
    public List<RolCompetencia> listar() {
        return rolCompetenciaRepository.findAll();
    }

    @PostMapping
    public RolCompetencia guardar(@RequestBody RolCompetencia rolCompetencia) {
        return rolCompetenciaRepository.save(rolCompetencia);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        rolCompetenciaRepository.deleteById(id);
    }

}