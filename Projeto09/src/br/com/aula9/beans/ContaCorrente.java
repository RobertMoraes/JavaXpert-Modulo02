package br.com.aula9.beans;

public class ContaCorrente {
	private double saldo;

	public ContaCorrente(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public String sacar(double valor) {
		return "saque";
	}
	
	public void depositar(double valor) throws Exception {
		if(valor>1000) {
			throw new Exception("Valor não permitido para essa operação");
		}
		
		this.saldo = this.saldo+valor;
	}
	
	
	
}
