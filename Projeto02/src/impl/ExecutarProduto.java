package impl;

import javax.swing.JOptionPane;

import beans.Produto;

public class ExecutarProduto {

	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	
	public static boolean logico(String msg) {
		if(JOptionPane.showConfirmDialog(null, msg, "Pergunta", JOptionPane.YES_NO_OPTION)==0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {

		Produto p1 = new Produto();
		p1.setNome("Note Dell");
		p1.setValor(100);
		
		System.out.println(p1.getNome() + " - R$ " + p1.getValor());
		
		Produto p2 = new Produto();
		p2.setNome("Impressora");
		p2.setValor(200);
		
		System.out.println(p2.getNome() + " - R$ " + p2.getValor());
		
		Produto p3 = new Produto("Monitor LG", 2000);
		
		System.out.println(p3.getNome() + " - R$ " + p3.getValor());
		
		Produto p4 = new Produto("S10","Samsung",3500,true);
			
		System.out.println(p4.detalhes());
		
		Produto p5 = new Produto(
				texto("Informe o produto:"),
				texto("Informe a marca:"),
				Double.parseDouble(texto("Informe o valor:")),
				Boolean.parseBoolean(texto("Em promo??o?"))	
		);
		
		System.out.println(p5.detalhes());
		
		Produto p6 = new Produto(
				texto("Informe o produto:"),
				texto("Informe a marca:"),
				Double.parseDouble(texto("Informe o valor:")),
				logico("Est? em promo??o")
		);
		
		System.out.println(p6.detalhes());
	}

}
