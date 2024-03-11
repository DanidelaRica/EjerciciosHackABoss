import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int TAMANIO_VECTOR = 5; // Tamaño fijo del vector

        int[] vector = new int[TAMANIO_VECTOR];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el índice donde desea almacenar el valor:");
        int indice = scanner.nextInt();

        System.out.println("Ingrese el valor a almacenar:");
        int valor = scanner.nextInt();

        almacenarDatos(vector, indice, valor);

        System.out.println("Ingrese el índice del vector que desea acceder:");
        int indiceAcceso = scanner.nextInt();

        try {
            int dato = vector[indiceAcceso];
            System.out.println("El valor en la posición "+indiceAcceso+ " del vector es: " +dato);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Intentando acceder a una posición inválida en el vector.");
        }
    }

    public static void almacenarDatos(int[] vector, int indice, int valor) {
        try {
            vector[indice] = valor;
            System.out.println("Dato almacenado en la posición " +indice+ " del vector.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Intentando acceder a una posición inválida en el vector.");
        }
    }
}