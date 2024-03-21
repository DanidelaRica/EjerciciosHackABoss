
<%@page import="com.mycompany.clase10dia11ejercicio1.logica.Voto"%>
<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Votar</title>
        <!-- Agregar referencia a Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
    <body>
        <div class="container">
            <h1 class="mt-4">Votaciones del Centro de Estudiantes</h1>
            <form action="VotosSv" method="post">
                <div class="form-group">
                    <label class="mr-2"><input type="radio" name="partidoA" value="PartidoA"> Partido A</label>
                    <label class="mr-2"><input type="radio" name="partidoB" value="PartidoB"> Partido B</label>
                    <label><input type="radio" name="PartidoC" value="partidoC"> Partido C</label>
                </div> 
                <button type="submit" class="btn btn-primary">Votar</button>
            </form>

            <form action="VotosSv" method="get">
                <input type="hidden" name="showResults" value="true"> <!-- Agregar este campo oculto -->
                <button type="submit" class="btn btn-success mt-2">Mostrar Resultados</button>
            </form>

            <br>
            <br>

            <!-- Resultados en tabla -->
            <div class="results-table">
                <% if (request.getAttribute("votosPartidoA") != null
                            && request.getAttribute("votosPartidoB") != null
                            && request.getAttribute("votosPartidoC") != null) {%>
                <h3>Resultados:</h3>
                <table class="table">
                    <thead>
                        <tr>
                            <th>Partido</th>
                            <th>Cantidad de Votos</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>Partido A</td>
                            <td><%= request.getAttribute("votosPartidoA")%></td>
                        </tr>
                        <tr>
                            <td>Partido B</td>
                            <td><%= request.getAttribute("votosPartidoB")%></td>
                        </tr>
                        <tr>
                            <td>Partido C</td>
                            <td><%= request.getAttribute("votosPartidoC")%></td>
                        </tr>
                    </tbody>
                </table>
                
                <% }%>
            </div>

        </div>
        <!-- Scripts de Bootstrap -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
