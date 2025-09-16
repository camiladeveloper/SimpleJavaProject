package POO;

public class MainControlavel {

    public static void main(String[] args) {
        Controlavel tv = new Televisao();
        Controlavel radio = new Radio();

        tv.ligar();
        tv.desligar();

        radio.ligar();
        radio.desligar();
    }

}
