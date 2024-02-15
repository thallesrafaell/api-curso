package dev.thallesrafael.apicurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.thallesrafael.apicurso.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


    
}
