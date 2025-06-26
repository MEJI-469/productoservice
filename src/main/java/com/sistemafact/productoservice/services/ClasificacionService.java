package com.sistemafact.productoservice.services;

import com.sistemafact.productoservice.model.Clasificacion;

import java.util.List;

public interface ClasificacionService {

    List<Clasificacion> findAll();

    Clasificacion save(Clasificacion clasificacion);

    Clasificacion findById(Integer idClasificacion);

    void delete(Integer idClasificacion);
}
