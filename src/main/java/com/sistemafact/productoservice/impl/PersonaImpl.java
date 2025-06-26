package com.sistemafact.productoservice.impl;

import com.sistemafact.productoservice.model.Persona;
import com.sistemafact.productoservice.repository.PersonaRepository;
import com.sistemafact.productoservice.services.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaImpl implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    @Override
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @Override
    public Persona save(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona findById(Integer id) {
        return personaRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        personaRepository.deleteById(id);
    }
}
