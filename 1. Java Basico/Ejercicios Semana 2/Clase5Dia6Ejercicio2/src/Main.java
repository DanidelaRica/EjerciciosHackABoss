public class Main {
    public static void main(String[] args) {
        Vestimenta vestimentas[] = new Vestimenta[9];

        Zapato z1 = new Zapato("1","mx",50,"adidas","41","blanco","sintetico","total");
        Zapato z2 = new Zapato("2","pl",80,"nike","43","negro","cuero","parcial");
        Zapato z3 = new Zapato("3","as",30,"reebok","40","rojo","sintetico","medio");

        Pantalon p1 = new Pantalon("4","vaqueros",30,"Jeans","38","azul","antiguo","algodon");
        Pantalon p2 = new Pantalon("5","chinos",90,"lacoste","40","azul","nuevo","algodon");
        Pantalon p3 = new Pantalon("6","chandal",62,"reebok","42","azul","actual","algodon");

        Camiseta c1 = new Camiseta("7","camiseta",20,"zara","m","verde","nueva","antiguo");
        Camiseta c2 = new Camiseta("8","camiseta2",40,"Tommy","xl","azul","moda","actual");

        Sombrero s1 = new Sombrero("9","boina",80,"gamboa","s","marron","cowboy","grande");

        vestimentas[0] = z1;
        vestimentas[1] = z2;
        vestimentas[2] = z3;
        vestimentas[3] = p1;
        vestimentas[4] = p2;
        vestimentas[5] = p3;
        vestimentas[6] = c1;
        vestimentas[7] = c2;
        vestimentas[8] = s1;

        for(int i=0; i< vestimentas.length; i++){
            vestimentas[i].mostrarMarca();
        }

    }
}