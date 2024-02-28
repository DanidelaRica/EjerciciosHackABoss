public class Auto extends Vehiculo implements Electrico {
    private double capacidadBateria;
    private double autonomia;

    public Auto(int id, String placa, String marca, String modelo, int anio, double costo, double capacidadBateria, double autonomia) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public double getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(double capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public void cargarEnergia() {
        System.out.println("Cargando energía");
    }

    @Override
    public int calcularAntiguedad() {
        int anioActual = 2024;
        return anioActual - getAnio();
    }
}
