package POO;

import java.util.*;

public class Funcionario {
    public double calcularSalario() {
        return 0.0;
    }
    
    public static void main(String[] args) {
        List<Funcionario> lista = new ArrayList<>();
        lista.add(new Gerente());
        lista.add(new Estagiario());
        lista.add(new Gerente());

        int i = 1;
        for (Funcionario f : lista) {
            System.out.println("Funcionário " + (i++) + " salário: R$ " + f.calcularSalario());
        }
    }
}
