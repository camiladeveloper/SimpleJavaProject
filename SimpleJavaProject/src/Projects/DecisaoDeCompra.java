package Projects;
//Decisão de Compra: Crie uma classe DecisaoDeCompra. 
//Declare uma String saldoConta com o valor "500.75" e uma 
//String precoProduto com o valor "499.99". Declare uma String temCredito com o valor "true". 
//Faça o parse dos três valores para seus tipos corretivos (double, double e boolean). 
//O objetivo deste exercício é apenas fazer a conversão e imprimir os três valores convertidos, 
//cada um em uma linha.
public class DecisaoDeCompra {

	public static void main(String[] args) {
		String saldoConta = "500.75";
		String precoProduto = "499.99";
		String temCredito = "true";
		System.out.print("Saldo Conta R$ " + Double.parseDouble(saldoConta));
		System.out.print("\nPreço produto R$ " + Double.parseDouble(precoProduto));
		System.out.print("\nTem crédito? " + Boolean.parseBoolean(temCredito));


	}

}
