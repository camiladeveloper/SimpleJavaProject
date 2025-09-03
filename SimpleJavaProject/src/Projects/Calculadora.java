package Projects;
import java.util.*;

public class Calculadora {

    double somar(double a, double b) {
        return a + b;
    }

    double subtrair(double a, double b) {
        return a - b;
    }

    double multiplicar(double a, double b) {
        return a * b;
    }

    double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: divisão por zero!");
            return 0;
        }
        return a / b;
    }

    void mostrarMenu() {
        System.out.println("\n=== Calculadora ===");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        int opcao;
        do {
            calc.mostrarMenu();
            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Encerrando...");
                break;
            }

            System.out.print("Digite o primeiro número: ");
            double n1 = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            double n2 = sc.nextDouble();

            switch (opcao) {
                case 1:
                	System.out.println("Resultado: " + calc.somar(n1, n2));
                case 2:
                	System.out.println("Resultado: " + calc.subtrair(n1, n2));
                case 3:
                	System.out.println("Resultado: " + calc.multiplicar(n1, n2));
                case 4:
                	System.out.println("Resultado: " + calc.dividir(n1, n2));
                default:
                	System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        sc.close();
    }
}