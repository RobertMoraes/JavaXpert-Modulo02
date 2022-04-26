package br.com.fiap.aula07.imp;

import br.com.fiap.aula07.beans.Aluno;

public class ExecutarVetor {

	public static void main(String[] args) {
		Aluno [] listaAlunos = new Aluno[3];
		listaAlunos[0] = new Aluno("Robert", 8, 2, 32);
		
		System.out.println("Aluno:: "+ listaAlunos[0].getNome()+" - "+listaAlunos[0].getIdade());
	}

}
