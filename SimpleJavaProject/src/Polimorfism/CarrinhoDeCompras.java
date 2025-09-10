package Polimorfism;

public class CarrinhoDeCompras {
	private double total;
	
	public void adicionarLivro(Livro livro) {
		livro.aplicaDesconto();
	}

}
