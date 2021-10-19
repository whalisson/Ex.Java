package banco;

public class ContaEspecial extends ContaBancaria{
	double limite;
	
	@Override
	public double sacar(double valorsaque) {
		double limite = -1000;
		if (saldo - valorsaque >= limite) {
			saldo =- valorsaque;
		}
		return saldo;
	}
	
}
