package br.com.aula7.implementacao;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class ExecutarControleAcessoSET {

	public static void main(String[] args) {
		Set<String> controleAcesso = new HashSet<String>();

		System.out.println("--- Iniciando Controle de Acesso ---");

		int acao;

		while (true) {

			acao = Integer.parseInt(JOptionPane.showInputDialog("Digite \n\t 1 - ENTRADA \n\t 2 - SAÍDA"));
			if (acao == 1 || acao == 2) {
				if (acao == 1) {
					String cracha = JOptionPane.showInputDialog("Leitor Cracha:");

					if (!controleAcesso.contains(cracha)) {
						controleAcesso.add(cracha);
						JOptionPane.showMessageDialog(null, "Bem vindo! \n\t Acesso LIBERADO " + cracha);
					} else {
						JOptionPane.showMessageDialog(null, "Entrada já registrada para o cracha " + cracha);
					}
				}

				if (acao == 2) {
					String cracha = JOptionPane.showInputDialog("Leitor Cracha:");
					if (controleAcesso.contains(cracha)) {
						controleAcesso.remove(cracha);
						JOptionPane.showMessageDialog(null, "Obrigado pela visita! " + cracha);
					} else {
						JOptionPane.showMessageDialog(null, "Entrada não registrada para esse cracha " + cracha);
					}
				}
				System.out.println(controleAcesso);
			} else {
				JOptionPane.showMessageDialog(null, "Informação invalida!!!");
			}
		}

	}

}
