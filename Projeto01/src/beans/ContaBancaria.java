package beans;

public class ContaBancaria {
	String cliente;
	String tipoConta;
	int numeroConta;
	double saldoConta;
	
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldoConta() {
		return saldoConta;
	}
	public void setSaldoConta(double saldoConta) {
		this.saldoConta = saldoConta;
	}
	
	
	public void deposito(double valor) {
		this.saldoConta = this.saldoConta + valor;
		extrato();
	}
	
	public void saque( double valor) {
		this.saldoConta = this.saldoConta - valor;
		extrato();
	}
	
	public void extrato() {
		System.out.println("Conta: "+ this.numeroConta +"\n"+"Saldo: "+ this.saldoConta);
	}
	
}
