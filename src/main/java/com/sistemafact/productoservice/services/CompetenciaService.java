package com.sistemafact.productoservice.services;

import com.sistemafact.productoservice.model.Competencia;

import java.util.List;

public interface CompetenciaService {

    List<Competencia> findAll();

    Competencia save(Competencia competencia);

    Competencia findById(Integer idCompetencia);

    void delete(Integer idCompetencia);
}
