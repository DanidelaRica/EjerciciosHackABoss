public class Ejercicio2 {
    public static void main(String[] args) {

        //a) Crea un programa que declare una variable para cada uno de los siguientes tipos de datos:
        // int, double, boolean y String. Asigna un valor a cada variable y muestra su contenido en la consola.

        int num1 = 4;
        double num2 = 5.8;
        boolean variable1 = true;
        String texto1 = "Hola";

        System.out.println("El numero entero es: "+num1);
        System.out.println("El numero es: "+num2);
        System.out.println("El boolean es: "+variable1);
        System.out.println("La cadena es: "+texto1);

        //b) Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un int en un String o
        // un String en un double… ¿Qué sucede con el programa? ¿Se produce algún error?
        // ¿En qué situaciones se genera error y en cuáles no? Justificar el por qué de cada caso. Debatir con otros compañeros.

        //Como java es un lenguaje de tipado estático, el tipo de datos de una variable se define en tiempo de compilación
        // y no puede cambiarse durante la ejecución del programa. Asi que el compilador de java nos dara error y no podremos
        // ejecutar el programa. Este error se produce cuando intentas asignar un valor que no es compatible con el tipo de dato
        // declarado en la variable
    }
}
