package Projects;
import java.util.*;

//Aprovação do Aluno: Crie uma classe VerificaAprovacao. 
//Declare uma variável double nota com um valor. 
//Use uma estrutura if-else para verificar se a nota é maior ou igual a 7.0. 
//Se for, imprima "Aprovado!". Senão, imprima "Reprovado."

public class VerificaAprovacao {

	public static void main(String[] args) {
		System.out.print("Digite a nota: ");
		Scanner leitor = new Scanner(System.in);
		double nota = leitor.nextDouble();
		
		if(nota>= 7.0) {
			System.out.print("Aprovado");
		} else {
			System.out.print("Reprovado");
		}
	}

}
