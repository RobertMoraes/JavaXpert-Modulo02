package implementacao;

import java.util.Scanner;

import beans.Livro;

public class ExecutarLivro {

	public static void main(String[] args) {
		System.out.println("Iniciando...!!!");
		
		Livro objetoLivro = new Livro();
		Livro objetoLivro2 = new Livro();
		
		objetoLivro.autor = "Graciliamos Ramos";
		objetoLivro.titulo = "Vidas Secas";
		
		System.out.println("Titulo: "+ objetoLivro.titulo +" "+ "Autor: "+ objetoLivro.autor);
		
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o autor: ");
		objetoLivro2.autor = leitor.nextLine();
		
		System.out.println("Digite o titulo: ");
		objetoLivro2.titulo = leitor.nextLine();
		
		System.out.println(objetoLivro2.titulo + "\n"+ objetoLivro2.autor);
	}

}
