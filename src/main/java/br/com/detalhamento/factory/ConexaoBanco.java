package br.com.detalhamento.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBanco {
	public static final String URL = "jdbc:mysql://localhost:3306/banco_freetobee?useSSL=false&serverTimezone=UTC";
	public static final String USUARIO = "root";
	public static final String SENHA = "root";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection getConexao() throws SQLException {
		return DriverManager.getConnection(URL, USUARIO, SENHA);
	}
}
