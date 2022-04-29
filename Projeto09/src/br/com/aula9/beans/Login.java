package br.com.aula9.beans;

public class Login {
	private String usuario;
	private String senha;
	
	private String userAcesso = "admin";
	private String userSenha = "admin";
	
	public Login() {}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
//	public boolean fazerLogin(String user, String password) {
//		if(user.equalsIgnoreCase(this.userAcesso)&& password.equalsIgnoreCase(this.userSenha)) {
//			return true;
//		}
//		 return false;
//	}
	
	public boolean fazerLogin(String user, String password) {
		try {
			if(user.equalsIgnoreCase(this.userAcesso)&& password.equalsIgnoreCase(this.userSenha)) {
				return true;
			}
			throw new Exception("log: Usario/Senha Invalidos - "+ user);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		 return false;
	}
}
