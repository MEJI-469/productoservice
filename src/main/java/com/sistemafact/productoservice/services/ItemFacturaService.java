package com.sistemafact.productoservice.services;

import com.sistemafact.productoservice.model.ItemFactura;

import java.util.List;

public interface ItemFacturaService {

    List<ItemFactura> findAll();

    ItemFactura save(ItemFactura itemFactura);

    ItemFactura findById(Integer idItemFactura);

    void delete(Integer idItemFactura);
}
