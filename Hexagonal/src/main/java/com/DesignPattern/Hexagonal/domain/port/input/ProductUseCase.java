package com.DesignPattern.Hexagonal.domain.port.input;

import com.DesignPattern.Hexagonal.domain.model.Product;

import java.util.List;

public interface ProductUseCase {
    Product createProduct(String name);
    List<Product> getAllProducts();
}
