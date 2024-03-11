import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> inventario = new ArrayList<>();

        System.out.println("Bienvenido al sistema de gestión de inventarios.");

        // Agregar productos al inventario
        while (true) {
            try {
                System.out.println("Ingrese el nombre del producto (o escriba 'fin' para terminar):");
                String nombre = scanner.nextLine();

                if (nombre.equalsIgnoreCase("fin")) {
                    break;
                }

                System.out.println("Ingrese el precio del producto:");
                double precio = scanner.nextDouble();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                if (precio <= 0) {
                    throw new IllegalArgumentException("El precio del producto debe ser mayor que cero.");
                }

                System.out.println("Ingrese la cantidad disponible del producto:");
                int cantidad = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea pendiente

                if (cantidad < 0) {
                    throw new IllegalArgumentException("La cantidad del producto no puede ser negativa.");
                }

                Producto producto = new Producto(nombre, precio, cantidad);
                inventario.add(producto);

                System.out.println("Producto agregado al inventario: " + producto);
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un valor numérico válido.");
                scanner.nextLine(); // Limpiar el búfer de entrada
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Imprimir el inventario
        System.out.println("Inventario:");
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }
}