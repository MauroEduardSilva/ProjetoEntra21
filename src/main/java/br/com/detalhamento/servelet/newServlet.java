package br.com.detalhamento.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/newServelet")
public class newServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
    	
    	String nome = request.getParameter("nome");
    	
    	response.setContentType("text/html;charset=UTF-8");
    	response.getWriter().println("<h1>Olá, "+ nome +"!<h1>");
     }
}
