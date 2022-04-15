package br.com.fiap.aula3.impl;

import br.com.fiap.aula3.beans.Produto;
import br.com.fiap.aula3.util.Entrada;

public class ExecutarProduto3 {

	public static void main(String[] args) {
		Produto p1 = new Produto(Entrada.texto("Produto: "), Entrada.texto("Marca: "), Entrada.decimal("Valor: "), Entrada.logico("Esta em promoção?"));
		
		Entrada.show(p1.detalhes());
	}

}
