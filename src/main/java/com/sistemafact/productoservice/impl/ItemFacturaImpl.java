package com.sistemafact.productoservice.impl;

import com.sistemafact.productoservice.model.ItemFactura;
import com.sistemafact.productoservice.repository.ItemFacturaRepository;
import com.sistemafact.productoservice.services.ItemFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemFacturaImpl implements ItemFacturaService {

    @Autowired
    private ItemFacturaRepository itemFacturaRepository;

    @Override
    public List<ItemFactura> findAll() {
        return itemFacturaRepository.findAll();
    }

    @Override
    public ItemFactura save(ItemFactura itemFactura) {
        return itemFacturaRepository.save(itemFactura);
    }

    @Override
    public ItemFactura findById(Integer id) {
        return itemFacturaRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        itemFacturaRepository.deleteById(id);
    }
}
