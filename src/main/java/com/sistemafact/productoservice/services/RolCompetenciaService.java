package com.sistemafact.productoservice.services;

import com.sistemafact.productoservice.model.RolCompetencia;

import java.util.List;

public interface RolCompetenciaService {

    List<RolCompetencia> findAll();

    RolCompetencia save(RolCompetencia rolCompetencia);

    RolCompetencia findById(Integer idRolCompetencia);

    void delete(Integer idRolCompetencia);
}
