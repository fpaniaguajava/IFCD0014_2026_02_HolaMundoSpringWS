package com.cursospring.IFCD0014_2026_02_HolaMundoSpringWS.controller;

import com.cursospring.IFCD0014_2026_02_HolaMundoSpringWS.model.Resultado;
import com.cursospring.IFCD0014_2026_02_HolaMundoSpringWS.services.CalculadoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
    @Autowired
    private CalculadoraService calculadoraService;

    @GetMapping("/sumar")
    public Resultado sumar(@RequestParam Integer numero1, @RequestParam Integer numero2){
        Integer resultado = calculadoraService.sumar(numero1, numero2);
        Resultado objResultado = new Resultado(resultado);
        return objResultado;
    }

    @GetMapping("/restar")
    public ResponseEntity<Resultado> restar(@RequestParam Integer numero1, @RequestParam Integer numero2){
        Integer resultado = calculadoraService.restar(numero1, numero2);
        Resultado objResultado = new Resultado(resultado);
        if (numero1==0 && numero2==0) {
            return ResponseEntity.unprocessableContent().build();
        }
        return ResponseEntity.ok(objResultado);
    }
}
