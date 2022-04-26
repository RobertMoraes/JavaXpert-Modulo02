package br.com.fiap.aula5.imp;

import br.com.fiap.aula5.beans.Livro;
import br.com.fiap.aula5.beans.Produto;

public class ExecutarProduto {

	public static void main(String[] args) {
		
		Produto p1 = new Produto(1, 40, "Mouse Pad");
		
		Livro l1 = new Livro(2, 39.90, "Texto", "Isbn", "Robert");
		
		System.out.println(l1.detalhes());
		
	}

}
