package br.com.aula7.implementacao;

import java.util.HashMap;
import java.util.Map;

public class ExecutarMAP {

	public static void main(String[] args) {
		Map<Integer, String> h_map = new HashMap<Integer,String>();
		
		h_map.put(10, "azul");
		h_map.put(20, "branco");
		h_map.put(30, "verde");
		h_map.put(40, "preto");
		h_map.put(50, "roxo");
		
		System.out.println(h_map);
		System.out.println("Chaves:: "+ h_map.keySet());
		System.out.println("Valores:: "+ h_map.values());
		
		
		for(Map.Entry item: h_map.entrySet()) {
			System.out.println("Conteudo::: " + item.getKey() + " :::: "+item.getValue());
		}
		
		System.out.println("Tem a chave 20 ? " + h_map.containsKey(20));
		System.out.println("Tem a chave 20 ? "+ h_map.containsValue("azul"));
		System.out.println("Tem a chave 20 ? "+ h_map.get(20));
		
		System.out.println(h_map);
		System.out.println("Remover chave 20 ::: "+h_map.remove(20));
		
		System.out.println(h_map);
	}

}
