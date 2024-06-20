package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Główna klasa aplikacji Spring Boot.
 */
@SpringBootApplication
public class SpringBootExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootExampleApplication.class, args);
    }
}

/**
 * Kontroler obsługujący żądania HTTP.
 */
@RestController
class HelloController {

    /**
     * Obsługa żądania GET na endpoint "/hello".
     * @param name opcjonalny parametr zapytania "name"
     * @return odpowiedź tekstowa
     */
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "Świecie") String name) {
        return String.format("Witaj, %s!", name);
    }
}
