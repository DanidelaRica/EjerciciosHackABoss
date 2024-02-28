public class Moto extends Vehiculo implements Combustion{
    private int cilindrada;
    private String tipoMotor;

    public Moto(int id, String placa, String marca, String modelo, int anio, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible");
    }



    @Override
    public int calcularAntiguedad() {
        int anioActual = 2024;
        return anioActual - getAnio();
    }
}
