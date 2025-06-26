package com.sistemafact.productoservice.services;

import com.sistemafact.productoservice.model.Producto;

import java.util.List;

public interface ProductoService {

    List<Producto> findAll();

    Producto save(Producto producto);

    Producto findById(Integer idProducto);

    void delete(Integer idProducto);
}
