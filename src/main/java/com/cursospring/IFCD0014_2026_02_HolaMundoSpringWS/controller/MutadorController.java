package com.cursospring.IFCD0014_2026_02_HolaMundoSpringWS.controller;

import com.cursospring.IFCD0014_2026_02_HolaMundoSpringWS.model.Animal;
import com.cursospring.IFCD0014_2026_02_HolaMundoSpringWS.services.MutadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MutadorController {
    @Autowired
    MutadorService mutadorService;

    @GetMapping("/mutar")
    public Animal mutar(@RequestBody(required = true) Animal animal) {
        return mutadorService.mutar(animal);
    }
}
