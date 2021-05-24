/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alant
 */
@WebServlet(name = "mostrarResultado", urlPatterns = {"/mostrarResultado"})
public class mostrarResultado extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            if (request.getAttribute("flag") != null) {
                request.setAttribute("flag", 1);
                request.getRequestDispatcher("/calcular.jsp").forward(request, response);
            } else {
                String n1 = request.getParameter("num1");
                String n2 = request.getParameter("num2");
                model.Triangle t = new model.Triangle();
                t.area(n1, n2);
                t.perimeter(n1);
                Cookie ck;
                ck = new Cookie("area", t.getResultArea() + "");
                response.addCookie(ck);
                ck = new Cookie("perimeter", t.getResultPerimeter() + "");
                response.addCookie(ck);
                int resultArea = t.getResultArea();
                int resultPerimeter = t.getResultPerimeter();
                request.setAttribute("triangulo", t);
                request.getRequestDispatcher("/muestraTriangulo.jsp").forward(request, response);
            }
        }
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
