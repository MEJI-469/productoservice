package com.sistemafact.productoservice.controller;

import com.sistemafact.productoservice.model.Proveedores;
import com.sistemafact.productoservice.repository.ProveedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/proveedores")
public class ProveedoresController {

    @Autowired
    private ProveedoresRepository proveedoresRepository;

    @GetMapping
    public List<Proveedores> getAllProveedores() {
        return proveedoresRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Proveedores> getProveedorById(@PathVariable int id) {
        Optional<Proveedores> proveedor = proveedoresRepository.findById(id);
        return proveedor.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Proveedores createProveedor(@RequestBody Proveedores proveedor) {
        return proveedoresRepository.save(proveedor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Proveedores> updateProveedor(@PathVariable int id, @RequestBody Proveedores detalles) {
        return proveedoresRepository.findById(id).map(p -> {
            p.setRuc(detalles.getRuc());
            p.setTelefono(detalles.getTelefono());
            p.setPais(detalles.getPais());
            p.setCorreo(detalles.getCorreo());
            p.setMoneda(detalles.getMoneda());
            return ResponseEntity.ok(proveedoresRepository.save(p));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProveedor(@PathVariable int id) {
        if (proveedoresRepository.existsById(id)) {
            proveedoresRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
