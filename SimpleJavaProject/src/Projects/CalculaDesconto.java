package Projects;

import java.util.Scanner;

//Calculadora de Desconto: Crie uma classe CalculaDesconto. 
//Declare uma variável double valorCompra. 
//Se o valor da compra for maior ou igual a R$ 200,00, aplique um desconto de 15%. 
//Senão, não aplique desconto. No final, imprima o valor final da compra 
//(com ou sem o desconto aplicado).

public class CalculaDesconto {

	public static void main(String[] args) {
		System.out.print("Digite o valor da compra: ");
		Scanner leitor = new Scanner(System.in);
		double valorCompra = leitor.nextDouble();
		double valorCompraDesc = valorCompra*0.15;
		
		if(valorCompra>= 200.0) {
			System.out.print("Valor da compra com desconto: R$ " + valorCompraDesc);
		}
		System.out.print("\nValor total da compra: R$ " + valorCompra);
	}

}
