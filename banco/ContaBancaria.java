package banco;

public class ContaBancaria {
	protected String nome;
	protected String numerodaconta;
	protected double saldo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumerodaconta() {
		return numerodaconta;
	}
	public void setNumerodaconta(String numerodaconta) {
		this.numerodaconta = numerodaconta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double sacar(double valorsaque) {
		if (saldo - valorsaque >= 0) {
			saldo -= valorsaque;
		}
		return saldo;
	}
	public double depositar(double valordeposito) {
		saldo += valordeposito;
		return saldo;
	}
	public ContaBancaria(String nome, String numerodaconta, double saldo) {
		super();
		this.nome = nome;
		this.numerodaconta = numerodaconta;
		this.saldo = saldo;
	}
	public ContaBancaria() {
		
	}
	@Override
	public String toString() {
		return "nome" + nome + ", numerodaconta=" + numerodaconta + ", saldo=" + saldo;
	}
	
}
