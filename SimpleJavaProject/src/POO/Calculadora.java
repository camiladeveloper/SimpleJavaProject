package POO;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n=== Calculadora ===");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");

			int opcao = sc.nextInt();

			if (opcao == 0) {
				System.out.println("Fechando a calculadora.");
				break;
			}

			System.out.print("Digite o primeiro número: ");
			double num1 = sc.nextDouble();

			System.out.print("Digite o segundo número: ");
			double num2 = sc.nextDouble();

			double resultado = 0;

			switch (opcao) {
			case 1:
				resultado = num1 + num2;
				break;
			case 2:
				resultado = num1 - num2;
				break;
			case 3:
				resultado = num1 * num2;
				break;
			case 4:
				if (num2 != 0) {
					resultado = num1 / num2;
				} else {
					System.out.println("Erro: divisão por zero não é permitida.");
					continue;
				}
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
				continue;
			}

			System.out.println("Resultado: " + resultado);
		}

		sc.close();
	}
}
