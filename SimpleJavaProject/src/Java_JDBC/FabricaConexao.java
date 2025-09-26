package Java_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FabricaConexao {

	public static Connection getConexao(){
		String url = "jdbc:mysql://localhost:3306/";
		String user = "root";
		String senha = "";
		
		try {
			return DriverManager.getConnection(url, user, senha);
		} catch (Exception e) {
			throw new RuntimeException( );
		}
	}
	
    public static Connection getConexao(String nomeBanco) {
        String url = "jdbc:mysql://localhost:3306/" + nomeBanco;
        String user = "root";
        String senha = "";

        try {
            return DriverManager.getConnection(url, user, senha);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar no banco: " + nomeBanco, e);
        }
    }

}
