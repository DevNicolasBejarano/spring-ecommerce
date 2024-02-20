package com.curso.ecommerce.service;

import com.curso.ecommerce.model.Producto;
import com.curso.ecommerce.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    private IProductoRepository iProductoRepository;

    @Override
    public Producto save(Producto producto) {
        return iProductoRepository.save((producto));
    }

    @Override
    public Optional<Producto> get(Integer id) {
        return iProductoRepository.findById(id);
    }

    @Override
    public void update(Producto producto) {
        iProductoRepository.save(producto);
    }

    @Override
    public void delete(Integer id) {
        iProductoRepository.deleteById(id);
    }
}
