import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/universidad"; // URL de la base de datos "universidad"
        String usuario = "root"; // Nombre de usuario de la base de datos
        String contraseña = ""; // Contraseña de la base de datos

        try {
            // Establecer conexión con la base de datos
            Connection conexion = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión establecida correctamente a la base de datos");

            // Insertar un nuevo estudiante
            String nombreEstudiante = "Daniel";
            int edadEstudiante = 27;
            double calificacionEstudiante = 8;
            String insertQuery = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?, ?, ?)";
            PreparedStatement insertStatement = conexion.prepareStatement(insertQuery);
            insertStatement.setString(1, nombreEstudiante);
            insertStatement.setInt(2, edadEstudiante);
            insertStatement.setDouble(3, calificacionEstudiante);
            int filasAfectadas = insertStatement.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Estudiante insertado correctamente.");
            } else {
                System.out.println("No se pudo insertar el estudiante.");
            }
            insertStatement.close();

            // Recuperar y mostrar la lista de estudiantes
            Statement statement = conexion.createStatement();
            String selectQuery = "SELECT * FROM estudiantes";
            ResultSet resultado = statement.executeQuery(selectQuery);
            System.out.println("Lista de estudiantes:");
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                int edad = resultado.getInt("edad");
                double calificacion = resultado.getDouble("calificacion");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Calificación: " + calificacion);
            }
            resultado.close();
            statement.close();

            // Cerrar la conexión
            conexion.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

