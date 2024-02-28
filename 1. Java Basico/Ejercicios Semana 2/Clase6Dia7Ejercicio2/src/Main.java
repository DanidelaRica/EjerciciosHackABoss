import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto(1, "Teléfono", "Samsung", "Smartphone", 300, 500, 20);
        Producto p2 = new Producto(2, "Laptop", "HP", "Portátil", 800, 1200, 15);
        Producto p3 = new Producto(3, "Auriculares", "Sony", "Accesorio", 50, 80, 50);
        Producto p4 = new Producto(4, "Cargador", "Anker", "Accesorio", 20, 35, 30);
        Producto p5 = new Producto(5, "Tablet", "Apple", "Tablet", 400, 600, 10);
        Producto p6 = new Producto(6, "Altavoz Bluetooth", "JBL", "Altavoz", 100, 150, 25);
        Producto p7 = new Producto(7, "Smartwatch", "Xiaomi", "Reloj Inteligente", 80, 120, 18);
        Producto p8 = new Producto(8, "Cámara DSLR", "Canon", "Cámara", 600, 900, 8);
        Producto p9 = new Producto(9, "Monitor", "LG", "Monitor", 200, 300, 12);
        Producto p10 = new Producto(10, "Teclado", "Logitech", "Periférico", 30, 50, 40);

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);
        productos.add(p5);
        productos.add(p6);
        productos.add(p7);
        productos.add(p8);
        productos.add(p9);
        productos.add(p10);

        double max=0;
        Producto productoMaxPrecioVenta = null;

        for (Producto elemento : productos) {
            if (elemento.getPrecioVenta() > max) {
                max = elemento.getPrecioVenta();
                productoMaxPrecioVenta = elemento;
            }
        }
        System.out.println(productoMaxPrecioVenta+ " es el que tiene el mayor precio de venta: "+max);

        double min = 99999999;
        Producto productoMinPrecioVenta = null;
        for(Producto elemento : productos) {
            if(elemento.getPrecioVenta() < min) {
                min = elemento.getPrecioVenta();
                productoMinPrecioVenta = elemento;
            }
        }
        System.out.println(productoMinPrecioVenta+ " es el que tiene el menor precio de venta: "+min);
        System.out.println("------------------------------------");
        System.out.println("---LISTA DE ELEMENTOS ACTUALIZADA---");
        System.out.println("------------------------------------");

        productos.remove(4);
        for(Producto elemento : productos){

            System.out.println(elemento);
        }

        int cantidadStockMax = 0;
        int cantidadStockFinal = 0;
        Producto productoMaxCantidadStock = null ;
        for(Producto elemento: productos){
            int cantidadStock = elemento.getCantidadStock();
            if(cantidadStock > cantidadStockMax){
                cantidadStockMax = cantidadStock;
                productoMaxCantidadStock = elemento;
            }
        }
        System.out.println("-----------------------------------------------------");
        productoMaxCantidadStock.setCantidadStock(productoMaxCantidadStock.getCantidadStock() - 3);
        System.out.println("Se descontaron 3 unidades del stock del producto con la mayor cantidad.");
        System.out.println("Producto con la mayor cantidad en stock después de actualizar:");
        System.out.println("Nombre: " + productoMaxCantidadStock.getNombre());
        System.out.println("Cantidad en stock: " + productoMaxCantidadStock.getCantidadStock());


    }
}