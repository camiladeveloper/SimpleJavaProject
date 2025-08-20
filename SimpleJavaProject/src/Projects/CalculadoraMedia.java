package Projects;
import java.util.Scanner;

public class CalculadoraMedia {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		double nota1 = leitor.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = leitor.nextDouble();
				System.out.print("Digite a segunda nota: ");		
		double nota3 = leitor.nextDouble();
		double media = (nota1 + nota2 + nota3)/3;
		String textFormat = String.format("%.2f", media);
		System.out.print("A Média das notas: "+ nota1 + " / " + nota2 + " / " + nota3 + " = " + textFormat);
	}

}