package Projects;

import java.util.Scanner;

// Categoria por Idade: Crie uma classe DefineCategoria. 
// Declare uma variável int idade e use uma cadeia if-else if-else 
// para imprimir a categoria da pessoa:
// 0 a 12 anos: "Criança"
// 13 a 17 anos: "Adolescente"
// 18 a 59 anos: "Adulto"
// 60 anos ou mais: "Idoso"

public class DefineCategoria {

	public static void main(String[] args) {
		System.out.print("Digite uma idade: ");
		Scanner leitor = new Scanner(System.in);
		double idade = leitor.nextInt();
		
		if(idade >= 0 && idade <=12 ) {
			System.out.print("Criança");
		} else if (idade >= 13 && idade <= 17){
			System.out.print("Adolescente");
		} else if (idade >=18 && idade <= 59) {
			System.out.print("Adulto");
		} else if (idade >= 60) {
			System.out.print("Idoso");
		}

	}

}
