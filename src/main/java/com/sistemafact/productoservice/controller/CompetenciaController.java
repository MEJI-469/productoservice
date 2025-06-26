package com.sistemafact.productoservice.controller;

import com.sistemafact.productoservice.model.Competencia;
import com.sistemafact.productoservice.repository.CompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/competencias")
public class CompetenciaController {

    @Autowired
    private CompetenciaRepository competenciaRepository;

    @GetMapping
    public List<Competencia> getAllCompetencias() {
        return competenciaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Competencia> getCompetenciaById(@PathVariable int id) {
        Optional<Competencia> comp = competenciaRepository.findById(id);
        return comp.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Competencia createCompetencia(@RequestBody Competencia competencia) {
        return competenciaRepository.save(competencia);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Competencia> updateCompetencia(@PathVariable int id, @RequestBody Competencia competenciaDetails) {
        return competenciaRepository.findById(id).map(c -> {
            c.setNombre(competenciaDetails.getNombre());
            c.setDescripcion(competenciaDetails.getDescripcion());
            return ResponseEntity.ok(competenciaRepository.save(c));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCompetencia(@PathVariable int id) {
        if (competenciaRepository.existsById(id)) {
            competenciaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
