package br.com.aula7.implementacao;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class ExecutarSET {

	public static void main(String[] args) {

		Set<String> h_set = new HashSet<String>();
		String txt;
		
		/*
		 * h_set.add("Azul"); h_set.add("Vermelho");
		 * 
		 * System.out.println(h_set.add("preto"));
		 * System.out.println(h_set.add("preto"));
		 * 
		 * 
		 * System.out.println(h_set);
		 * 
		 * for(String item : h_set) { System.out.println("Conteúdo: "+ item); }
		 * 
		 * System.out.println("Esta vazio: "+h_set.isEmpty());
		 * 
		 * System.out.println("Tem a cor azul? "+h_set.contains("Azul"));
		 * System.out.println("Tem a cor azul? "+h_set.contains("Verde"));
		 * 
		 * h_set.remove("verde"); h_set.remove("Azul");
		 * 
		 * System.out.println(h_set);
		 */
		for (int i = 0; i < 5; i++) {
			txt = (JOptionPane.showInputDialog("Informe a cor: "));
			
			h_set.add(txt.toUpperCase());
		}
		System.out.println(h_set);
	}

}
