package com.mycompany.clase10dia11ejercicio1.servlets;

import com.mycompany.clase10dia11ejercicio1.logica.Controladora;
import com.mycompany.clase10dia11ejercicio1.logica.Voto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "VotosSv", urlPatterns = {"/VotosSv"})
public class VotosSv extends HttpServlet {

    private Controladora control = new Controladora();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet VotosSv</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet VotosSv at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Verificar si se ha enviado la solicitud desde el formulario de mostrar resultados
        if (request.getParameter("showResults") != null) {
            List<Voto> votos = control.traerVotos();

            // Contadores para cada partido
            int votosPartidoA = 0;
            int votosPartidoB = 0;
            int votosPartidoC = 0;

            // Contar la cantidad de votos para cada partido
            for (Voto voto : votos) {
                if ("Partido A".equals(voto.getPartido())) {
                    votosPartidoA++;
                } else if ("Partido B".equals(voto.getPartido())) {
                    votosPartidoB++;
                } else if ("Partido C".equals(voto.getPartido())) {
                    votosPartidoC++;
                }
            }

            // Guardar los resultados en la solicitud para que puedan ser accesibles en index.jsp
            request.setAttribute("votosPartidoA", votosPartidoA);
            request.setAttribute("votosPartidoB", votosPartidoB);
            request.setAttribute("votosPartidoC", votosPartidoC);
        }

        // Redireccionar a index.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String partidoSeleccionado = null;
        if (request.getParameter("partidoA") != null) {
            partidoSeleccionado = "Partido A";
        } else if (request.getParameter("partidoB") != null) {
            partidoSeleccionado = "Partido B";
        } else if (request.getParameter("partidoC") != null) {
            partidoSeleccionado = "Partido C";
        }

        // Verificar si se seleccionó un partido
        if (partidoSeleccionado != null) {
            Voto voto = new Voto(partidoSeleccionado);
            control.crearVoto(voto);

            // Redirigir a la página de resultados para mostrar los votos actualizados
            response.sendRedirect("VotosSv?showResults=true");
        } else {
            // Manejar el caso donde no se ha seleccionado ningún partido
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "No se ha seleccionado ningún partido");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
