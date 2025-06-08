package com.DesignPattern.Hexagonal.config;

import com.DesignPattern.Hexagonal.adapter.output.persistence.mapper.ProductPersistenceAdapter;
import com.DesignPattern.Hexagonal.adapter.output.persistence.repository.SpringProductRepository;
import com.DesignPattern.Hexagonal.application.service.ProductService;
import com.DesignPattern.Hexagonal.domain.port.input.ProductUseCase;
import com.DesignPattern.Hexagonal.domain.port.output.ProductRepositoryPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public ProductRepositoryPort productRepositoryPort(SpringProductRepository repository) {
        return new ProductPersistenceAdapter(repository);
    }

    @Bean
    public ProductUseCase productUseCase(ProductRepositoryPort repositoryPort) {
        return new ProductService(repositoryPort);
    }
}
