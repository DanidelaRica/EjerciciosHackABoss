import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
       //Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones
        // con ellos: suma, resta, multiplicación y división. Muestra por pantalla/consola los resultados de cada una de las
        // operaciones con un mensaje amigable para el usuario.

        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double suma;
        double resta;
        double multiplicacion;
        double division;

        System.out.println("Dime el primer número");
        num1 = scanner.nextDouble();

        System.out.println("Dime el segundo número");
        num2 = scanner.nextDouble();

        suma= num1 + num2;
        System.out.println("La suma es: "+suma);

        resta = num1 - num2;
        System.out.println("La resta es: "+resta);

        multiplicacion = num1 * num2;
        System.out.println("La multiplicacion es: "+multiplicacion);

        if (num2==0){
            System.out.println("Error, no se puede dividir por 0");
        } else {
            division = num1/num2;
            System.out.println("La division es : "+division);
        }


    }
}
