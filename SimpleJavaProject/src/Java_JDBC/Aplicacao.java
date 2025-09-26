package Java_JDBC;

import java.sql.Connection;
public class Aplicacao {
	public static void main(String[] args) {
		Connection conexao = FabricaConexao.getConexao();
		
		//instanciar DAO
		AutorDAO autorDAO = new AutorDAOImpl(conexao);
		
		System.out.println("Criar novo autor");
		Autor novoAutor = new Autor();
		novoAutor.setNome("George Orwel");
		novoAutor.setDataNasc(java.sql.Date.valueOf("1905-06-15"));
		autorDAO.salvar(novoAutor);
	}
}
