import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Evento> eventos = Arrays.asList(
                new Evento("Reunión", "2024-03-15", "Reunión"),
                new Evento("Conferencia", "2024-03-17", "Conferencia"),
                new Evento("Taller", "2024-03-18", "Taller"),
                new Evento("Reunión", "2024-03-20", "Reunión"),
                new Evento("Conferencia", "2024-03-22", "Conferencia")
        );

                // Filtramos los eventos que están programados para una fecha específica
                String fechaEspecifica = "2024-03-17";
        List<Evento> eventosFiltrados = eventos.stream()
                .filter(evento -> evento.getFecha().equals(fechaEspecifica))
                .collect(Collectors.toList());
        System.out.println("Eventos programados para el " +fechaEspecifica+ ":");
        eventosFiltrados.forEach(evento -> System.out.println(evento.getNombre()));

        // Agrupamos los eventos por categoría y contamos cuántos eventos hay en cada categoría
        Map<String, Long> eventosPorCategoria = eventos.stream()
                .collect(Collectors.groupingBy(Evento::getCategoria, Collectors.counting()));
        System.out.println("\nNúmero de eventos por categoría:");
        eventosPorCategoria.forEach((categoria, cantidad) ->
                System.out.println(categoria+ ": "+cantidad));

        // Encontramos el evento más próximo en el tiempo utilizando Optionals
        Optional<Evento> eventoMasProximo = eventos.stream()
                .min((e1, e2) -> e1.getFecha().compareTo(e2.getFecha()));
        eventoMasProximo.ifPresent(evento ->
                System.out.println("\nEl evento más próximo es: "+evento.getNombre()+
                        " (Fecha: "+evento.getFecha()+")"));

    }
}