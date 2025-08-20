package Projects;
import java.util.Scanner;

public class ConversorTemperatura {

	public static void main(String[] args) {
		System.out.print("Digite a temperatura atual em Farenheit: ");
		Scanner leitor = new Scanner(System.in);
		double tempFaren = leitor.nextDouble();
		double tempCelcius = (tempFaren - 32) * 5 / 9;
		String textFormat = String.format("%.2f", tempCelcius);
		System.out.print("A conversão de " + tempFaren + " Farenheit em " + textFormat + " Celcius");
	}

}
