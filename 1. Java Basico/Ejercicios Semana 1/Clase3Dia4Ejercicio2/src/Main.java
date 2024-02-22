public class Main {
    public static void main(String[] args) {
        //Crear una clase Persona, que tenga los siguientes atributos: id, nombre, edad,
        // dirección y número de teléfono (tener en cuenta todos sus atributos, constructores y métodos getters y setters).
        //
        //a) Crear un vector de tipo Persona cinco posiciones. Crear cinco personas y guardarlas en él.
        //
        //b) Recorrer el vector creado y mostrar por pantalla el nombre y edad de cada persona almacenada.
        //
        //c) Cambiar el nombre de dos personas. Mostrar por pantalla el antes,
        // realizar el cambio y luego mostrar el después de los datos de las dos personas cuyos nombres fueron cambiados.
        //
        //d) Recorrer el vector y mostrar por pantalla únicamente a las personas cuya edad sea mayor de 30 años.

        Persona [] personas = new Persona[5];

        Persona p1 = new Persona(1,"Javier",29,"Avenida Arroyo","112233");
        Persona p2 = new Persona(2,"Francisco",19,"Calle Larios","452020");
        Persona p3 = new Persona(3,"Dani",30,"Avenida de la Paz","406089");
        Persona p4 = new Persona(4,"Alfonso",22,"Calle Juan","412131");
        Persona p5 = new Persona(5,"Fernando",34,"Calle Luz","478162");

        personas[0]=p1;
        personas[1]=p2;
        personas[2]=p3;
        personas[3]=p4;
        personas[4]=p5;

        for (int i=0; i< personas.length; i++){
            System.out.println("Nombre: "+personas[i].getNombre()+" Edad: "+personas[i].getEdad());
        }

        System.out.println(personas[0].getNombre());
        personas[0].setNombre("Antonio");

        System.out.println(personas[1].getNombre());
        personas[1].setNombre("Manuel");

        System.out.println("Id :"+personas[0].getId()+" Nombre: "+personas[0].getNombre()+" Edad: "
                +personas[0].getEdad()+" Direccion:"+personas[0].getDireccion()+" Telefono: "+personas[0].getTelefono());

        System.out.println("Id :"+personas[1].getId()+" Nombre: "+personas[1].getNombre()+" Edad: "
                +personas[1].getEdad()+" Direccion:"+personas[1].getDireccion()+" Telefono: "+personas[1].getTelefono());

        for (int i=0; i< personas.length; i++){
            if(personas[i].getEdad()>30){
                System.out.println("Las personas mayores de 30 son: "+personas[i].getNombre());
            }
        }
    }
}