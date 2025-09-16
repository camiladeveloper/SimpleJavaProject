package POO;

import java.util.*;

public class MainBanco {
 public static void main(String[] args) {
     ContaCorrente cc1 = new ContaCorrente("001", "Alice", 1000.0);
     ContaCorrente cc2 = new ContaCorrente("002", "Bruno", 200.0);

     ContaPoupanca cp1 = new ContaPoupanca("101", "Carla", 500.0);
     ContaPoupanca cp2 = new ContaPoupanca("102", "Diego", 1500.0);

     cc1.depositar(500);
     cc2.sacar(600);
     cp1.depositar(100);
     cp2.sacar(200);

     cc1.transferir(cp1, 300);

     cp1.calcularRendimento();
     cp2.calcularRendimento();

     List<ContaBancaria> contas = new ArrayList<>();
     contas.add(cc1);
     contas.add(cc2);
     contas.add(cp1);
     contas.add(cp2);

     System.out.println("\n=== Resumo das contas ===");
     for (ContaBancaria c : contas) {
         c.exibirTipoConta();
         System.out.println("Saldo: R$ " + c.getSaldo());
         System.out.println("------------------------");
     }
 }
}
