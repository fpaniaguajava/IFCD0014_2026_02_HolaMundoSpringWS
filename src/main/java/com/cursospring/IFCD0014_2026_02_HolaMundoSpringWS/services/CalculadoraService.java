package com.cursospring.IFCD0014_2026_02_HolaMundoSpringWS.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public Integer sumar(Integer numero1, Integer numero2) {
        return numero1+numero2;
    }
}
