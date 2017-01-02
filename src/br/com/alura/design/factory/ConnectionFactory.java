package br.com.alura.design.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection getConnection() {
	        try {
	        	
	        	
	        	String banco = System.getenv("tipoBanco");
	        	String url = "jdbc:mysql://localhost:3306/" + banco;
	        	String user = "root";
	        	String senha = "1234";	        	
	            Connection conexao = 
	                    DriverManager.getConnection(url, user, senha);

	            return conexao;
	        } catch (SQLException e) {
	            throw new RuntimeException(e);
	        }
	    }
}
