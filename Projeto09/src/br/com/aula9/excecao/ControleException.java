package br.com.aula9.excecao;

public class ControleException extends Exception {
	public ControleException(String message, Exception e) {
		super(message,e);
		print();
		
        if (message.equalsIgnoreCase("email")){
            enviarEmail();
        }
        
        if(message.equalsIgnoreCase("log")) {
        	logbanco();
        }
	}
	
    private void enviarEmail() {
        String smtpServer = "smtp://fiap.br";
        String smtpPort = "22";

        System.out.println("-Abrindo Conexao email");
        System.out.println("-email suporte: Supote@fiap.br");
        System.out.println("-----Detalhes----");
        System.out.println(getMessage());
        printStackTrace();
    }
    
    private void logbanco() {
        System.out.println("-Abrindo Conexao DB");
        System.out.println("----- Gravando Detalhes----");
        System.out.println(getMessage());
        printStackTrace();
    }
	
	private void print() {
		System.out.println("=== Meu Exception ===");
		System.out.println(getMessage());
	}
}
