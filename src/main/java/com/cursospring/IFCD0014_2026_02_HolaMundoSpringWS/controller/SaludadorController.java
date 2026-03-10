package com.cursospring.IFCD0014_2026_02_HolaMundoSpringWS.controller;

import com.cursospring.IFCD0014_2026_02_HolaMundoSpringWS.model.Saludo;
import com.cursospring.IFCD0014_2026_02_HolaMundoSpringWS.services.SaludadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class SaludadorController {
    @Autowired
    private SaludadorService saludadorService;

    @GetMapping("/")
    public List<Saludo> saludar(@RequestParam String nombre){
        List<Saludo> saludos = saludadorService.getSaludos(nombre);
        return saludos;
    }
}
