package Polimorfism;

public class TesteOficina {

	public static void main(String[] args) {
		Oficina ofc1 = new Oficina();
		Moto moto1 = new Moto();
		Carro carro1 = new Carro();
		
		ofc1.manutencao(carro1);
		ofc1.manutencao(moto1);
	}

}
