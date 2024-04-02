package com.hackaboss.ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class RefranController {

    @GetMapping
    public String refranAleatorio() {

        List<String> refranes = new ArrayList<>();

        refranes.add("No hay mal que por bien no venga");
        refranes.add("Al que madruga Dios lo ayuda");
        refranes.add("No dejes para mañana lo que puedas hacer hoy");
        refranes.add("La práctica hace al maestro");
        refranes.add("La unión hace la fuerza");
        refranes.add("Dime con quién andas y te diré quién eres");

        // Obtener un refrán aleatorio de la lista
        return refranes.get(new Random().nextInt(refranes.size()));
    }
}

