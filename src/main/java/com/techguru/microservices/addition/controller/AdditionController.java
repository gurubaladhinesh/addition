package com.techguru.microservices.addition.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/add")
public class AdditionController {

    @GetMapping
    public ResponseEntity<Double> add(@RequestParam List<Double> n) {
        double result = 0.0;
        if (Objects.nonNull(n)) {
            result = n.stream().mapToDouble(x -> x).sum();
        }
        return ResponseEntity.ok(result);
    }

}
