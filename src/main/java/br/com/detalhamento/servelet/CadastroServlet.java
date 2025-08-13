package br.com.detalhamento.servelet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.detalhamento.dao.UsuarioDAO;
import br.com.detalhamento.modelo.Usuario;


@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
	
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	String nome = request.getParameter("nome");
    	String sobrenome = request.getParameter("sobrenome");
    	String apelido = request.getParameter("apelido");
    	String email = request.getParameter("email");
    	String senha = request.getParameter("senha");
    	
    	Usuario u = new Usuario (nome, sobrenome, apelido, email, senha);
    	
    	try {
    		UsuarioDAO dao = new UsuarioDAO();
    		dao.salvar(u);
    		request.getRequestDispatcher("sucesso.jsp").forward(request, response);
    	} catch (SQLException e) {
    		e.printStackTrace();
    		response.getWriter().println("Erro ao salvar: " +e.getMessage());
    	}
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws Servlet Exception, IOException {
    	request.getRequestDispatcher("cadastro-usuario.jsp").forward(request, response);
    }
}
