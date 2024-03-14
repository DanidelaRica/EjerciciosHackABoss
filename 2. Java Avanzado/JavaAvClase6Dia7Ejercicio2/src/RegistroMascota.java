import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RegistroMascota {
    private List<Mascota> mascotaList;

    public RegistroMascota() {
        this.mascotaList = new ArrayList<>();
    }

    public List<Mascota> getMascotaList() {
        return mascotaList;
    }

    public void agregarMascota(Mascota mascota){
        mascotaList.add(mascota);
    }

    public int contarMascotasRegistradas() {
        return mascotaList.size();
    }

    public void generarMascotasAleatorias(int cantidad) {
        Random random = new Random();
        String[] nombres = {"Suco", "Firulais", "Michi", "Luna", "Toby", "Simba", "Coco", "Molly"};
        String[] especies = {"Perro", "Gato", "Pájaro", "Reptil", "Otro"};

        for (int i = 0; i < cantidad; i++) {
            String nombreAleatorio = nombres[random.nextInt(nombres.length)];
            int edadAleatoria = random.nextInt(10) + 1;
            String especieAleatoria = especies[random.nextInt(especies.length)];

            Mascota<String> mascota = new Mascota<>(i + 1, nombreAleatorio, edadAleatoria, especieAleatoria);
            agregarMascota(mascota);
        }
    }
}
