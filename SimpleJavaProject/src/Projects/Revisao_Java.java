package Projects;
import java.util.*;

public class Revisao_Java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		userInfo(sc);
		
	}
	
/*
Exercício 1 – Declaração e uso de variáveis 
Crie um programa que declare: 
Uma variável String com seu nome 
Uma variável int com sua idade 
Uma variável double com sua altura
 */
	public static void userInfo(Scanner sc) {
		int idade = 0;
		double altura = 0;
		System.out.println("Digite o seu nome: ");
		String nome = sc.nextLine();
		do {
			System.out.println("Digite a sua idade: ");
			idade = sc.nextInt();
			if (idade<=0 || idade>120) {
				System.out.println("Idade incorreta. Digite Novamente");
			}
		} while(idade<=0 || idade>120);
		do {
			System.out.println("Digite a sua altura: ");
			altura = sc.nextDouble();
			if (altura>2.5 || altura<=0) {
			System.out.println("Altura incorreta. Digite Novamente");
			}
		} while(altura>2.5 || altura<=0);
		System.out.printf("%s - %d anos - %.2f m de altura%n", nome, idade, altura);
	}
}
