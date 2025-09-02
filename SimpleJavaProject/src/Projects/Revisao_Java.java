package Projects;
import java.util.*;

public class Revisao_Java {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\n=== MENU REVISÃO JAVA ===");
			System.out.println("1 - User Info");
			System.out.println("2 - Operações Aritméticas");
			System.out.println("3 - Maior Idade");
			System.out.println("4 - Dia Semana");
			System.out.println("5 - Verifica Paridade");
			System.out.println("6 - Soma Numeros");
			System.out.println("7 - Array");
			System.out.println("8 - ArrayList");
			System.out.println("9 –  IF + LOOP + ARRAY");
			System.out.println("10 – Sistema Bancário");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			System.out.println();

			switch (opcao) {
			case 1: 
				userInfo(sc); 
				break;
			case 2: 
				operaArit(sc); 
				break;
			case 3: 
				maiorIdade(sc); 
				break;
			case 4: 
				diaSemana(sc); 
				break;
			case 5: 
				verificaParidade();
				break;
			case 6: 
				somaNumeros(sc); 
				break;
			case 7: 
				addArray(sc); 
				break;
			case 8: 
				arrayList(sc); 
				break;
			case 9: 
				ifLoopArray(); 
				break;
			case 10: 
				sistemaBancario(sc); 
				break;
			case 0: System.out.println("Encerrando..."); 
			break;
			default: System.out.println("Opção inválida!");
			}
		} while (opcao != 0);
		addArray(sc);
		sc.close();
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
		String nome = sc.next();
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

	/*
Exercício 2 – Operações Aritméticas 
Peça ao usuário dois números inteiros, calcule:
A soma
A subtração
A multiplicação
A divisão
Mostre os resultados.
	 */
	public static void operaArit(Scanner sc) {
		System.out.println("Digite o primeiro número: ");
		int n1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		int n2 = sc.nextInt();

		System.out.println("Soma: " + (n1 + n2));
		System.out.println("Subtração: " + (n1 - n2));
		System.out.println("Multiplicação: " + (n1 * n2));
		System.out.println("Divisão: " + ((double) n1 / n2));
	}

	/*
Exercício 3 – Condicional IF/ELSE 
Peça ao usuário sua idade.
Se for maior ou igual a 18, exiba “Você é maior de idade”.
Caso contrário, exiba “Você é menor de idade”.
	 */
	public static void maiorIdade(Scanner sc) {
		int idade = 0;
		do {
			System.out.println("Digite a sua idade: ");
			idade = sc.nextInt();
			if (idade<=0 || idade>120) {
				System.out.println("Idade incorreta. Digite Novamente");
			} else if (idade > 18) {
				System.out.println("Você é maior de idade");				
			} else {
				System.out.println("Você é menor de idade");
			}
		} while(idade<=0 || idade>120);
	}

	/*
Exercício 4 – Switch 
Peça ao usuário para digitar um número de 1 a 7 e exiba o dia da semana correspondente.
	 */
	public static void diaSemana(Scanner sc) {
		int numero = 0;
		do {
			System.out.println("Digite um número de 1 a 7: ");
			numero = sc.nextInt();
			if (numero<1 || numero>7) {
				System.out.println("Número Inválido. Digite Novamente");
			} else {
				switch(numero) {
				case 1: {
					System.out.println("Dia " + numero + " - Domingo");
					break;
				}
				case 2: {
					System.out.println("Dia " + numero + " - Segunda");
					break;
				}
				case 3: {
					System.out.println("Dia " + numero + " - Terça");
					break;
				}
				case 4: {
					System.out.println("Dia " + numero + " - Quarta");
					break;
				}
				case 5: {
					System.out.println("Dia " + numero + " - Quinta");
					break;
				}
				case 6: {
					System.out.println("Dia " + numero + " - Sexta");
					break;
				}
				case 7: {
					System.out.println("Dia " + numero + " - Sábado");
					break;
				}
				}
			}
		} while(numero<1 || numero>7);		
	}

	/*
Exercício 5 – Loop FOR 
Mostre na tela todos os números de 1 a 20 e ao lado de cada um indique se ele é par ou ímpar.
	 */
	public static void verificaParidade() {
		for (int i = 1 ; i <=20 ; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " é par.");
			} else {
				System.out.println(i + " é ímpar.");
			}
		}
	}

	/*
Exercício 6 – Loop WHILE 
Peça números ao usuário até que ele digite 0.
Quando isso acontecer, exiba a soma de todos os números digitados.
	 */
	public static void somaNumeros(Scanner sc) {
		int numero = 0;
		int soma = 0;
		do {
			System.out.println("Digite um número ou 0 para sair: ");
			numero = sc.nextInt();
			soma += numero;
		} while (numero!=0);
		System.out.println("Soma dos números digitados: " + soma);
	}

	/*
Exercício 7 – Arrays 
Crie um array de int com tamanho 5. 
Peça ao usuário para informar 5 números e armazene-os no array. Depois, exiba:
Todos os números digitados
A soma total deles
	 */
	public static void addArray(Scanner sc) {
		int[] numeros = new int[5];
		int soma = 0;

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o número " + (i+1) + ": ");
			numeros[i] = sc.nextInt();
			soma += numeros[i];
		}

		System.out.println("Números digitados: ");
		for (int n : numeros) {
			System.out.print(n + " ");
		}

		System.out.println("\nSoma total: " + soma);
	}
	/*
Exercício 8 – ArrayList 
Crie um ArrayList<String> para armazenar nomes. 
Adicione 5 nomes informados pelo usuário 
Exiba a lista completa 
Pergunte um nome e diga se ele existe na lista
	 */
	public static void arrayList(Scanner sc) {
		ArrayList<String> nomes = new ArrayList<>();

		for(int i=0; i<5; i++) {
			System.out.println("Digite um nome");
			nomes.add(sc.next());
		}
		System.out.println(nomes);

		System.out.println("Digite mais um nome da lista: ");
		String nome = sc.next();

		if(nomes.contains(nome)) {
			System.out.printf("O nome %s está na lista", nome);
		} else {
			System.out.printf("O nome %s não está na lista", nome);
		}
	}
	/*
Exercício 9 –  IF + LOOP + ARRAY 
Utilizando um int[] com 10 números fixos, mostre apenas os números maiores que 50.
	 */
	public static void ifLoopArray() {
		int[] numeros = {10, 25, 60, 80, 30, 45, 100, 55, 70, 5};

		System.out.println("Números maiores que 50:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > 50) {
				System.out.println(numeros[i]);
			}
		}
	}

	/*
Exercício 10 – Sistema Bancário 
Você foi contratado para desenvolver um pequeno sistema bancário que permita que o usuário
crie contas, deposite, saque e visualize informações.
	 */	
	public static void sistemaBancario(Scanner sc) {
		ArrayList<Integer> contas = new ArrayList<>();
		ArrayList<String> nomes = new ArrayList<>();
		ArrayList<Double> saldos = new ArrayList<>();
		int opc;
		int cont;

		do {
			System.out.println("\n==== MEU BANCO ==== \n"
					+ "1 - Criar nova conta \n"
					+ "2 - Depositar \n"
					+ "3 - Sacar\n"
					+ "4 - Ver saldo de uma conta\n"
					+ "5 - Listar todas as contas\n"
					+ "6 - Sair \n"
					+ "Escolha uma opção:");
			opc = sc.nextInt();

			switch (opc) {
			case 1: {
				System.out.println("Digite o número da conta:");
				cont = sc.nextInt();
				if (!contas.contains(cont)) {
					contas.add(cont);

					System.out.println("Digite o nome do cliente:");
					sc.nextLine(); // limpar buffer
					String nome = sc.nextLine();
					nomes.add(nome);

					System.out.println("Digite o saldo inicial:");
					double saldoInicial = sc.nextDouble();
					saldos.add(saldoInicial);

					System.out.println("Conta criada com sucesso!");
				} else {
					System.out.println("Essa conta já existe!");
				}
				break;
			}

			case 2: {
				System.out.println("Digite o número da conta:");
				cont = sc.nextInt();
				if (contas.contains(cont)) {
					int index = contas.indexOf(cont); // posição da conta
					System.out.println("Digite o valor do depósito:");
					double deposito = sc.nextDouble();
					double saldoAtual = saldos.get(index);
					saldoAtual += deposito;
					saldos.set(index, saldoAtual);
					System.out.printf("Depósito realizado! Saldo atual: R$ %.2f%n", saldoAtual);
				} else {
					System.out.println("Conta não encontrada!");
				}
				break;
			}

			default: {
				if (opc != 6) {
					System.out.println("Opção inválida!");
				}
			}
			}
		} while (opc != 6);

		System.out.println("Saindo do banco...");
	}

}
