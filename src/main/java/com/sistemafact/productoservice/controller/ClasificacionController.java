package com.sistemafact.productoservice.controller;

import com.sistemafact.productoservice.model.Clasificacion;
import com.sistemafact.productoservice.repository.ClasificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/clasificaciones")
public class ClasificacionController {

    @Autowired
    private ClasificacionRepository clasificacionRepository;

    @GetMapping
    public List<Clasificacion> getAllClasificaciones() {
        return clasificacionRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clasificacion> getClasificacionById(@PathVariable int id) {
        Optional<Clasificacion> clasificacion = clasificacionRepository.findById(id);
        return clasificacion.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Clasificacion createClasificacion(@RequestBody Clasificacion clasificacion) {
        return clasificacionRepository.save(clasificacion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Clasificacion> updateClasificacion(@PathVariable int id, @RequestBody Clasificacion clasificacionDetails) {
        return clasificacionRepository.findById(id).map(c -> {
            c.setGrupo(clasificacionDetails.getGrupo());
            return ResponseEntity.ok(clasificacionRepository.save(c));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClasificacion(@PathVariable int id) {
        if (clasificacionRepository.existsById(id)) {
            clasificacionRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
