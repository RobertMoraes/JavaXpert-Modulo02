package br.com.fiap.aula4.imp;

import br.com.fiap.aula4.beans.Motor;
import br.com.fiap.aula4.beans.Veiculo;

public class ExecutarVeiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Veiculo fusca = new Veiculo();
		Veiculo kombi = new Veiculo();
		
		Motor vw = new Motor(1000,4,"gasolina");
		vw.ligar();
		vw.desligar();
		
		fusca.setModelo("Conversivel");
		fusca.setCategoria("Compact");
		fusca.setPlaca("eux-9435");
		fusca.setPortas(2);
		fusca.setMotor(vw);
		
		System.out.println(fusca.getModelo()+"-------------"+fusca.getMotor().toString());
		fusca.acelerar();
		
		kombi.acelerar();
	}

}
