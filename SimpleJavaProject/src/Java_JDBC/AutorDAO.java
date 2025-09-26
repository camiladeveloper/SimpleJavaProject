package Java_JDBC;
import java.util.*;

public interface AutorDAO {
	public void salvar(Autor autor);
	Autor buscarPorID(int id);
	List<Autor> ListarTodos();
	public void atualizar(Autor autor);
	public void deletarPorID(int id);
}
