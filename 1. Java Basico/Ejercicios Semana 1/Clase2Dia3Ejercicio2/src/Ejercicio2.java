import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        //a) Imagina que eres un cajero en un supermercado. Crea un programa en Java
        // que permita ingresar el precio de varios productos comprados por un cliente.
        //
        //Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo
        // precios hasta que el usuario decida finalizar. Luego, muestra el total de la compra que debe abonar.
        //
        //Pista: Recuerda que existen dos tipos de bucles, los controlados
        // por un contador (cuando sabemos un número exacto de productos por ejemplo)
        // o por centinela (cuando no sabemos cuántos productos va a comprar el cliente).
        // En este caso debes aplicar un “centinela”. Un ejemplo podría ser,
        // si se ingresa un número negativo o un 0 como monto de un producto.

        Scanner scanner = new Scanner(System.in);
        double precio = 0;
        boolean bandera = false;
        double total = 0;

        System.out.println("Ingresa el precio de cada producto, escribe 0 o un número negativo para finalizar");

        while (bandera!=true){
            System.out.println("Ingresa el siguiente precio");
            precio = scanner.nextDouble();
            total += precio;
            if (precio<=0){
                bandera = true;
            }
        }
        System.out.println("El total de la compra es "+total);
    }
}