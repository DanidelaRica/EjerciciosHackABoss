import java.util.ArrayList;
import java.util.List;

public class InventarioAuto<T extends Auto> {
    private List<T> inventario;

    public InventarioAuto() {
        this.inventario = new ArrayList<>();
    }

    public void agregarAuto(List<T> autos) {
        inventario.addAll(autos);
    }

    public List<T> buscarPorMarca(String marca) {
        List<T> autosPorMarca = new ArrayList<>();
        for (T auto : inventario) {
            if (auto.getMarca().equalsIgnoreCase(marca)) {
                autosPorMarca.add(auto);
            }
        }
        return autosPorMarca;
    }

    public List<T> buscarPorAño(int año) {
        List<T> autosPorAño = new ArrayList<>();
        for (T auto : inventario) {
            if (Integer.parseInt(auto.getAnio()) == año) {
                autosPorAño.add(auto);
            }
        }
        return autosPorAño;
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (T auto : inventario) {
            valorTotal += auto.getPrecio();
        }
        return valorTotal;
    }
}
