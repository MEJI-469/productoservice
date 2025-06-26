package com.sistemafact.productoservice.services;

import com.sistemafact.productoservice.model.Proveedores;

import java.util.List;

public interface ProveedoresService {

    List<Proveedores> findAll();

    Proveedores save(Proveedores proveedor);

    Proveedores findById(Integer idProveedor);

    void delete(Integer idProveedor);
}
