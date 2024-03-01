import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. Crea un programa en Java que
        // represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:
        //
        //Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").
        //
        //Permite al usuario ingresar por teclado donde quiere sentarse, indicando
        // su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2"). El programa debe marcar
        // como ocupado ese asiento solo en caso de que esté vacío.
        //
        //Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.
        //
        //A medida que los asientos se ocupen, el programa debe actualizar el mapa
        // de asientos y mostrarlo por pantalla luego de cada reserva.
        //
        //Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores
        // y tú el encargado del teatro. ¿Funciona para todos los casos?
        // ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?
        //
        //El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas
        // de los asientos determine que ha finalizado.
        //
        //Pista: Puedes preguntar en cada “vuelta” del bucle, si esta ha sido la última compra.

        char[][] asientos = new char[5][5];
        int fila, asiento, opcion;
        boolean bandera = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cargando asientos");

        for (int f = 0; f < asientos.length; f++) {
            for (int c = 0; c < asientos[0].length; c++) {
                asientos[f][c] = 'O';
            }
        }

        dibujarMapa(asientos);
        while (!bandera) {
            System.out.println("Ingrese la fila (Valor entre 0 y 4): ");
            fila = scanner.nextInt();

            System.out.println("Ingrese el asiento (Valor entre 0 y 4): ");
            asiento = scanner.nextInt();

            if (fila >= 0 && fila <= 4 && asiento >= 0 && asiento <= 4) {
                if (asientos[fila][asiento] == 'O') {
                    asientos[fila][asiento] = 'X';
                    System.out.println("Asiento asignado correctamente");
                } else {
                    System.out.println("Asiento ocupado, elija otro");
                }
            } else {
                System.out.println("Fila o asiento fuera de rango, por favor ingrese nuevamente");
            }

            dibujarMapa(asientos);

            System.out.println("¿Desea continuar cargando reservas? (1: Sí / 0: No)");
            opcion = scanner.nextInt();
            if (opcion == 0) {
                bandera = true;
            }
        }
    }

    public static void dibujarMapa(char[][] asientos) {
        System.out.println("Mapa de Asientos:");
        for (int f = 0; f < asientos.length; f++) {
            for (int c = 0; c < asientos[0].length; c++) {
                System.out.print(asientos[f][c] + " ");
            }
            System.out.println();
        }
    }
}