package Polimorfism;

import java.util.Scanner;

public class TesteLivro {

	public static void main(String[] args) {
		Ebook e1 = new Ebook();
		LivroFisico l1 = new LivroFisico();
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		System.out.println(e1.getClass().getSimpleName());
		carrinho.adicionarLivro(e1);
		System.out.println(l1.getClass().getSimpleName());
		carrinho.adicionarLivro(l1);

	}

}
