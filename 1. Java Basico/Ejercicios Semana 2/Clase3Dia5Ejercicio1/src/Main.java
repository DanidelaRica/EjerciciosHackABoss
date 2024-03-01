import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Verdura[] verduras = new Verdura[5];

        Verdura v1 = new Verdura(1, "Tomate", "Rojo", 20, true);
        Verdura v2 = new Verdura(2, "Lechuga", "Verde", 10, false);
        Verdura v3 = new Verdura(3, "Zanahoria", "Naranja", 30, true);
        Verdura v4 = new Verdura(4, "Brócoli", "Verde", 25, true);
        Verdura v5 = new Verdura(5, "Pimiento", "Rojo", 15, false);

        verduras[0] = v1;
        verduras[1] = v2;
        verduras[2] = v3;
        verduras[3] = v4;
        verduras[4] = v5;

        for(int i=0;i< verduras.length;i++){
            System.out.println("Nombre: "+verduras[i].getNombre());
            System.out.println("Calorias: "+verduras[i].getCalorias());
            System.out.println("-------------------------------------");
        }

        verduras[0].setNombre("Cebolla");
        verduras[0].setColor("Blanco");
        verduras[0].setCalorias(10);
        verduras[0].setDebeCocinarse(true);

        verduras[1].setNombre("Calabaza");
        verduras[1].setColor("Naranja");
        verduras[1].setCalorias(15);
        verduras[1].setDebeCocinarse(true);

        System.out.println("VERDURAS DESPUES DEL CAMBIO");
        System.out.println("----------------------------");

        for(int i=0;i< verduras.length;i++){
            System.out.println("Nombre: "+verduras[i].getNombre());
            System.out.println("Calorias: "+verduras[i].getCalorias());
            System.out.println("-------------------------------------");
        }

        System.out.println("VERDURAS DE COLOR VERDE");
        System.out.println("------------------------");

        for(int i=0; i< verduras.length;i++){
            if(verduras[i].getColor().equals("Verde")){
                System.out.println(verduras[i]);
            }
        }

    }
}