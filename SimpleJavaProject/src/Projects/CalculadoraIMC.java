package Projects;

//Calculadora de IMC: Crie uma classe CalculadoraIMC. 
//Declare uma String peso com o valor "78.5" e uma String altura com o valor "1.82". 
//Faça o parse de ambos para double, calcule o IMC (fórmula: peso / (altura * altura)) e 
//imprima o resultado.

public class CalculadoraIMC {

	public static void main(String[] args) {
		String peso = "78.5";
		String altura = "1.82";
		double IMC = Double.parseDouble(peso) / (Double.parseDouble(altura) * Double.parseDouble(altura));
		String textFormat = String.format("%.2f", IMC);
		System.out.print("Peso: " + peso + "\nAltura: " + altura + "\nIMC: " + textFormat);
	}

}
