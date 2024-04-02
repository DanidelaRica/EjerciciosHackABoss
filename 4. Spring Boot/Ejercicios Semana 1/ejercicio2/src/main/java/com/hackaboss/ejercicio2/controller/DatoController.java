package com.hackaboss.ejercicio2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class DatoController {
@GetMapping
    public String datoCuriosoAleatorio() {

        List<String> datos = new ArrayList<>();

        datos.add("Los delfines tienen la capacidad de reconocer y recordar estos silbidos especificos incluso despues de mucho tiempo");
        datos.add("Las hormigas son capaces de llevar objetos que son hasta 50 veces su propio peso");
        datos.add("La Estatua de la Libertad fue en su dia un faro");
        datos.add("WeChat de China es mas grande que Instagram");
        datos.add("Facebook es azul debido a que Mark Zuckerberg es daltónico");

        return datos.get(new Random().nextInt(datos.size()));
    }
}
