package com.sistemafact.productoservice.services;

import com.sistemafact.productoservice.model.TipoPago;

import java.util.List;

public interface TipoPagoService {

    List<TipoPago> findAll();

    TipoPago save(TipoPago tipoPago);

    TipoPago findById(Integer idTipoPago);

    void delete(Integer idTipoPago);
}
