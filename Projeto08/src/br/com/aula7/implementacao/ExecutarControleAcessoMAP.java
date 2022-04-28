package br.com.aula7.implementacao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class ExecutarControleAcessoMAP {

	public static void main(String[] args) {
		Map<Integer, Date> controleAcesso = new HashMap<Integer, Date>();

		System.out.println("--- Iniciando Controle de Acesso ---");

		int acao;
		int cracha = 0;

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));

		while (true) {

			acao = Integer.parseInt(JOptionPane.showInputDialog("Digite \n\t 1 - ENTRADA \n\t 2 - SAÍDA"));
			if (acao == 1 || acao == 2) {
				if (acao == 1) {
					cracha = Integer.parseInt(JOptionPane.showInputDialog("Leitor Cracha:"));

					if (!controleAcesso.containsKey(cracha)) {
						controleAcesso.put(cracha, new Date());
						JOptionPane.showMessageDialog(null, "Bem vindo! \n\t Acesso LIBERADO " + cracha);
					} else {
						JOptionPane.showMessageDialog(null, "Entrada já registrada para o cracha " + cracha);
					}
				}

				if (acao == 2) {
					cracha = Integer.parseInt(JOptionPane.showInputDialog("Leitor Cracha:"));
					if (controleAcesso.containsKey(cracha)) {
						controleAcesso.remove(cracha);
						JOptionPane.showMessageDialog(null, "Obrigado pela visita! " + cracha);
					} else {
						JOptionPane.showMessageDialog(null, "Entrada não registrada para esse cracha " + cracha);
					}
				}
				System.out.println(cracha + " :::: "+ dateFormat.format(controleAcesso.get(cracha)));
			} else {
				JOptionPane.showMessageDialog(null, "Informação invalida!!!");
			}
		}

	}

}
