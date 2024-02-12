package dev.thallesrafael.apicurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.thallesrafael.apicurso.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {

    
    
}
