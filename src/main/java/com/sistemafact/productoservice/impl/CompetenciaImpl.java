package com.sistemafact.productoservice.impl;

import com.sistemafact.productoservice.model.Competencia;
import com.sistemafact.productoservice.repository.CompetenciaRepository;
import com.sistemafact.productoservice.services.CompetenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetenciaImpl implements CompetenciaService {

    @Autowired
    private CompetenciaRepository competenciaRepository;

    @Override
    public List<Competencia> findAll() {
        return competenciaRepository.findAll();
    }

    @Override
    public Competencia save(Competencia competencia) {
        return competenciaRepository.save(competencia);
    }

    @Override
    public Competencia findById(Integer id) {
        return competenciaRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        competenciaRepository.deleteById(id);
    }
}
