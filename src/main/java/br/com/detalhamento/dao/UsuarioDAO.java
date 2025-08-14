package br.com.detalhamento.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.detalhamento.factory.ConexaoBanco;
import br.com.detalhamento.modelo.Usuario;

public class UsuarioDAO {
	
	public Usuario verificarUsuario(String email, String senha) {
		Usuario usuario = null;
		
		try(Connection conn = ConexaoBanco.getConexao()){
			String sql = "SELECT * FROM usuario WHERE email = ? AND senh = ?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, email);
			stmt.setString(2, senha);
			
			ResultSet rs = stmt.executeQuery();
			
			if(rs.next()) {
				usuario = new Usuario();
				usuario.setNome(rs.getString("nome"));
				usuario.setSobrenome(rs.getString("sobrenome"));
				usuario.setApelido(rs.getString("apelido"));
				usuario.setEmail(rs.getString("email"));
				usuario.setSenha(rs.getString("senha"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return usuario;
	}
	
}
