package com.cursospring.IFCD0014_2026_02_HolaMundoSpringWS.services;

import com.cursospring.IFCD0014_2026_02_HolaMundoSpringWS.model.Saludo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SaludadorService {
    public List<Saludo> getSaludos(String nombre) {
        List<Saludo> saludos = new ArrayList<>();
        saludos.add(new Saludo("Hola, " + nombre));
        saludos.add(new Saludo("Hi, " + nombre));
        saludos.add(new Saludo("Merhaba, " + nombre));
        return saludos;
    }
}
