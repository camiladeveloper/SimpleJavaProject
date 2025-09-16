package POO;

public interface OperacoesBancarias {
    void depositar(double valor);
    boolean sacar(double valor);
    boolean transferir(ContaBancaria destino, double valor);
}