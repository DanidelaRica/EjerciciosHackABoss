import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //Crea una aplicación que maneje información sobre empleados. Cada empleado tiene un nombre,
        // un salario y una categoría (por ejemplo, "Desarrollador", "Analista", "Gerente").
        // Implementa las siguientes operaciones utilizando Streams y Optionals:
        //
        //Filtra los empleados cuyo salario sea mayor a cierto valor específico.
        //
        //Agrupa los empleados por categoría y calcula el salario promedio para cada categoría.
        //
        //Encuentra al empleado con el salario más alto utilizando Optionals.

        List<Empleado> empleados = Arrays.asList(new Empleado("Juan", 3000.0, "Desarrollador"),
                new Empleado("María", 4000.0, "Desarrollador"),
                new Empleado("Pedro", 5000.0, "Analista"),
                new Empleado("Ana", 6000.0, "Gerente"),
                new Empleado("Luis", 7000.0, "Gerente"));

        // Filtramos los empleados cuyo salario sea mayor a 5000
        List<Empleado> empleadosFiltrados = empleados.stream()
                .filter(e -> e.getSalario() > 5000)
                .collect(Collectors.toList());
        System.out.println("Empleados con un salario mayor a 5000: ");
        empleadosFiltrados.forEach(e-> System.out.println(e.getNombre()));

        // Agrupamos los empleados por categoría y calcular el salario promedio para cada categoría
        Map<String, Double> salarioPromedioPorCategoria = empleados.stream()
                .collect(Collectors.groupingBy(Empleado::getCategoria,
                        Collectors.averagingDouble(Empleado::getSalario)));
        System.out.println("\nSalario promedio por categoría:");
        salarioPromedioPorCategoria.forEach((categoria, salarioPromedio) ->
                System.out.println(categoria+" : $"+salarioPromedio));

        // Encontrarmosal empleado con el salario más alto utilizando Optionals
        Optional<Empleado> empleadoSalarioMasAlto = empleados.stream()
                .max((e1, e2) -> Double.compare(e1.getSalario(), e2.getSalario()));
        empleadoSalarioMasAlto.ifPresent(empleado ->
                System.out.println("\nEmpleado con el salario más alto: "+empleado.getNombre()+
                        " (Salario: $"+empleado.getSalario()+ ")"));

    }
}