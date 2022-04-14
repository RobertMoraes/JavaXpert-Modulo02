package beans;

public class Pessoa {
	private int id;
	private String nome;
	private int idade;
	private String sentimento;
	private String cidade;
	
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSentimento() {
		return sentimento;
	}

	public void setSentimento(String sentimento) {
		this.sentimento = sentimento;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void comer(String refeicao) {
		System.out.println("Tipo de refeição: "+ refeicao);
		this.sentimento = "Satisfeito!";
	}
	
	public void dormir(int tempo) {
		if(tempo>=8) {
			this.sentimento = "Descansado";
			System.out.println("Tempo de sono: "+tempo);
		}else {
			this.sentimento = "Cansado";
			System.out.println("Tempo de sono: "+tempo);
		}
		
	}
}
