package Polimorfism;

public class Ebook extends Livro {
	@Override
	public void aplicaDesconto() {
		System.out.println("Desconto de 15% para ebooks aplicado.");
	}
}
