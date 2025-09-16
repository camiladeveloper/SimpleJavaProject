package POO;

public class Radio implements Controlavel {
    @Override
    public void ligar() {
        System.out.println("Rádio ligado. Tocando estação...");
    }

    @Override
    public void desligar() {
        System.out.println("Rádio desligado.");
    }
}
