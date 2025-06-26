package com.sistemafact.productoservice.impl;

import com.sistemafact.productoservice.model.RolCompetencia;
import com.sistemafact.productoservice.repository.RolCompetenciaRepository;
import com.sistemafact.productoservice.services.RolCompetenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolCompetenciaImpl implements RolCompetenciaService {

    @Autowired
    private RolCompetenciaRepository rolCompetenciaRepository;

    @Override
    public List<RolCompetencia> findAll() {
        return rolCompetenciaRepository.findAll();
    }

    @Override
    public RolCompetencia save(RolCompetencia rolCompetencia) {
        return rolCompetenciaRepository.save(rolCompetencia);
    }

    @Override
    public RolCompetencia findById(Integer id) {
        return rolCompetenciaRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        rolCompetenciaRepository.deleteById(id);
    }
}
