package br.com.fiap.aula3.impl;

import br.com.fiap.aula3.beans.Banco;
import br.com.fiap.aula3.beans.Cliente;
import br.com.fiap.aula3.beans.ContaBancaria;
import br.com.fiap.aula3.util.EntradaUtil;

public class ExecutarContaBancaria {

	public static void main(String[] args) {
		System.out.println("Iniciando...");
		
		/*
		 * Banco b1 = new Banco(); Cliente cli1 = new Cliente();
		 * 
		 * ContaBancaria cb1 = new ContaBancaria(b1,cli1,1,100112);
		 * 
		 * cb1.deposito(1200.00);
		 * 
		 * cb1.definirLimite(100.00);
		 * 
		 * cb1.saque(200.00); cb1.saque(1000.00); cb1.saque(100.00); cb1.saque(100.00);
		 * cb1.deposito(500.00); cb1.deposito(300.00);
		 * 
		 * Cliente cli2 = new Cliente();
		 * 
		 * ContaBancaria cb2 = new ContaBancaria(b1,cli2,2,100110);
		 * 
		 * cb2.deposito(1200.00);
		 * 
		 * cb2.definirLimite(100.00);
		 * 
		 * cb2.saque(200.00); cb2.saque(1000.00); cb2.saque(100.00); cb2.saque(100.00);
		 * cb2.deposito(500.00); cb2.deposito(300.00);
		 * 
		 * Cliente cli3 = new Cliente();
		 * 
		 * ContaBancaria cb3 = new ContaBancaria(b1,cli3,1,100111, 3000, 500);
		 * 
		 * System.out.println(cb3.detalhes());
		 */
		
		Banco b2 = new Banco(EntradaUtil.texto("Razão Scocial: "),EntradaUtil.inteiro("Código Bancário: "));
		
		Cliente cli4 = new Cliente(EntradaUtil.texto("Insira nome do cliente: "),
				EntradaUtil.texto("Insira o CPF do cliente: "),EntradaUtil.texto("Insira DDD e telefone do cliente: "));
		
		ContaBancaria cb4 = new ContaBancaria(b2,cli4,
				EntradaUtil.inteiro("Informe o tipode conta"+"\n1 - Conta Corrente"+"\n2 - Conta Poupança"),
				EntradaUtil.inteiro("Informe o numero da conta:"));
		
		
		
		EntradaUtil.show(cb4.detalhes());
		
		
		
		/*
		 * int movimentacao = 0; switch (movimentacao) { case 1: //cadastro nova conta
		 * 
		 * break;
		 * 
		 * case 2: // saque conta
		 * 
		 * break;
		 * 
		 * case 3: //deposito conta
		 * 
		 * break;
		 * 
		 * default: break; }
		 */
		
	}

}
