package POO;

public class Veiculo {

    public void mover() {
        System.out.println("O veículo está se movendo");
    }

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
        Carro carro = new Carro();
        Moto moto = new Moto();

        veiculo.mover();
        carro.mover();
        moto.mover();
	}

}
