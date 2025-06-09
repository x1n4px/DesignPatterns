package com.DesignPattern.Hexagonal.infraestructure.repositories;

import com.DesignPattern.Hexagonal.infraestructure.entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {
}