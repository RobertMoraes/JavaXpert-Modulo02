package implementacao;

import beans.Televisor;

public class ExecutarTelevisor {

	public static void main(String[] args) {
		System.out.println("Usando a TV...!!!");
		
		Televisor tv = new Televisor();
		
		tv.mostraStatus();
		
		tv.aumentarVolume();
		tv.aumentarVolume();
		tv.aumentarVolume();
		
		tv.mostraStatus();
		
		tv.aumentarCanal();
		tv.aumentarCanal();
		
		tv.mostraStatus();
		
		tv.diminuirCanal();
		tv.diminuirCanal();
		tv.diminuirCanal();
		tv.diminuirCanal();
		
		tv.mostraStatus();
	}

}
