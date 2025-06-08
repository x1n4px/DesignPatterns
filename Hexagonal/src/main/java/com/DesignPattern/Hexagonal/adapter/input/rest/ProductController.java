package com.DesignPattern.Hexagonal.adapter.input.rest;

import com.DesignPattern.Hexagonal.DTO.CreateProductRequest;
import com.DesignPattern.Hexagonal.domain.model.Product;
import com.DesignPattern.Hexagonal.domain.port.input.ProductUseCase;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductUseCase useCase;

    public ProductController(ProductUseCase useCase) {
        this.useCase = useCase;
    }

    @PostMapping
    public Product create(@RequestBody CreateProductRequest request) {
        System.out.println(request.getName());
        return useCase.createProduct(request.getName());
    }

    @GetMapping
    public List<Product> all() {
        return useCase.getAllProducts();
    }
}
