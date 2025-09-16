package POO;

public class Televisao implements Controlavel {
    @Override
    public void ligar() {
        System.out.println("Televisão ligada. Exibindo canal...");
    }

    @Override
    public void desligar() {
        System.out.println("Televisão desligada.");
    }
}
