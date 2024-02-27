public class Main {
    public static void main(String[] args) {
        //Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases
        // y variables no llevan tilde) con los siguientes atributos: cod, marca, modelo, consumo y color.
        //
        //Luego, realiza las siguientes acciones:
        //
        //a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
        //
        //b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
        //
        //c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
        //
        //d) Intenta obtener la marca del electrodoméstico creado sin parámetros.
        // ¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?

        Electrodomestico e1 = new Electrodomestico(1,"Balay","Frigorifico",7.5,"Blanco");
        Electrodomestico e2 = new Electrodomestico(2,"Beko","Lavadora",10.8,"Azul");
        Electrodomestico e3 = new Electrodomestico(3,"LG","Horno",12.5,"Negro");

        Electrodomestico e4 = new Electrodomestico();

        System.out.println("Marca: "+e1.getMarca()+" Modelo: "+e1.getModelo()+" Consumo: "+e1.getConsumo());
        System.out.println("Marca: "+e2.getMarca()+" Modelo: "+e2.getModelo()+" Consumo: "+e2.getConsumo());
        System.out.println("Marca: "+e3.getMarca()+" Modelo: "+e3.getModelo()+" Consumo: "+e3.getConsumo());

        System.out.println("Marca: "+e4.getMarca());

        //No se obtiene ningun valor, null
    }
}