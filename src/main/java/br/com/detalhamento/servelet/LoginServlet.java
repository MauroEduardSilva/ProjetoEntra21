package br.com.detalhamento.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.detalhamento.dao.UsuarioDAO;
import br.com.detalhamento.modelo.Usuario;


@WebServlet("/login")
public class LoginServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("/src/main/webapp/login-usuario.jsp").forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		UsuarioDAO dao = new UsuarioDAO();
		Usuario usuario = dao.verificarUsuario(email, senha);
		
		if(usuario != null) {
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", usuario);
			request.getRequestDispatcher("src/main/webapp/login-usuario.jsp").forward(request, response);
		}else {
			request.setAttribute("erro","Email ou senha invalidos.");
			request.getRequestDispatcher("/src/main/webapp/login-usuario.jsp").forward(request, response);
		}
	}	
}
