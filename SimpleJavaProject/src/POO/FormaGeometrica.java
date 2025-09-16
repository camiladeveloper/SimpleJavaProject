package POO;

public abstract class FormaGeometrica {
	public abstract double calcularArea();
	
    public static void main(String[] args) {
        Quadrado q = new Quadrado(3);
        Circulo c = new Circulo(2);

        System.out.println("Área do quadrado: " + q.calcularArea());
        System.out.println("Área do círculo: " + c.calcularArea());
    }
}

