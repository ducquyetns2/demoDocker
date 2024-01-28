package com.example.demoDocker;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class HomeController {
    private final UserRepository userRepository;
    @GetMapping("/")
    ResponseEntity<String> home() {
        return new ResponseEntity<>("this is home page",HttpStatus.FOUND);
    }
    @GetMapping("/user")
    List<User> user() {
        System.out.println("IS find122222");
        return userRepository.findAll();
    }
}
