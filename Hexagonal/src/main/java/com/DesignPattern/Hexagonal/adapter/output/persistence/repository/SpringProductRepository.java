package com.DesignPattern.Hexagonal.adapter.output.persistence.repository;

import com.DesignPattern.Hexagonal.adapter.output.persistence.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringProductRepository extends JpaRepository<ProductEntity, Long> {
}
