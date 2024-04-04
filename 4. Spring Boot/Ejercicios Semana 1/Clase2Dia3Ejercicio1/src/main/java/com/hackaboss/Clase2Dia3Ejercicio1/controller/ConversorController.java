package com.hackaboss.Clase2Dia3Ejercicio1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {
@GetMapping("/convertir")
    public String convertirCentimetrosAMetros(@RequestParam int centimetros) {
        double metros = centimetros / 100.0;
        //Usamos %.2f para mostrar dos decimales
        return "El equivalente a "+centimetros+" cm es de "+String.format("%.2f", metros)+" metros";
    }
}
