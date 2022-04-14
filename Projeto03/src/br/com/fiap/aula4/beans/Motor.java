package br.com.fiap.aula4.beans;

public class Motor {
	private int potencia;
	private int cilindros;
	private String combustivel;
		
	//construstor
	public Motor() {}
	
	public Motor(int potencia, int cilindros, String combustivel) {
		this.potencia = potencia;
		this.cilindros = cilindros;
		this.combustivel = combustivel;
	}
	
	//getters e setters
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public int getCilindros() {
		return cilindros;
	}
	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	//metodos
	
	public void ligar() {
		System.out.println("Ligando....!!!");
	}
	
	public void desligar() {
		System.out.println("Desligando...!!!!");
	}

	@Override
	public String toString() {
		return "Motor [potencia=" + potencia + ", cilindros=" + cilindros + ", combustivel=" + combustivel + "]";
	}
	
	
}
