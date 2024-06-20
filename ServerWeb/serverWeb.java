package com.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Przykładowy serwlet obsługujący żądania HTTP GET.
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Ustawienie typu odpowiedzi na "text/html"
        resp.setContentType("text/html");

        // Pobranie strumienia wyjściowego do pisania odpowiedzi
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("<h1>Witaj, świecie!</h1>");
        out.println("</body></html>");
    }
}
