package com.sistemafact.productoservice.controller;

import com.sistemafact.productoservice.model.Factura;
import com.sistemafact.productoservice.model.ItemFactura;
import com.sistemafact.productoservice.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {

    @Autowired
    private FacturaRepository facturaRepository;

    @GetMapping
    public List<Factura> getAllFacturas() {
        return facturaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Factura> getFacturaById(@PathVariable int id) {
        Optional<Factura> factura = facturaRepository.findById(id);
        return factura.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Factura createFactura(@RequestBody Factura factura) {
        // Asignar esta factura a todos sus ítems
        if (factura.getItems() != null) {
            for (ItemFactura item : factura.getItems()) {
                item.setFactura(factura); // clave
            }
        }
        return facturaRepository.save(factura);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Factura> updateFactura(@PathVariable int id, @RequestBody Factura facturaDetails) {
        Optional<Factura> optionalFactura = facturaRepository.findById(id);
        if (optionalFactura.isPresent()) {
            Factura factura = optionalFactura.get();

            factura.setRuc(facturaDetails.getRuc());
            factura.setFecha(facturaDetails.getFecha());
            factura.setDescuento(facturaDetails.getDescuento());
            factura.setTotal(facturaDetails.getTotal());
            factura.setPersona(facturaDetails.getPersona());
            factura.setTipoPago(facturaDetails.getTipoPago());

            if (facturaDetails.getItems() != null) {
                for (ItemFactura item : facturaDetails.getItems()) {
                    item.setFactura(factura); // clave para mantener la relación
                }
                factura.setItems(facturaDetails.getItems());
            }

            return ResponseEntity.ok(facturaRepository.save(factura));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFactura(@PathVariable int id) {
        if (facturaRepository.existsById(id)) {
            facturaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
