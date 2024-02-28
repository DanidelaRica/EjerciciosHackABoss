public class Camioneta extends Vehiculo implements Combustion{
    private double capacidadTanque;
    private double consumoCombustible;

    public Camioneta(int id, String placa, String marca, String modelo, int anio, double costo, double capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Cargando combustible");
    }

    @Override
    public int calcularAntiguedad() {
        int anioActual = 2024;
        return anioActual - getAnio();
    }
}
