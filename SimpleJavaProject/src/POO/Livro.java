package POO;

public class Livro {
	private String titulo;
	private String autor;
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

	public static void main(String[] args) {
		Livro l1 = new Livro("Dom Casmurro", "Machado de Assis");
		Livro l2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
		
        System.out.println("Livro 1: " + l1.getTitulo() + " - " + l1.getAutor());
        System.out.println("Livro 2: " + l2.getTitulo() + " - " + l2.getAutor());

	}

}