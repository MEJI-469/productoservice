package com.sistemafact.productoservice.controller;

import com.sistemafact.productoservice.model.TipoPago;
import com.sistemafact.productoservice.repository.TipoPagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tipo-pago")
public class TipoPagoController {

    @Autowired
    private TipoPagoRepository tipoPagoRepository;

    @GetMapping
    public List<TipoPago> getAllTiposPago() {
        return tipoPagoRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoPago> getTipoPagoById(@PathVariable int id) {
        Optional<TipoPago> tipo = tipoPagoRepository.findById(id);
        return tipo.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TipoPago createTipoPago(@RequestBody TipoPago tipoPago) {
        return tipoPagoRepository.save(tipoPago);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TipoPago> updateTipoPago(@PathVariable int id, @RequestBody TipoPago tipoDetails) {
        return tipoPagoRepository.findById(id).map(tp -> {
            tp.setTipo_pago(tipoDetails.getTipo_pago());
            return ResponseEntity.ok(tipoPagoRepository.save(tp));
        }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTipoPago(@PathVariable int id) {
        if (tipoPagoRepository.existsById(id)) {
            tipoPagoRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
