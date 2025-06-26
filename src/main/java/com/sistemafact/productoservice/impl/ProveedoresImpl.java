package com.sistemafact.productoservice.impl;

import com.sistemafact.productoservice.model.Proveedores;
import com.sistemafact.productoservice.repository.ProveedoresRepository;
import com.sistemafact.productoservice.services.ProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedoresImpl implements ProveedoresService {

    @Autowired
    private ProveedoresRepository proveedorRepository;

    @Override
    public List<Proveedores> findAll() {
        return proveedorRepository.findAll();
    }

    @Override
    public Proveedores save(Proveedores proveedor) {
        return proveedorRepository.save(proveedor);
    }

    @Override
    public Proveedores findById(Integer id) {
        return proveedorRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        proveedorRepository.deleteById(id);
    }
}
