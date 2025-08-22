package Projects;
import java.util.Scanner;

public class Atividade_Switch {
	/*
	 * REMOVA O COMENTÁRIO DA ATIVIDADE PARA TESTAR
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * VALIDAÇÃO DE MÊS
		 */
//		System.out.println("Digite um valor entre 1 e 12");
//		int mes = sc.nextInt();
//		
//		if(mes >=1 && mes <=12) {
//			switch(mes) {
//				case 1: {
//					System.out.println("Janeiro");
//					break;
//				}
//				
//				case 2: {
//					System.out.println("Fevereiro");
//					break;
//				}
//				
//				case 3: {
//					System.out.println("Março");
//					break;
//				}
//				
//				case 4: {
//					System.out.println("Abril");
//					break;
//				}
//				
//				case 5: {
//					System.out.println("Maio");
//					break;
//				}
//				
//				case 6: {
//					System.out.println("Junho");
//					break;
//				}
//				
//				case 7: {
//					System.out.println("Julho");
//					break;
//				}
//				
//				case 8: {
//					System.out.println("Agosto");
//					break;
//				}
//				
//				case 9: {
//					System.out.println("Setembro");
//					break;
//				}
//				
//				case 10: {
//					System.out.println("Outubro");
//					break;
//				}
//				
//				case 11: {
//					System.out.println("Novembro");
//					break;
//				}
//				
//				case 12: {
//					System.out.println("Dezembro");
//					break;
//				}
//			}
//		} else {
//			System.out.print("Mes Inválido");
//		}
		
		
		/*
		 * CARDÁPIO COM OPÇÕES VEGETARIANAS
		 */
//		System.out.println("Escolha uma opção do cardápio: "
//				+ "\n 1 - Hambúrguer"
//				+ "\n 2 - Pizza"
//				+ "\n 3 - Salada");
//		
//		int opcao = sc.nextInt();
//		String pedido = "";
//		
//		switch(opcao) {
//		case 1: {
//			pedido = "Hambúrguer";
//			break;
//		}
//		case 2: {
//			System.out.println("Deseja a versão vegetariana? (S/N)");
//			char veg = sc.next().toUpperCase().charAt(0);
//			if(veg == 'S') {
//				pedido = "Pizza Vegetariana";
//			} else {
//				pedido = "Pizza Tradicional";
//			}
//			break;
//		}
//		case 3: {
//			pedido = "Salada";
//			break;
//		}
//		default:
//			System.out.println("Opção inválida!");
//		}
//		if(!pedido.equals("")) {
//			System.out.println("Você escolheu: " + pedido);
//		}
		
		
		/*
		 * TARIFA TRANSPORTE
		 */		
//		System.out.println("Escolha sua categoria de user: "
//				+ "\n E - Estudante"
//				+ "\n A - Aposentado"
//				+ "\n R - Regular");
//		char tipo = sc.next().toUpperCase().charAt(0);
//		System.out.println("Resposta: " + tipo);
//		
//		
//		
//		
//		boolean horarioPico = false;
//		double tarifa = 5.50;
//		if(horarioPico) {
//			System.out.println("Valor da tarifa R$" + tarifa);
//		} else {
//			switch (tipo) {
//			case 'E': {
//				tarifa = tarifa/2;
//				break;
//				
//			}
//			
//			case 'A': {
//				tarifa = 0;
//				break;
//				
//			}
//			case 'R': {
//				tarifa = 4.40;
//				break;
//				
//			}
//			}
//			System.out.println("Valor da tarifa R$" + tarifa);
//		}
		
		/*
		 * SISTEMA DE NOTAS COM CONCEITO
		 */
		
//		System.out.println("Digite a nota do aluno");
//		int nota = sc.nextInt();
//		if(nota < 5) {
//			System.out.println("Reprovado");
//		} else if(nota >= 5 && nota <=7) {
//			System.out.println("Recuperação");
//		} else {
//			switch(nota) {
//			case 8: {
//				System.out.println("Aprovado, Muito bem!");
//				break;
//			}
//			
//			case 9: {
//				System.out.println("Aprovado, Você brilhou!");
//				break;
//			}
//			
//			case 10: {
//				System.out.println("Aprovado com louvor!");
//				break;
//			}
//			}
//		}
//		
		
		/*
		 * OPERAÇÕES BANCÁRIAS
		 */
//		double saldo = 500;
//		do {
//			System.out.println("Escolha uma operação: "
//					+ "\n S - Saque"
//					+ "\n D - Deposito");
//			
//			char opc = sc.next().toUpperCase().charAt(0);
//			
//			switch(opc) {
//			case 'S': {
//				System.out.println("Qual o valor a ser sacado?");
//				double saque = sc.nextDouble();
//				
//				if(saldo >= saque) {
//					saldo = saldo - saque;
//					System.out.println("Saque realizado com sucesso"
//							+ "\nSaldo atual: R$ " + saldo);
//				} else {
//					System.out.println("Saque insuficiente!"
//							+ "\nSaldo atual: R$ " + saldo);	
//				}
//			}
//			break;
//			case 'D': {
//				System.out.println("Qual o valor do depósito?");
//				double deposito = sc.nextDouble();
//			
//				saldo = saldo + deposito;
//				System.out.println("Depósito realizado com sucesso!"
//							+ "\nSaldo atual: R$ " + saldo);
//				break;
//			}
//			default: {
//				System.out.println("Opção Inválida");
//			}
//			}
//		} while(saldo>0);
	
		
		
		
		/*
		 * TIPO VEÍCULO
		 */			
//		String carro = "carro";
//		String moto = "moto";
//		String caminhao = "caminhao";
//		
//		int eixo = 0;
//		double tarifa = 0;
//		
//		System.out.println("Qual é o tipo do veículo?"
//				+ "\n Carro"
//				+ "\n Moto"
//				+ "\n Caminhão");
//		String tipoVeiculo = sc.next().toLowerCase();
//		
//		switch(tipoVeiculo) {
//		case "carro": {
//			tarifa = 15;
//			break;
//		}
//		case "moto": {
//			tarifa = 5;
//			break;
//		}
//		
//		case "caminhao": {
//			tarifa = 30;
//			System.out.println("Seu veículo? tem eixo extra?"
//					+ "\n 1 - Sim"
//					+ "\n 2 - Não");
//			eixo = sc.nextInt();
//			
//			if(eixo == 1) {
//				tarifa = tarifa + 5;
//			}
//			break;
//		}
//		default: 
//			System.out.println("Opção inválida!");
//		}
//		System.out.println("Valor a ser pago R$ " + tarifa);
		
		
		/*
		 * LOGIN COM NÍVEL DE ACESSO
		 */		
//		String admin = "admin";
//		String user = "user";
//		String guest = "guest";
//		String senha = "java123";
//		
//		System.out.println("Digite o seu user");
//		String userDigitado = sc.next();
//		
//		System.out.println("Digite a sua senha");
//		String senhaDigitado = sc.next();
//		
//		if(userDigitado.equals(senha) ||
//		userDigitado.equals(admin) ||
//		userDigitado.equals(user) ||
//		userDigitado.equals(guest)) {
//			if(senhaDigitado.equals(senhaDigitado)) {
//				switch(userDigitado) {
//				case "admin": {
//					System.out.println("Olá, admin! Você tem acesso ao sistema completo");
//					break;
//				}
//				case "user": {
//					System.out.println("Olá, user! Você tem acesso limitado ao sistema");
//					break;
//				}
//				case "guest": {
//					System.out.println("Olá, guest! Você tem acesso de somente visualização ao sistema");
//					break;
//				}
//				}
//			} else {
//			System.out.println("User incorreto");
//			}
//		}
		
		/*
		 * LOGIN COM NÍVEL DE ACESSO
		 */
//		String senhaCorreta = "java123";
//		
//		System.out.println("Digite o seu usuário (admin/usuario/guest):");
//		String userDigitado = sc.next();
//		System.out.println("Digite a sua senha:");
//		String senhaDigitada = sc.next();
//		
//			if(senhaDigitada.equals(senhaCorreta)) {
//				switch(userDigitado) {
//				case "admin": {
//					System.out.println("Olá, admin! Você tem acesso completo ao sistema.");
//					break;
//				}
//				case "usuario": {
//					System.out.println("Olá, usuário! Você tem acesso limitado.");
//					break;
//				}
//				case "guest": {
//					System.out.println("Olá, guest! Você tem acesso apenas para visualização.");
//					break;
//				}
//				default:
//					System.out.println("Usuário inválido!");
//				}
//			} else {
//				System.out.println("Senha incorreta!");
//			}
		
		/*
		 * ESTAÇÕES DO ANO
		 */
//		System.out.println("Digite um mês entre 1 e 12");
//		int mes = sc.nextInt();
//		boolean inverno = false;
//		
//		if(mes >=1 && mes <=12) {
//			switch(mes) {
//				case 12, 1, 2: {
//					System.out.println("Verão");
//					break;
//				}
//				
//				case 3,4,5: {
//					System.out.println("Outono");
//					break;
//				}
//				
//				case 6,7,8: {
//					System.out.println("Inverno");
//					inverno = true;
//					break;
//				}
//				
//				case 9,10,11: {
//					System.out.println("Privamera");
//					break;
//				}
//			}
//		} else {
//			System.out.print("Digite a opção correta");
//		}
//		
//		if(inverno) {
//			System.out.print("Época de chocolate quente!");
//		}

		/*
		 * CALCULADORA INTELIGENTE
		 */
//		System.out.println("Escolha uma operação:"
//				+"\n + Soma"
//				+ "\n - Subtração"
//				+ "\n * Multiplicação"
//				+ "\n / Divisão");
//		
//		char operacao = sc.next().charAt(0);
//		System.out.println("Digite o primeiro valor:");
//		double a = sc.nextDouble();
//		System.out.println("Digite o segundo valor:");
//		double b = sc.nextDouble();
//		
//		double resultado = 0;
//		
//		switch(operacao) {
//		case '+': {
//			resultado = a + b;
//			System.out.printf("Soma: %.2f%n", resultado);
//			break;
//		}
//		case '-': {
//			resultado = a - b;
//			System.out.printf("Subtração: %.2f%n", resultado);
//			break;
//		}
//		case '*': {
//			resultado = a * b;
//			System.out.printf("Multiplicação: %.2f%n", resultado);
//			break;
//		}
//		case '/': {
//			if(b != 0) {
//				resultado = a / b;
//				System.out.printf("Divisão: %.2f%n", resultado);
//			} else {
//				System.out.println("Erro: Divisão por zero não é permitida.");
//			}
//			break;
//		}
//		default:
//			System.out.println("Operação inválida!");
//		}
//		
		sc.close();
	}

}
