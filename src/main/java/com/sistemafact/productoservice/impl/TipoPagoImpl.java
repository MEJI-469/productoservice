package com.sistemafact.productoservice.impl;

import com.sistemafact.productoservice.model.TipoPago;
import com.sistemafact.productoservice.repository.TipoPagoRepository;
import com.sistemafact.productoservice.services.TipoPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoPagoImpl implements TipoPagoService {

    @Autowired
    private TipoPagoRepository tipoPagoRepository;

    @Override
    public List<TipoPago> findAll() {
        return tipoPagoRepository.findAll();
    }

    @Override
    public TipoPago save(TipoPago tipoPago) {
        return tipoPagoRepository.save(tipoPago);
    }

    @Override
    public TipoPago findById(Integer id) {
        return tipoPagoRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        tipoPagoRepository.deleteById(id);
    }
}
