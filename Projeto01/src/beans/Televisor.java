package beans;

public class Televisor {
	private int canal = 0;
	private int volume = 0;
	private boolean ligado = false;
	
	public int getCanal() {
		return canal;
	}
	public void setCanal(int canal) {
		if(canal <= 16 & canal >= 0 ) {
			this.canal = canal;			
		}
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public boolean isLigado() {
		return ligado;
	}
	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	public void aumentarVolume() {
		this.volume++;
	}
	
	public void reduzirVolume() {
		this.volume--;
	}
	
	public void aumentarCanal() {
		setCanal(getCanal()+1);
		System.out.println("canal++");
	}
	
	public void diminuirCanal() {
		setCanal(getCanal()-1);
		System.out.println("canal--");
	}
	
	public void ligarTelevisor() {
		this.ligado = true;
	}
	
	public void desligarTelevisor() {
		this.ligado = false;
	}
	
	public void mostraStatus() {
		String tevStatus;
		if(isLigado()) {
			tevStatus = "Ligado";
		}else {
			tevStatus = "Desligado";
		}
		System.out.println("Televisor: "+ tevStatus+"\n"
				+"Volume: "+this.volume+"\n"
				+"Canal: "+this.canal);
		
	}
}
