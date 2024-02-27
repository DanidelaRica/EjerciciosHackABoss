public class Main {
    public static void main(String[] args) {
        Mamifero m1 = new Mamifero(1,"Hipopótamo",5,"Suave","Carnivoro",
                4,"Normal","Gris","Selva");
        Ave a1 = new Ave(2,"Gorrión",2,"Pluma","Insectos",
                2,"Medio","Negro","Corto");
        Reptil r1 = new Reptil(3,"Lagarto",1,"Hola","Insectos",1,"Hola2","Alto","Selva");

        m1.saludar();
        a1.saludar();
        r1.saludar();

        //d) Crear un objeto de tipo animal e intentar asignarle al Mamifero creado…
        // ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?

        Animal animal1 = m1;

        //Se puede asignar un objeto de una clase hija a una clase  padre. Esto es posible gracias a la
        // propiedad herencia

        //E) Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde el "main"
        // a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?

        //No es posible acceder a los metodos al cambiar a private. Esto se debe al principio de encapsulamiento
    }
}