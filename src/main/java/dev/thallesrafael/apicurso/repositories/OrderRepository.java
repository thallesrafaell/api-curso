package dev.thallesrafael.apicurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.thallesrafael.apicurso.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {


    
}
