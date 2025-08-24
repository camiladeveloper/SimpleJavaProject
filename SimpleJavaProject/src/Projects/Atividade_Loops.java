package Projects;

import java.util.Scanner;

public class Atividade_Loops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU DE EXERCÍCIOS ===");
            System.out.println("1 - Tabuada de um número");
            System.out.println("2 - Sequência de Fibonacci");
            System.out.println("3 - Triângulo de asteriscos");
            System.out.println("4 - Adivinhe o Número Secreto");
            System.out.println("5 - Verificador de Número Primo");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            System.out.println();

            switch (opcao) {
                case 1:
                    tabuada(sc);
                    break;
                case 2:
                    fibonacci();
                    break;
                case 3:
                    triangulo();
                    break;
                case 4:
                    adivinheNumero(sc);
                    break;
                case 5:
                    verificadorPrimo(sc);
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }

    /* 1. Tabuada de um número
       Escreva um programa que leia um número inteiro do usuário
       e exiba a tabuada desse número de 1 a 10. */
    public static void tabuada(Scanner sc) {
        System.out.print("Digite um número para ver a tabuada: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    /* 2. Sequência de Fibonacci
       Escreva um programa que exiba os primeiros 15 números da sequência de Fibonacci.
       A sequência de Fibonacci começa com 0 e 1, e cada número seguinte é a soma dos dois anteriores. */
    public static void fibonacci() {
        int soma = 0;
        int anterior = 0;
        int atual = 0;
        System.out.println(soma + "\n");
        soma++;
        atual++;
        System.out.println(soma + "\n");
        for (int i = 1; i <= 15; i++) {
            System.out.println(soma + "\n");
            soma = anterior + atual;
            anterior = atual;
            atual = soma;
        }
    }

    /* 3. Triângulo de asteriscos
       Este é um desafio clássico que envolve loops aninhados (um for dentro de outro for).
       Crie um programa que desenhe um triângulo de asteriscos (*) com 10 linhas de altura. */
    public static void triangulo() {
        int linhas = 10;
        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= linhas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* (DESAFIO) 4. Adivinhe o Número Secreto
       Crie um jogo simples onde o programa gera um número aleatório entre 1 e 100.
       Em seguida, peça ao usuário para tentar adivinhar o número.
       O programa deve continuar pedindo um palpite enquanto o usuário não acertar.
       Para cada palpite errado, o programa deve dizer se o número secreto é maior ou menor que o palpite. */
    public static void adivinheNumero(Scanner sc) {
        int numeroSecreto = new java.util.Random().nextInt(100) + 1;
        int palpite = -1;

        System.out.println("Jogo do Número Secreto");
        while (palpite != numeroSecreto) {
            System.out.print("Digite seu palpite (1 a 100): ");
            palpite = sc.nextInt();

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é MAIOR!");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número secreto é MENOR!");
            } else {
                System.out.println("Parabéns! Você acertou o número secreto: " + numeroSecreto);
            }
        }
    }

    /* (DESAFIO) 5. Verificador de Número Primo
       Peça ao usuário para digitar um número inteiro positivo.
       Crie um programa que verifique se esse número é primo. */
    public static void verificadorPrimo(Scanner sc) {
        System.out.print("Digite um número inteiro positivo para verificar se é primo: ");
        int numero = sc.nextInt();

        boolean ehPrimo = true;

        if (numero <= 1) {
            ehPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }

        if (ehPrimo) {
            System.out.println(numero + " é um número primo");
        } else {
            System.out.println(numero + " NÃO é um número primo");
        }
    }
}