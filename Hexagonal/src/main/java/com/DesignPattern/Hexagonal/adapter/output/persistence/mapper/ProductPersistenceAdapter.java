package com.DesignPattern.Hexagonal.adapter.output.persistence.mapper;

import com.DesignPattern.Hexagonal.adapter.output.persistence.entity.ProductEntity;
import com.DesignPattern.Hexagonal.adapter.output.persistence.repository.SpringProductRepository;
import com.DesignPattern.Hexagonal.domain.model.Product;
import com.DesignPattern.Hexagonal.domain.port.output.ProductRepositoryPort;

import java.util.List;
import java.util.stream.Collectors;

public class ProductPersistenceAdapter implements ProductRepositoryPort {

    private final SpringProductRepository repository;

    public ProductPersistenceAdapter(SpringProductRepository repository) {
        this.repository = repository;
    }


    @Override
    public Product save(Product product) {
        ProductEntity entity = new ProductEntity();
        System.out.println(product);
        entity.setName(product.getName());
        ProductEntity saved = repository.save(entity);
        return new Product(saved.getId(), saved.getName());
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll().stream()
                .map(e -> new Product(e.getId(), e.getName()))
                .collect(Collectors.toList());
    }
}
