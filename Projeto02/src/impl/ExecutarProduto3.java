package impl;

import beans.Produto;
import util.Entrada;

public class ExecutarProduto3 {

	public static void main(String[] args) {
		Produto p1 = new Produto(Entrada.texto("Produto: "), Entrada.texto("Marca: "), Entrada.decimal("Valor: "), Entrada.logico("Esta em promo��o?"));
		
		Entrada.show(p1.detalhes());
	}

}
