package com.DesignPattern.Hexagonal.domain.port.output;

import com.DesignPattern.Hexagonal.domain.model.Product;

import java.util.List;

public interface ProductRepositoryPort {
    Product save(Product product);
    List<Product> findAll();
}
