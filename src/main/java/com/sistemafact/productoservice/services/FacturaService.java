package com.sistemafact.productoservice.services;

import com.sistemafact.productoservice.model.Factura;

import java.util.List;

public interface FacturaService {

    List<Factura> findAll();

    Factura save(Factura factura);

    Factura findById(Integer idFactura);

    void delete(Integer idFactura);
}
