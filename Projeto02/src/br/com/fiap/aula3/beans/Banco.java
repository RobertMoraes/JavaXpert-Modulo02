package br.com.fiap.aula3.beans;

public class Banco {
	private String razaoSocial;
	private int idBancario;
	
	public Banco() {
		super();
	}
	
	public Banco(String razaoSocial, int idBancario) {
		super();
		this.razaoSocial = razaoSocial;
		this.idBancario = idBancario;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public int getIdBancario() {
		return idBancario;
	}
	public void setIdBancario(int idBancario) {
		this.idBancario = idBancario;
	}

	@Override
	public String toString() {
		return "Banco [razaoSocial=" + razaoSocial + ", idBancario=" + idBancario + "]";
	}	
	
}
