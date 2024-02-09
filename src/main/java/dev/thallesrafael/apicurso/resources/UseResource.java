package dev.thallesrafael.apicurso.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dev.thallesrafael.apicurso.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UseResource {
    
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1, "Thalles", "thalles@gmail.com", "9999999", "123456");
        return ResponseEntity.ok().body(u);
    }

}
