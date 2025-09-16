package POO;

public class ContaPoupanca extends ContaBancaria {

	public ContaPoupanca(String numeroConta, String titular, double saldoInicial) {
		super(numeroConta, titular, saldoInicial);
	}

	public void calcularRendimento() {
		double novoSaldo = getSaldo() * 1.02; // +2%
		setSaldo(novoSaldo);
		System.out.println("Rendimento aplicado na poupança " + getNumeroConta() + ". Novo saldo: R$ " + getSaldo());
	}

	@Override
	public void exibirTipoConta() {
		System.out.println("Conta Poupança - Número: " + getNumeroConta() + " Titular: " + getTitular());
	}
}
