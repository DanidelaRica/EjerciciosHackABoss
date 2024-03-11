public class Main {
    public static void main(String[] args) {
        try {
            Vuelo vuelo = new Vuelo("Vuelo1", "Budapest", "2024-07-15", 100);
            vuelo.reservarAsientos("Dani", 3);
        } catch (ReservaInvalidaException e) {
            System.out.println("Error al realizar la reserva: " + e.getMessage());
        }

    }
}