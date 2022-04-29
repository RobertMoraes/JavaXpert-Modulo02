package br.com.aula9.imp;

import javax.swing.JOptionPane;

import br.com.aula9.excecao.ControleException;

public class ExecutarControleException {
	public static void main(String[] args) throws ControleException {
		try {
			int vl1 = Integer.parseInt(JOptionPane.showInputDialog("Valor1: "));
			int vl2 = Integer.parseInt(JOptionPane.showInputDialog("Valor2: "));

			if (vl1 > vl2) {
				JOptionPane.showMessageDialog(null, "Resultado = " + (vl1 / vl2));
			} else {
				JOptionPane.showMessageDialog(null, "Resultado = " + (vl2 / vl1));
			}

		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Estamos com instabilidade..");
			throw new ControleException("EMAIL", e);
			
		} catch (ArithmeticException e) {
			JOptionPane.showMessageDialog(null, "Estamos com instabilidade..");
			throw new ControleException("LOG", e);
		
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Operação Invalida");
			throw new ControleException("ERROR", e);

		} finally {
			JOptionPane.showMessageDialog(null, "Processo Finalizado!");
		}
	}
}
