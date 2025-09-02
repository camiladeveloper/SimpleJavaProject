package Projects;
import java.util.*;

public class Exercicios_Pilha_Fila {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\n=== MENU PILHA E FILA ===");
			System.out.println("1 - Organizar Pilha de Livros");
			System.out.println("2 - Inverter Palavra");
			System.out.println("3 - Histórico de Navegação");
			System.out.println("4 - Desempilhar Pratos");
			System.out.println("5 - Fila de Atendimento");
			System.out.println("6 - Fila de Impressão");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();
			System.out.println();

			switch (opcao) {
			case 1: organizarPilhaLivros(); break;
			case 2: inverterPalavra(); break;
			case 3: historicoNavegador(); break;
			case 4: desempilharPratos(); break;
			case 5: filaAtendimento(); break;
			case 6: filaImpressao(); break;
			case 0: System.out.println("Encerrando..."); break;
			default: System.out.println("Opção inválida!");
			}
		} while (opcao != 0);

		sc.close();
	}

	/*
	Exercício 1 – Organizando uma Pilha de Livros
	Empilhe 3 livros em uma Stack e depois desempilhe todos,
	exibindo a ordem de saída.
	 */
	public static void organizarPilhaLivros() {
		Stack<String> livros = new Stack<>();
		livros.push("O Senhor dos Anéis");
		livros.push("O Hobbit");
		livros.push("Silmarillion");

		System.out.println("Desempilhando livros:");
		while (!livros.isEmpty()) {
			System.out.println(livros.pop());
		}
	}

	/*
	Exercício 2 – Invertendo uma Palavra
	Use uma Stack para inverter a palavra "Java".
	 */
	public static void inverterPalavra() {
		String palavra = "Java";
		Stack<Character> pilha = new Stack<>();

		for (char c : palavra.toCharArray()) {
			pilha.push(c);
		}

		String invertida = "";
		while (!pilha.isEmpty()) {
			invertida += pilha.pop();
		}

		System.out.println("Palavra original: " + palavra);
		System.out.println("Palavra invertida: " + invertida);
	}

	/*
	Exercício 3 – Simples Histórico de Navegação
	Empilhe 3 sites em uma Stack, mostre o site atual com peek(),
	e depois use pop() para simular o botão voltar.
	 */
	public static void historicoNavegador() {
		Stack<String> historico = new Stack<>();
		historico.push("https://www.google.com");
		historico.push("oracle.com");
		historico.push("github.com");

		System.out.println("Página atual: " + historico.peek());

		historico.pop();
		System.out.println("Após voltar 1 vez: " + historico.peek());

		historico.pop();
		System.out.println("Após voltar 2 vezes: " + historico.peek());
	}

	/*
	Exercício 4 – Desempilhando Pratos
	Empilhe 5 pratos (10,20,30,40,50), retire 2 (pop),
	e mostre o próximo prato no topo (peek).
	 */
	public static void desempilharPratos() {
		Stack<Integer> pratos = new Stack<>();
		pratos.push(10);
		pratos.push(20);
		pratos.push(30);
		pratos.push(40);
		pratos.push(50);

		pratos.pop();
		pratos.pop();

		System.out.println("Próximo prato no topo: " + pratos.peek());
	}

	/*
	Exercício 5 – Fila de Atendimento
	Use uma Queue para simular atendimento de clientes.
	 */
	public static void filaAtendimento() {
		Queue<String> fila = new LinkedList<>();
		fila.add("Ana");
		fila.add("Bruno");
		fila.add("Carlos");

		System.out.println("Fila inicial: " + fila);

		System.out.println("Atendendo: " + fila.poll());
		System.out.println("Fila após atendimento: " + fila);
		System.out.println("Próximo da fila: " + fila.peek());
	}

	/*
	Exercício 6 – Fila de Impressão
	Use uma Queue para simular a ordem de impressão de arquivos.
	 */
	public static void filaImpressao() {
		Queue<String> fila = new LinkedList<>();
		fila.add("Documento1.pdf");
		fila.add("Relatorio.docx");
		fila.add("Imagem.png");

		System.out.println("Fila de impressão: " + fila);

		System.out.println("Imprimindo: " + fila.poll());
		System.out.println("Fila restante: " + fila);
	}
}
