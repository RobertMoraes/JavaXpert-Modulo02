package br.com.fiap.aula3.util;

import javax.swing.JOptionPane;

public class EntradaUtil {
	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}

	public static double decimal(String msg) {
		return Double.parseDouble(texto(msg).toUpperCase());
	}

	public static boolean logico(String msg) {
		if (JOptionPane.showConfirmDialog(null, msg, "Pergunta", JOptionPane.YES_NO_OPTION) == 0) {
			return true;
		}
		return false;
	}

	public static void show(String msg) {
		JOptionPane.showMessageDialog(null, msg, "Item Compra: ", 1);
	}

	public static int inteiro(String msg) {
		return Integer.parseInt(texto(msg).toUpperCase());
	}
}
