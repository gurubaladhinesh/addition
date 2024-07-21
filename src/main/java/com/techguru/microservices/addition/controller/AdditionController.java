package com.techguru.microservices.addition.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdditionController {


    @GetMapping
    public ResponseEntity<Double> add(@RequestParam List<Double> n) {
        double result = 0.0;
        if (n != null) {
            result = n.stream().mapToDouble(x -> x).sum();
        }
        return ResponseEntity.ok(result);
    }

}
