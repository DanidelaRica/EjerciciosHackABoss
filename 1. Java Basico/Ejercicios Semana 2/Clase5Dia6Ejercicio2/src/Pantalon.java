public class Pantalon extends Vestimenta{
    private String estilo;
    private String tipoTejido;

    public Pantalon() {
    }

    public Pantalon(String codigo, String nombre, double precio, String marca, String talla, String color, String estilo, String tipoTejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tipoTejido = tipoTejido;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTipoTejido() {
        return tipoTejido;
    }

    public void setTipoTejido(String tipoTejido) {
        this.tipoTejido = tipoTejido;
    }

    @Override
    public void mostrarMarca() {
        System.out.println("Estoss pantalones son de marca: "+estilo);
    }
}
