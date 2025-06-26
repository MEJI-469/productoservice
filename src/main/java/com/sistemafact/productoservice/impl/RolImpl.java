package com.sistemafact.productoservice.impl;

import com.sistemafact.productoservice.model.Rol;
import com.sistemafact.productoservice.repository.RolRepository;
import com.sistemafact.productoservice.services.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolImpl implements RolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> findAll() {
        return rolRepository.findAll();
    }

    @Override
    public Rol save(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public Rol findById(Integer id) {
        return rolRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        rolRepository.deleteById(id);
    }
}
