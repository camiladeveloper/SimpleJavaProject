package Projects;

import java.util.Scanner;

//Positivo, Negativo ou Zero: Crie uma classe AnalisaNumero. 
//Declare uma variável int numero. 
//Use uma cadeia if-else if-else para verificar e 
//imprimir se o número é "Positivo", "Negativo" ou "Zero".

public class AnalisaNumero {

	public static void main(String[] args) {
		System.out.print("Digite um número: ");
		Scanner leitor = new Scanner(System.in);
		double numero = leitor.nextInt();
		
		if(numero > 0) {
			System.out.print("Positivo");
		} else if (numero == 0){
			System.out.print("Zero");
		} else if (numero < 0) {
			System.out.print("Negativo");
		}
	}

}
