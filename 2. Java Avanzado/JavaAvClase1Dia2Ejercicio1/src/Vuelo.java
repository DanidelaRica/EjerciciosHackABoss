public class Vuelo {
    private String nombre;
    private String destino;
    private String fecha;
    private int capacidad;
    private int asientosDisponibles;

    public Vuelo() {
    }

    public Vuelo(String nombre, String destino, String fecha, int capacidad) {
        this.nombre = nombre;
        this.destino = destino;
        this.fecha = fecha;
        this.capacidad = capacidad;
        this.asientosDisponibles = capacidad;
    }

    public void reservarAsientos(String nombrePasajero, int numAsientos) throws ReservaInvalidaException {
        if (numAsientos <= 0) {
            throw new ReservaInvalidaException("Debe reservar al menos un asiento.");
        } else if (numAsientos > asientosDisponibles) {
            throw new ReservaInvalidaException("No hay suficientes asientos disponibles.");
        } else {
            asientosDisponibles -= numAsientos;
            System.out.println("Reserva realizada para " + nombrePasajero + " en el vuelo " +nombre+ " con destino a " +destino+ ", el " +fecha);
            System.out.println("Asientos restantes en el vuelo "+ nombre +": " +asientosDisponibles);
        }
    }
}