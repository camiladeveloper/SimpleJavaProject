package POO;

import java.util.Scanner;

public class ContaSimples {
    private double saldo;

    public ContaSimples() {
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depositado: R$ " + valor);
        } else {
            System.out.println("Valor inválido. Não é possível depositar valores negativos ou zero.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaSimples conta = new ContaSimples();

        while (true) {
            System.out.print("Digite o valor do depósito (ou 'sair' para encerrar): ");
            String entrada = sc.next();

            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                double valor = Double.parseDouble(entrada);
                conta.depositar(valor);
                System.out.println("Saldo atual: R$ " + conta.getSaldo());
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Digite um número ou 'sair'.");
            }
        }

        System.out.println("\nOperações finalizadas.");
        System.out.println("Saldo final: R$ " + conta.getSaldo());
        sc.close();
    }
}
