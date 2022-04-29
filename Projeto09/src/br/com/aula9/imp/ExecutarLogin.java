package br.com.aula9.imp;

import javax.swing.JOptionPane;

import br.com.aula9.beans.Login;

public class ExecutarLogin {

	public static void main(String[] args) {
		String usuario = JOptionPane.showInputDialog("Usuário de Acesso: ");
		String senha = JOptionPane.showInputDialog("Senha de Acesso: ");
		
		Login login = new Login();
		
		if(login.fazerLogin(usuario, senha)) {
			JOptionPane.showMessageDialog(null, "Credenciais aceitas....");
		} else {
			JOptionPane.showMessageDialog(null, "Credenciais invalidas....");
		}
	}

}
