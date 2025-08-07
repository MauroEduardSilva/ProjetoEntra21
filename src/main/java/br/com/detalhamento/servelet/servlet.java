package br.com.detalhamento.servelet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.detalhamento.util.conexaoBanco;


@WebServlet("/cadastro")
public class servlet extends HttpServlet {
	
    private static final long serialVersionUID = 1L;

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
    		throws ServletException, IOException {
    	
    	String nome = request.getParameter("nome");
    	String sobrenome = request.getParameter("sobrenome");
    	String apelido = request.getParameter("apelido");
    	String email = request.getParameter("email");
    	String senha = request.getParameter("senha");
    	String confirmar = request.getParameter("confirmar");
    	
    	String sql = "INSERT INTO usuarios (nome, sobrenome, apelido, email, senha) VALUES (?, ?, ?, ?, ?)";
    	
    	try (Connection conn = conexaoBanco.getConexao();
    			
    		PreparedStatement stmt = conn.prepareStatement(sql)) {

    		    stmt.setString(1, nome);
    		    stmt.setString(2, sobrenome);
    		    stmt.setString(3, apelido);
    		    stmt.setString(4, email);
    		    stmt.setString(5, senha);

    		    stmt.executeUpdate();

    		    response.sendRedirect(request.getContextPath() + "pagina/cadastro-usuario.html");

    		} catch (SQLException e) {
    			
    		    throw new ServletException("Erro ao salvar no banco de dados", e);
    		}
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    		throws IOException {
    	
    	String action = request.getServletPath();
    	
    	}
	}
