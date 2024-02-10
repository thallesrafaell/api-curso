package dev.thallesrafael.apicurso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.thallesrafael.apicurso.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {


    
}
