package br.com.aula9.imp;

import javax.swing.JOptionPane;

import br.com.aula9.beans.ContaCorrente;

public class ExecutarContaCorrente {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(5000);

		try {
			System.out.println("Saldo: " + cc.getSaldo());
			cc.depositar(1500);
			System.out.println("Saldo: " + cc.getSaldo());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		

	}

}
