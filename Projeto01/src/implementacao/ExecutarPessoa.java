package implementacao;

import beans.Pessoa;

public class ExecutarPessoa {

	public static void main(String[] args) {
		System.out.println("Iniciando...!!!");
		
		Pessoa p1 = new Pessoa();

		p1.setNome("Robert");
		p1.setIdade(32);
		p1.setCidade("Jaboticabal");
		p1.setSentimento("Nervoso");
		
		System.out.println("Dados cliente: ");
		System.out.println("Nome: "+ p1.getNome()+"\n"+"Idade: "+p1.getCidade()+"\n"
				+"Cidade: "+p1.getCidade());
		
		p1.comer("Almo�o");
		System.out.println("Sentimento atual ap�s comer: "+p1.getSentimento());
		
		p1.dormir(8);
		System.out.println("Sentimento atual ap�s dormir: "+p1.getSentimento());
	}

}
