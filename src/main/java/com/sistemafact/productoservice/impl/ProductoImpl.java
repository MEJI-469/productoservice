package com.sistemafact.productoservice.impl;

import com.sistemafact.productoservice.model.Producto;
import com.sistemafact.productoservice.repository.ProductoRepository;
import com.sistemafact.productoservice.services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoImpl implements ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public Producto findById(Integer id) {
        return productoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        productoRepository.deleteById(id);
    }
}
