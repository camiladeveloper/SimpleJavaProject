package Polimorfism;

public class LivroFisico extends Livro{
	@Override
	public void aplicaDesconto() {
		System.out.println("Desconto de 5% para livros físicos aplicado.");
	}
}
