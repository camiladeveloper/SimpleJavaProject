package Java_JDBC;
import java.util.*;
import java.sql.*;
import java.sql.Date;

public class AutorDAOImpl implements AutorDAO {
	private Connection conexao;

	public AutorDAOImpl(Connection conexao) {
		this.conexao = conexao;
	}

	@Override
	public void salvar(Autor autor) {
		String sql = "INSERT INTO AUTOR(NOME, DATA_NASC) VALUES(?,?)";
		try(PreparedStatement pstmt = conexao.prepareStatement(sql)){
			pstmt.setString(1,autor.getNome());
			pstmt.setDate(2,autor.getDataNasc());
			pstmt.executeUpdate();
		} catch (Exception e) {

		}

	}

	@Override
	public List<Autor> ListarTodos(){
		List<Autor> autores = new ArrayList<>();
		String sql = "SELECT * FROM AUTORES";
		try(PreparedStatement pstmt = conexao.prepareStatement(sql)){
			ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					Autor autor = new Autor();
					autor.setId(rs.getInt("id"));
					autor.setNome(rs.getString("nome"));
					autor.setDataNasc(rs.getDate("data_nasc"));
					autores.add(autor);
				}
			} catch (Exception e) {
			System.out.println("Erro ao listar autores!" + e);
			}
		return autores;
	}

	@Override
	public Autor buscarPorID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Autor autor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletarPorID(int id) {
		// TODO Auto-generated method stub
		
	}
}
