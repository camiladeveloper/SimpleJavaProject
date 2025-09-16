package POO;

public abstract class ContaBancaria implements OperacoesBancarias {
	private String numeroConta;
	private String titular;
	private double saldo;

	public ContaBancaria(String numeroConta, String titular, double saldoInicial) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldoInicial;
	}

	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depositado R$ " + valor + " na conta " + numeroConta);
		} else {
			System.out.println("Valor de depósito inválido.");
		}
	}

	@Override
	public boolean sacar(double valor) {
		if (valor <= 0) {
			System.out.println("Valor de saque inválido.");
			return false;
		}
		if (valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$ " + valor + " realizado na conta " + numeroConta);
			return true;
		} else {
			System.out.println("Saldo insuficiente na conta " + numeroConta);
			return false;
		}
	}

	@Override
	public boolean transferir(ContaBancaria destino, double valor) {
		if (this.sacar(valor)) {
			destino.depositar(valor);
			System.out.println("Transferência de R$ " + valor + " de " + this.numeroConta + " para " + destino.numeroConta);
			return true;
		} else {
			System.out.println("Transferência falhou por falta de saldo.");
			return false;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	protected void setSaldo(double saldo) { // protegido para uso interno por subclasses (ex: rendimento)
		this.saldo = saldo;
	}

	public abstract void exibirTipoConta();
}
