import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Auto a1 = new Auto(1, "ABC123", "Tesla", "Model S", 2020, 50000, 1000, 8);
        Camioneta c1 = new Camioneta(2, "DEF456", "Toyota", "Hilux", 2018, 40000, 60, 10);
        Moto m1 = new Moto(3, "GHI789", "Honda", "CBR600RR", 2019, 12000, 600, "4 tiempos");

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(a1);
        vehiculos.add(c1);
        vehiculos.add(m1);

        for(Vehiculo elemento: vehiculos){
            System.out.println("Información del vehículo:");
            System.out.println("ID: " + elemento.getId());
            System.out.println("Placa: " + elemento.getPlaca());
            System.out.println("Marca: " + elemento.getMarca());
            System.out.println("Modelo: " + elemento.getModelo());
            System.out.println("Año: " + elemento.getAnio());
            System.out.println("Costo: $" + elemento.getCosto());

            int antiguedad = elemento.calcularAntiguedad();
            System.out.println("Antigüedad: "+antiguedad+" años");

            if (elemento instanceof Electrico) {
                Electrico autoElectrico = (Electrico) elemento;
                autoElectrico.cargarEnergia();
            } else if (elemento instanceof Combustion) {
                Combustion vehiculoCombustion = (Combustion) elemento;
                vehiculoCombustion.recargarCombustible();
            }
            System.out.println("");
        }

    }
}