package br.com.fiap.aula3.beans;

public class ContaBancaria {
	Banco banco;
	Cliente cliente;
	int tipoConta;
	int numeroConta;
	double saldoConta;
	double limiteEspecial;
	
	public ContaBancaria() {}
		
	public ContaBancaria(Banco banco, Cliente cliente, int tipoConta, int numeroConta) {
		super();
		this.banco = banco;
		this.cliente = cliente;
		this.tipoConta = tipoConta;
		this.numeroConta = numeroConta;
	}

	
	public ContaBancaria(Banco banco, Cliente cliente, int tipoConta, int numeroConta, double saldoConta,
			double limiteEspecial) {
		super();
		this.banco = banco;
		this.cliente = cliente;
		this.tipoConta = tipoConta;
		this.numeroConta = numeroConta;
		this.saldoConta = saldoConta;
		this.limiteEspecial = limiteEspecial;
	}

	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getTipoConta() {
		return tipoConta;
	}
	public void setTipoConta(int tipoConta) {
		this.tipoConta = tipoConta;
	}
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
	public double getLimiteEspecial() {
		return limiteEspecial;
	}
	public void setLimiteEspecial(double limiteEspecial) {
		this.limiteEspecial = limiteEspecial;
	}
	
	public void deposito(double valor) {
		System.out.println("Processo de deposito: ");
		if(this.saldoConta>=0) {
			System.out.println("Limite positivo");
			this.saldoConta = this.saldoConta + valor;
			extrato();
		}else {
			System.out.println("Limite zerado");
			this.limiteEspecial += this.saldoConta*(-1);
			this.saldoConta +=valor;
			extrato();
		}
	}
	
	public void definirLimite(double limiteEspecial) {
		if(this.tipoConta == 1) {
			this.limiteEspecial = limiteEspecial;
			System.out.println("Sucesso! Limite Liberado!");
		}else {
			System.out.println("Tipo de Conta Invalida");
		}
	}
	public void saque( double valor) {
		System.out.println("Processo de saque: ");
		if(this.tipoConta == 1) {
			if(this.saldoConta>= valor) {
				System.out.println("Saque conta corrente: ");
				this.saldoConta = this.saldoConta - valor;
				System.out.println("Saque autorizado.");
				extrato();
			}else if(this.limiteEspecial>= valor) {
				System.out.println("Saque limite Especial: ");
				this.limiteEspecial=this.limiteEspecial - valor;
				this.saldoConta = this.saldoConta-valor;
				System.out.println("Saque autorizado.");
				extrato();
			}else {
				System.out.println("Saldo insuficiente");
				extrato();	
			}
		}else if(this.tipoConta == 2) {
			System.out.println("Saque conta poupança: ");
			if(this.saldoConta >= valor) {
				this.saldoConta = this.saldoConta - valor;
				System.out.println("Saque autorizado.");
			}
			System.out.println("Saldo insuficiente");
			extrato();
		}

	}
	
	public void extrato() {
		System.out.println("Conta: "+ this.numeroConta +"\n"+"Saldo: "+ this.saldoConta+"\nLimite Especial: "+this.limiteEspecial);
	}
	
	public String detalhes() {
		String conta;
		if(tipoConta == 1 ) {
			conta = "Conta Corrente";
		}else {
			conta = "Conta Poupança";
		}
		return banco.getRazaoSocial()+"\nCódigo Bancário: "+banco.getIdBancario()+"\n"+cliente+"\nTipo Conta: "+conta
				+"\nNumero Conta: "+numeroConta+"\nSaldo Inicial: "+saldoConta+"\nLimite Especial: "+limiteEspecial;
	}
	
}
