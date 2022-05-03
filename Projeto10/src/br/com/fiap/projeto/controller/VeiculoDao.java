package br.com.fiap.projeto.controller;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.projeto.model.Veiculo;

public class VeiculoDao {

	List<Veiculo> bancoDeVeiculo = new ArrayList<Veiculo>();

	public VeiculoDao() {
	}

	public boolean conectarDB(String URLConexao) {
		return true;
	}

	public boolean incluir(Veiculo v) {
		if (!conectarDB("url Teste MySQL")) {
			System.out.println("Erro de conexão DB");
			return false;
		}
		bancoDeVeiculo.add(v);
		System.out.println("--log Salvo DB");
		return true;
	}

	public Veiculo consultarPorPlaca(String placa) {
		if (!conectarDB("url Teste MySQL")) {
			System.out.println("Erro de conexão DB");
		}
		
		for(Veiculo item : bancoDeVeiculo) {
			if (item.getPlaca().equalsIgnoreCase(placa)) {
				return item;
			}
		}
		
		return null;

	}
	
	public boolean alterar (Veiculo veiculoLocalizado) {
		if (!conectarDB("url Teste MySQL")) {
			System.out.println("Erro de conexão DB");
		}
		
		for(Veiculo item : bancoDeVeiculo) {
			if (item.getPlaca().equalsIgnoreCase(veiculoLocalizado.getPlaca())) {
				bancoDeVeiculo.remove(item);
				bancoDeVeiculo.add(veiculoLocalizado);
				return true;
			}
		}
		
		return false;
		
	}

	public boolean excluir(Veiculo veiculoLocalizado) {
		if (!conectarDB("url Teste MySQL")) {
			System.out.println("Erro de conexão DB");
		}
		
		for(Veiculo item : bancoDeVeiculo) {
			if (item.getPlaca().equalsIgnoreCase(veiculoLocalizado.getPlaca())) {
				bancoDeVeiculo.remove(item);
				return true;
			}
		}
		
		return false;
		
		
	}

}
