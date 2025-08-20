package Projects;
public class ConversorTempo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valorTotalSeg = 200;
		int valorMinutos = valorTotalSeg/60;
		int restante = valorTotalSeg % 60;
		System.out.print("Em minutos: \n" + valorMinutos + "m restantes: " + restante + "s");

	}

}
