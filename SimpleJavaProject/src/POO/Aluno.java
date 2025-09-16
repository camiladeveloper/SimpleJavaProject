package POO;

public class Aluno {
	public String nome;
	public int idade;

	public static void main(String[] args) {
		Aluno a1 = new Aluno();
        a1.nome = "Maria";
        a1.idade = 20;

        Aluno a2 = new Aluno();
        a2.nome = "João";
        a2.idade = 22;

        System.out.println("Aluno 1: " + a1.nome + ", " + a1.idade + " anos");
        System.out.println("Aluno 2: " + a2.nome + ", " + a2.idade + " anos");

	}

}
