package br.com.detalhamento.servelet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/")
public class newServlet extends HttpServlet {
	
    private static final long serialVersionUID = 1L;

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	doGet(request, response);
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws ServletException, IOException {
    	
    	String action = request.getServletPath();
    	
    	try {
    		switch (action) {
    		
    		case "/nome":
    			inserirNome(request, response);
    			break;
    		}
    		
    	}
    }
}
