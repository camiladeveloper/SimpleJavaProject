package Projects;
import java.util.Arrays;
import java.util.Scanner;

public class Celular {
    String marca;
    String modelo;
    int memoria;
    boolean ligado;

    public void ligar() {
        ligado = true;
        System.out.println("Celular ligado.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Celular desligado.");
    }

    public void mostrarInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Memória: " + memoria + "GB");
    }

    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    public void enviarMensagem(String[] numeros, String mensagem) {
        System.out.println("Enviando mensagem para " + Arrays.toString(numeros) + ": " + mensagem);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criando celular e preenchendo atributos
        Celular celular1 = new Celular();
        celular1.marca = "Apple";
        celular1.modelo = "iPhone 14";
        celular1.memoria = 128;

        
        celular1.ligar();
        celular1.mostrarInfo();
        celular1.desligar();

        // Digitando mensagem
        System.out.println("\nDigite uma mensagem para enviar:");
        String mensagem = sc.nextLine();

        System.out.println("Digite o número de destino:");
        String numero = sc.nextLine();
        celular1.enviarMensagem(numero, mensagem);

        // Enviando para vários números
        System.out.println("\nDigite 3 números para enviar a mesma mensagem:");
        String[] numeros = new String[3];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextLine();
        }
        celular1.enviarMensagem(numeros, mensagem);

        sc.close();
    }
}
