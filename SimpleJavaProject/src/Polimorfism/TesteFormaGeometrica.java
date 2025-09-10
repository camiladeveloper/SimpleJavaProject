package Polimorfism;

public class TesteFormaGeometrica {

	public static void main(String[] args) {
		Quadrado qd1 = new Quadrado();
		Circulo cr1 = new Circulo();
		
		qd1.desenhar();
		cr1.desenhar();
		
		PainelDesenho painel1 = new PainelDesenho();
		painel1.desenharForma(cr1);
		painel1.desenharForma(qd1);

	}

}
