package Projects;

//Soma de Entradas: Crie uma classe SomaStrings. Declare duas variáveis String, 
//valor1 com o texto "15" e valor2 com o texto "25". 
//Faça o parse de ambas para int, some os dois números e imprima o resultado.

public class SomaStrings {

	public static void main(String[] args) {
		String valor1 = "15";
		String valor2 = "25";
		int somaParseValores = Integer.parseInt(valor1) + Integer.parseInt(valor2);
		System.out.print("A soma dos valores é: " + somaParseValores);
	}

}
