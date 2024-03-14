import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        InventarioAuto<Auto> inventarioAutos = new InventarioAuto<>();

        inventarioAutos.agregarAuto(Arrays.asList(
                new Auto("Toyota", "Corolla", "2020", 25000.0),
                new Auto("Honda", "Civic", "2019", 22000.0),
                new Auto("Ford", "Mustang", "2022", 45000.0),
                new Auto("Chevrolet", "Camaro", "2021", 50000.0),
                new Auto("Toyota", "Rav4", "2020", 28000.0)
        ));

        // Buscamos autos por marca
        String marcaABuscar = "Toyota";
        List<Auto> autosPorMarca = inventarioAutos.buscarPorMarca(marcaABuscar);
        System.out.println("Autos de la marca '"+ marcaABuscar+ "':");
        for (Auto auto : autosPorMarca) {
            System.out.println(auto);
        }

        // Buscamos autos por año
        int añoABuscar = 2020;
        List<Auto> autosPorAño = inventarioAutos.buscarPorAño(añoABuscar);
        System.out.println("\nAutos del año "+añoABuscar+ ":");
        for (Auto auto : autosPorAño) {
            System.out.println(auto);
        }

        // Calculamos el valor total del inventario
        double valorTotalInventario = inventarioAutos.calcularValorTotal();
        System.out.println("\nValor total del inventario: $"+ valorTotalInventario);
    }
}
