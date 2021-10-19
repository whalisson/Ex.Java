package banco;

public class ContaPoupanca extends ContaBancaria {
	double rendimento;
	
	public ContaPoupanca(String nome, String numerodaconta, double saldo) {
		super(nome, numerodaconta, saldo);
		
	}
	public double calcularNovoSaldo(double rendimento) {
			ContaBancaria cb = new ContaBancaria();
			rendimento *= saldo;
			saldo += rendimento;
			return saldo;
		}
	@Override
	public String toString() {
		return "nome:" + nome + ", numerodaconta:" + numerodaconta + ", saldo:" + saldo;
	}
}
