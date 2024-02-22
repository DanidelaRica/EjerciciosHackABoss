import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
       //Ejercicio Nº 3 - Arreglos: Vectores - Individual
        //
        //Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas
        // de la última semana, calcule la temperatura máxima promedio que hubo.
        //
        //Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura
        // máxima de cada día. Una vez almacenadas las temperaturas, deberá calcular el promedio
        // de las mismas recorriendo el vector y mostrando el resultado por pantalla.

        int[] temperaturas = new int[7];
        int suma = 0;
        double promedio=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime las ultimas 7 temperaturas maximas ");

        for(int i=0; i< temperaturas.length; i++){
            System.out.println("Siguiente temperatura");
            temperaturas[i] = scanner.nextInt();
            suma += temperaturas[i];
        }
        promedio = (double) suma / temperaturas.length;

        System.out.println("La temperatura máxima promedio de los ultimos 7 dias es: "+promedio);
    }
}
