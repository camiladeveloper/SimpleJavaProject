package POO;

public class FuncionarioAssoc {
	private String nome;
	private Departamento departamento;

	public FuncionarioAssoc(String nome, Departamento departamento) {
		this.nome = nome;
		this.departamento = departamento;
	}

	public String getNome() {
		return nome;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public static void main(String[] args) {
		Departamento rh = new Departamento("Recursos Humanos");

		FuncionarioAssoc f1 = new FuncionarioAssoc("Ana", rh);
		FuncionarioAssoc f2 = new FuncionarioAssoc("Carlos", rh);

		System.out.println(f1.getNome() + " - Departamento: " + f1.getDepartamento().getNome());
		System.out.println(f2.getNome() + " - Departamento: " + f2.getDepartamento().getNome());
	}
}