package dev.thallesrafael.apicurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.thallesrafael.apicurso.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {

    
    
}
