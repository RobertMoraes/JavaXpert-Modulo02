package implementacao;

import beans.ContaBancaria;

public class ExecutarContaBancaria {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		
		ContaBancaria cb1 = new ContaBancaria();
		
		cb1.setNumeroConta(101101);
		cb1.deposito(600);
		
		cb1.deposito(600);
		cb1.saque(200);
	}

}
