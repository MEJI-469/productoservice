package com.sistemafact.productoservice.impl;

import com.sistemafact.productoservice.model.Factura;
import com.sistemafact.productoservice.repository.FacturaRepository;
import com.sistemafact.productoservice.services.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaImpl implements FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public List<Factura> findAll() {
        return facturaRepository.findAll();
    }

    @Override
    public Factura save(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    public Factura findById(Integer id) {
        return facturaRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        facturaRepository.deleteById(id);
    }
}
