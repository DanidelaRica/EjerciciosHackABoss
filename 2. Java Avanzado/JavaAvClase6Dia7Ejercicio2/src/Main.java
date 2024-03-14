import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Creamos una instancia de RegistroMascota
        RegistroMascota registroMascota = new RegistroMascota();

        // Creamos las mascotas
        Mascota<String> mascota1= new Mascota<>(1,"Suco",3,"Perro");
        Mascota<String> mascota2 = new Mascota<>(2, "Firulais", 5, "Perro");
        Mascota<String> mascota3 = new Mascota<>(3, "Michi", 2, "Gato");

        // Agregamos las mascotas al registro
        registroMascota.agregarMascota(mascota1);
        registroMascota.agregarMascota(mascota2);
        registroMascota.agregarMascota(mascota3);

        // Buscamos la mascota por nombre
        String nombre = "Suco";
        List<Mascota> mascotasPorNombre = registroMascota.getMascotaList().stream()
                .filter(mascota -> mascota.getNombre().equals(nombre))
                .collect(Collectors.toList());

        System.out.println("Mascotas con nombre "+nombre+" :");
        for (Mascota mascota : mascotasPorNombre) {
            System.out.println(mascota);
        }

        // Contamos la cantidad total de mascotas registradas usando el metodo size
        System.out.println("\nCantidad total de mascotas registradas: "+registroMascota.contarMascotasRegistradas());

        // Generamos y agregamos 5 mascotas aleatorias al registro
        registroMascota.generarMascotasAleatorias(5);

        // Imprimimos las mascotas registradas
        System.out.println("Mascotas registradas:");
        List<Mascota> mascotasRegistradas = registroMascota.getMascotaList();
        for (Mascota mascota : mascotasRegistradas) {
            System.out.println(mascota);
        }

        // Contamos de nuevo la cantidad total de mascotas registradas usando el metodo size
        System.out.println("\nCantidad total de mascotas registradas: "+registroMascota.contarMascotasRegistradas());
    }
}