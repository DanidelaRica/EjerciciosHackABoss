package com.hackaboss.Clase3Dia4Ejercicio1.controller;

import com.hackaboss.Clase3Dia4Ejercicio1.model.Evento;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/eventos")
public class EventoController {
    List<Evento> eventos = new ArrayList<>();

    {
        // Agregar eventos de ejemplo
        eventos.add(new Evento(1L, "Conferencia de Java", LocalDate.of(2024, 5, 15), "10:00","Una conferencia sobre programación en Java"));
        eventos.add(new Evento(2L, "Taller de Spring Boot", LocalDate.of(2024, 6, 10), "14:00","Un taller práctico sobre el uso de Spring Boot"));
    }

    @GetMapping
    public List<Evento> obtenerEventosProximos() {
        // Filtrar eventos cuya fecha sea después de la fecha actual
        return eventos.stream()
                .filter(evento -> evento.getFecha().isAfter(LocalDate.now()))
                .toList(); // Convertir el stream de eventos filtrados a una lista
    }

    @GetMapping("/{id}")
    public Evento obtenerEventoPorId(@PathVariable int id) {
        // Encontrar el primer evento cuyo ID coincida con el proporcionado
        return eventos.stream()
                .filter(evento -> evento.getId() == id)
                .findFirst() // Obtener el primer elemento del stream
                .orElse(null); // Devolver null si no se encuentra ningún evento
    }

    @PostMapping
    public String crearEvento(@RequestBody Evento evento) {
         eventos.add(evento);
        return "Evento creado exitosamente "+evento.getNombre();
    }
}
