import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //a) Una recital permite únicamente el ingreso de mayores de 18 años.
        // Para ello necesita un programa que, a partir de que un usuario ingrese su edad,
        // determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento.
        // El programa debe mostrar (según cada caso) un mensaje informando la situación.

        int edad = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime tu edad :");
        edad = scanner.nextInt();

        if (edad >= 18){
            System.out.println("Puedes ingresar al evento");
        } else {
            System.out.println("No puedes ingresar al evento");
        }
    }
}
