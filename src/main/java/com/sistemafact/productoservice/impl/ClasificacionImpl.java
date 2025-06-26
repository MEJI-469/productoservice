package com.sistemafact.productoservice.impl;

import com.sistemafact.productoservice.model.Clasificacion;
import com.sistemafact.productoservice.repository.ClasificacionRepository;
import com.sistemafact.productoservice.services.ClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClasificacionImpl implements ClasificacionService {

    @Autowired
    private ClasificacionRepository clasificacionRepository;

    @Override
    public List<Clasificacion> findAll() {
        return clasificacionRepository.findAll();
    }

    @Override
    public Clasificacion save(Clasificacion clasificacion) {
        return clasificacionRepository.save(clasificacion);
    }

    @Override
    public Clasificacion findById(Integer id) {
        return clasificacionRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        clasificacionRepository.deleteById(id);
    }
}
