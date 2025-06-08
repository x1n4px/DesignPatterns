package com.DesignPattern.Hexagonal.application.service;

import com.DesignPattern.Hexagonal.domain.model.Product;
import com.DesignPattern.Hexagonal.domain.port.input.ProductUseCase;
import com.DesignPattern.Hexagonal.domain.port.output.ProductRepositoryPort;

import java.util.List;

public class ProductService implements ProductUseCase {
    private final ProductRepositoryPort repository;

    public ProductService(ProductRepositoryPort repository) {
        this.repository = repository;
    }


    @Override
    public Product createProduct(String name) {
        return repository.save(new Product(null, name));
    }

    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }
}
