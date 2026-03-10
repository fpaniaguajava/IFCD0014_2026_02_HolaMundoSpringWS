package com.cursospring.IFCD0014_2026_02_HolaMundoSpringWS.services;

import com.cursospring.IFCD0014_2026_02_HolaMundoSpringWS.model.Animal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class MutadorService {
    public Animal mutar(Animal animal) {
        List<String> animales = new ArrayList<>();
        animales.add("Tigre");
        animales.add("Burro");
        animales.add("Mosca");
        animal.setEspecie("Tigre");
        Random rand = new Random();
        int indiceAleatorio = rand.nextInt(animales.size());
        animal.setEspecie(animales.get(indiceAleatorio));
        return animal;
    }
}
