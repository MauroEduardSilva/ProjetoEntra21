package br.com.detalhamento.dao;

import java.sql.Connection;

import br.com.detalhamento.modelo.Usuario;

public class UsuarioDAO {

		public Usuario verificarUsuario(String email, String senha) {
			Usuario usuario = null;
		
			try (Connection conn = Conexao.getConexao()){
				String sql = "SELECT * FROM usuario WHERE email = ? AND senha = ?";
			}
		}
}
