package org.salesAPI.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// TestKlasse, um zu testen, dass die RESTfull API läuft
// Eingabe im Browser: http://localhost:8080/hello
@RestController
public class Test {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hallo, IT-KLasse!";
    }
}