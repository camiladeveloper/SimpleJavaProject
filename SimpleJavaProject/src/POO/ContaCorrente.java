package POO;

public class ContaCorrente extends ContaBancaria {
	private static final double LIMITE = 500.0; // limite adicional para saque

	public ContaCorrente(String numeroConta, String titular, double saldoInicial) {
		super(numeroConta, titular, saldoInicial);
	}

	@Override
	public boolean sacar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor de saque inválido.");
			return false;
		}
		double disponivel = getSaldo() + LIMITE;
		if (valor <= disponivel) {
			// permitir usar o limite (saldo pode ficar negativo até -LIMITE)
			setSaldo(getSaldo() - valor);
			System.out.println("Saque de R$ " + valor + " realizado na conta corrente " + getNumeroConta());
			return true;
		} else {
			System.out.println("Saque negado. Ultrapassa limite da conta corrente " + getNumeroConta());
			return false;
		}
	}

	@Override
	public void exibirTipoConta() {
		System.out.println("Conta Corrente - Número: " + getNumeroConta() + " Titular: " + getTitular());
	}
}
