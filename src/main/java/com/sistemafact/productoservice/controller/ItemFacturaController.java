package com.sistemafact.productoservice.controller;

import com.sistemafact.productoservice.model.ItemFactura;
import com.sistemafact.productoservice.repository.ItemFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/items")
public class ItemFacturaController {

    @Autowired
    private ItemFacturaRepository itemFacturaRepository;

    @GetMapping
    public List<ItemFactura> getAllItems() {
        return itemFacturaRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemFactura> getItemById(@PathVariable int id) {
        Optional<ItemFactura> item = itemFacturaRepository.findById(id);
        return item.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ItemFactura createItem(@RequestBody ItemFactura itemFactura) {
        return itemFacturaRepository.save(itemFactura);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemFactura> updateItem(@PathVariable int id, @RequestBody ItemFactura itemDetails) {
        Optional<ItemFactura> optionalItem = itemFacturaRepository.findById(id);
        if (optionalItem.isPresent()) {
            ItemFactura item = optionalItem.get();

            item.setCantidad(itemDetails.getCantidad());
            item.setPrecio(itemDetails.getPrecio());
            item.setSubtotal(itemDetails.getSubtotal());
            item.setProducto(itemDetails.getProducto());
            item.setFactura(itemDetails.getFactura());

            return ResponseEntity.ok(itemFacturaRepository.save(item));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable int id) {
        if (itemFacturaRepository.existsById(id)) {
            itemFacturaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
