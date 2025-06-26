package com.sistemafact.productoservice.services;

import com.sistemafact.productoservice.model.Persona;

import java.util.List;

public interface PersonaService {

    List<Persona> findAll();

    Persona save(Persona persona);

    Persona findById(Integer idPersona);

    void delete(Integer idPersona);
}
