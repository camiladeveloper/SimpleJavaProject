package Projects;
import java.util.*;
//Cadastro Simples: Crie uma classe CadastroUsuario. 
//Declare uma String nome com seu nome, uma String idade com sua idade em texto (ex: "29"), 
//e uma String salario com um valor (ex: "3200.50"). 
//Faça o parse da idade e do salário para seus tipos corretos e, no final, 
//imprima uma frase usando String.format() que junte todas as informações, como:
//"O usuário [nome], de [idade] anos, tem um salário de R$ [salario]".
public class CadastroUsuario {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = leitor.next();
		System.out.print("Digite a sua idade: ");
		String idade = leitor.next();
		System.out.print("Digite o seu salário: ");
		String salario = leitor.next();
		System.out.print("O usuário " + nome + " de " + Integer.parseInt(idade) + " anos, tem um salário de R$ " + Double.parseDouble(salario));
	}

}
