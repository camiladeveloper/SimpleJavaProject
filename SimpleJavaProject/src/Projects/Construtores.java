package Projects;
import java.util.Scanner;

public class Construtores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        exercicio1(sc);
        exercicio2(sc);
        exercicio3(sc);
        exercicio4(sc);
        exercicio5(sc);
        exercicio6(sc);

        sc.close();
    }

    /*
    Exercício 1 – Criando um construtor padrão
    Crie uma classe chamada Carro com os atributos marca e ano.
    Implemente um construtor sem parâmetros que inicialize a marca como "Desconhecida" e o ano como 0.
    Crie um método para exibir os valores do objeto.
    */
    public static void exercicio1(Scanner sc) {
        class Carro {
            String marca;
            int ano;

            Carro() {
                this.marca = "Desconhecida";
                this.ano = 0;
            }

            void mostrarInfo() {
                System.out.println("\n=== Exercício 1 ===");
                System.out.println("Marca: " + marca);
                System.out.println("Ano: " + ano);
            }
        }

        Carro c = new Carro();
        c.mostrarInfo();
    }

    /*
    Exercício 2 – Construtor parametrizado
    Crie uma classe chamada Aluno com os atributos nome e idade.
    Implemente um construtor parametrizado que receba esses valores.
    Crie um método para exibir os dados do aluno.
    */
    public static void exercicio2(Scanner sc) {
        class Aluno {
            String nome;
            int idade;

            Aluno(String nome, int idade) {
                this.nome = nome;
                this.idade = idade;
            }

            void mostrarInfo() {
                System.out.println("Nome: " + nome + " | Idade: " + idade);
            }
        }

        System.out.println("\n=== Exercício 2 ===");

        System.out.print("Digite o nome do aluno 1: ");
        String nome1 = sc.next();
        int idade1;
        do {
            System.out.print("Digite a idade do aluno 1: ");
            idade1 = sc.nextInt();
            if (idade1 <= 0 || idade1 > 120) {
                System.out.println("Idade inválida. Digite um valor entre 1 e 120.");
            }
        } while (idade1 <= 0 || idade1 > 120);

        System.out.print("Digite o nome do aluno 2: ");
        String nome2 = sc.next();
        int idade2;
        do {
            System.out.print("Digite a idade do aluno 2: ");
            idade2 = sc.nextInt();
            if (idade2 <= 0 || idade2 > 120) {
                System.out.println("Idade inválida. Digite um valor entre 1 e 120.");
            }
        } while (idade2 <= 0 || idade2 > 120);

        Aluno a1 = new Aluno(nome1, idade1);
        Aluno a2 = new Aluno(nome2, idade2);

        a1.mostrarInfo();
        a2.mostrarInfo();
    }


    /*
    Exercício 3 – Sobrecarga de construtores
    Crie uma classe chamada Livro com os atributos titulo e autor.
    Implemente dois construtores: um que receba apenas o título (autor = "Desconhecido")
    e outro que receba título e autor.
    */
    public static void exercicio3(Scanner sc) {
        class Livro {
            String titulo;
            String autor;

            Livro(String titulo) {
                this.titulo = titulo;
                this.autor = "Desconhecido";
            }

            Livro(String titulo, String autor) {
                this.titulo = titulo;
                this.autor = autor;
            }

            void mostrarInfo() {
                System.out.println("Título: " + titulo + " | Autor: " + autor);
            }
        }

        System.out.println("\n=== Exercício 3 ===");
        System.out.print("Digite o título do livro 1: ");
        sc.nextLine();
        String titulo1 = sc.nextLine();

        System.out.print("Digite o título do livro 2: ");
        String titulo2 = sc.nextLine();
        System.out.print("Digite o autor do livro 2: ");
        String autor2 = sc.nextLine();

        Livro l1 = new Livro(titulo1);
        Livro l2 = new Livro(titulo2, autor2);

        l1.mostrarInfo();
        l2.mostrarInfo();
    }

    /*
    Exercício 4 – Misturando padrão, parametrizado e sobrecarga
    Crie uma classe Produto com nome, preco e estoque.
    Implemente três construtores: padrão, nome, e nome+preco+estoque.
    */
    public static void exercicio4(Scanner sc) {
        class Produto {
            String nome;
            double preco;
            int estoque;

            Produto() {
                this.nome = "Sem nome";
                this.preco = 0.0;
                this.estoque = 0;
            }

            Produto(String nome) {
                this.nome = nome;
                this.preco = 0.0;
                this.estoque = 0;
            }

            Produto(String nome, double preco, int estoque) {
                this.nome = nome;
                this.preco = preco;
                this.estoque = estoque;
            }

            void mostrarInfo() {
                System.out.println("Produto: " + nome + " | Preço: R$ " + preco + " | Estoque: " + estoque);
            }
        }

        System.out.println("\n=== Exercício 4 ===");
        Produto p1 = new Produto();

        System.out.print("Digite o nome do produto 2: ");
        String nome2 = sc.next();
        Produto p2 = new Produto(nome2);

        System.out.print("Digite o nome do produto 3: ");
        String nome3 = sc.next();
        System.out.print("Digite o preço do produto 3: ");
        double preco3 = sc.nextDouble();
        System.out.print("Digite o estoque do produto 3: ");
        int estoque3 = sc.nextInt();
        Produto p3 = new Produto(nome3, preco3, estoque3);

        p1.mostrarInfo();
        p2.mostrarInfo();
        p3.mostrarInfo();
    }

    /*
    Exercício 5 – Construtor básico e inicialização
    Crie uma classe Filme com título, diretor e ano de lançamento.
    */
    public static void exercicio5(Scanner sc) {
        class Filme {
            private String titulo;
            private String diretor;
            private int anoLancamento;

            Filme(String titulo, String diretor, int anoLancamento) {
                this.titulo = titulo;
                this.diretor = diretor;
                this.anoLancamento = anoLancamento;
            }

            void mostrarDetalhes() {
                System.out.println("\n=== Exercício 5 ===");
                System.out.println("Título: " + titulo);
                System.out.println("Diretor: " + diretor);
                System.out.println("Ano: " + anoLancamento);
            }
        }

        System.out.print("Digite o título do filme: ");
        sc.nextLine(); 
        String titulo = sc.nextLine();
        System.out.print("Digite o diretor: ");
        String diretor = sc.nextLine();
        System.out.print("Digite o ano de lançamento: ");
        int ano = sc.nextInt();

        Filme f = new Filme(titulo, diretor, ano);
        f.mostrarDetalhes();
    }

    /*
    Exercício 6 – Gerenciando notas de um aluno
    */
    public static void exercicio6(Scanner sc) {
        class Aluno {
            private String nome;
            private double[] notas;

            Aluno(String nome) {
                this.nome = nome;
                this.notas = new double[4];
            }

            void adicionarNota(int bimestre, double nota) {
                if (bimestre >= 1 && bimestre <= 4 && nota >= 0 && nota <= 10) {
                    notas[bimestre - 1] = nota;
                } else {
                    System.out.println("Bimestre ou nota inválida!");
                }
            }

            double calcularMedia() {
                double soma = 0;
                for (double n : notas) soma += n;
                return soma / notas.length;
            }

            void verificarStatus() {
                double media = calcularMedia();
                System.out.println("Média: " + media);
                if (media >= 7.0) {
                    System.out.println("Aluno aprovado!");
                } else {
                    System.out.println("Aluno reprovado.");
                }
            }
        }

        System.out.println("\n=== Exercício 6 ===");
        System.out.print("Digite o nome do aluno: ");
        sc.nextLine();
        String nome = sc.nextLine();
        Aluno a = new Aluno(nome);

        for (int i = 1; i <= 4; i++) {
            System.out.print("Digite a nota do " + i + "º bimestre: ");
            double nota = sc.nextDouble();
            a.adicionarNota(i, nota);
        }

        a.verificarStatus();
    }
}
