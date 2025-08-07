package br.com.detalhamento.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoBanco {
	
	private static final String URL = "jdbc:mysql://localhost:3306/cadastro_usuarios?useSSL=false&serverTimezone=UTC";
	private static final String USUARIO = "root";
	private static final String SENHA = "";
	
	public static Connection getConexao() {
		try {
			Class.forName("");
			return DriverManager.getConnection(URL,USUARIO,SENHA);
		}catch (ClassNotFoundException | SQLException e){
			throw new RuntimeException("ERRO");
		}
	}
}
