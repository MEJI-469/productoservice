package com.sistemafact.productoservice.services;

import com.sistemafact.productoservice.model.Rol;

import java.util.List;

public interface RolService {

    List<Rol> findAll();

    Rol save(Rol rol);

    Rol findById(Integer idRol);

    void delete(Integer idRol);
}
