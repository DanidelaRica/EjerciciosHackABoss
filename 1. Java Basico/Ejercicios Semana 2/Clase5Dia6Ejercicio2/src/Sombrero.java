public class Sombrero extends Vestimenta{
    private String tipo;
    private String tamanio;

    public Sombrero() {
    }

    public Sombrero(String codigo, String nombre, double precio, String marca, String talla, String color, String tipo, String tamanio) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public void mostrarMarca() {
        System.out.println("Este sombrero es de marca: "+tipo);
    }
}
