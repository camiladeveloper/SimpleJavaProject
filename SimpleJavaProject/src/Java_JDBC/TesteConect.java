package Java_JDBC;

import java.sql.*;

public class TesteConect {

	public static void main(String[] args) throws SQLException {
		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String senha = "";
		
		try {
			Connection conexao = DriverManager.getConnection(url, user, senha);
//			String sqlCreate = "CREATE DATABASE IF NOT EXISTS TESTE_BANCO";
//			String sql = "CREATE TABLE IF NOT EXISTS LIVROS("
//					+ "ID INT AUTO_INCREMENT PRIMARY KEY,"
//					+ "TITULO VARCHAR(100) NOT NULL)";
			Statement stmt = conexao.createStatement();
			
//			stmt.execute(sql);
			System.out.println("Deu certo!");
			
			conexao.close();
		} catch (Exception e) {
			System.out.println("Deu errado pq? " + e);
		}
	}

}
