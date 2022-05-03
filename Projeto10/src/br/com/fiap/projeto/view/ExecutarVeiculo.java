package br.com.fiap.projeto.view;

import br.com.fiap.projeto.controller.VeiculoDao;
import br.com.fiap.projeto.model.Veiculo;
import br.com.fiap.projeto.util.EntradaTela;

public class ExecutarVeiculo {

	public static void main(String[] args) {
		String opcao;
		Veiculo v = new Veiculo();
		VeiculoDao veiculoDao = new VeiculoDao();
		String placa;
		Veiculo veiculoLocalizado;

		do {
			opcao = EntradaTela.texto("===== Controle de Veiculos ==== \n\n" + "Escolha a opção: \n"
					+ "<I>ncluir \n<A>lterar \n<C>onsultar \n<E>xcluir \n<S>air");

			switch (opcao.charAt(0)) {

			case 'I':
				v = new Veiculo(EntradaTela.texto("Placa:"), EntradaTela.texto("Modelo:"),
						EntradaTela.inteiro("Potencia:"), EntradaTela.texto("Proprietario:"));
				veiculoDao.incluir(v);
				break;
			case 'A':
				placa = EntradaTela.texto("Digite a placa para alteração: ");

				veiculoLocalizado = veiculoDao.consultarPorPlaca(placa);

				if (veiculoLocalizado == null) {
					EntradaTela.show("Veiculo não Localizado....");
					break;
				}

				veiculoLocalizado.setPotenca(EntradaTela.inteiro("Potencia: "));
				veiculoLocalizado.setProprietario(EntradaTela.texto("Proprietario: "));

				veiculoDao.alterar(veiculoLocalizado);

				break;
			case 'C':
				placa = EntradaTela.texto("Digite a placa: ");

				veiculoLocalizado = veiculoDao.consultarPorPlaca(placa);

				if (veiculoLocalizado == null) {
					EntradaTela.show("Veiculo não Localizado....");
					break;
				}

				EntradaTela.show("=== Dados do Veiculo ===\n" + "\nPlaca: " + veiculoLocalizado.getPlaca()
						+ "\nModelo: " + veiculoLocalizado.getModelo() + "\nPotencia: " + veiculoLocalizado.getPotenca()
						+ "\nProprietario: " + veiculoLocalizado.getProprietario());
				break;
			case 'E':

				placa = EntradaTela.texto("Digite a placa para alteração: ");

				veiculoLocalizado = veiculoDao.consultarPorPlaca(placa);

				if (veiculoLocalizado == null) {
					EntradaTela.show("Veiculo não Localizado....");
					break;
				}

				if (!veiculoDao.excluir(veiculoLocalizado)) {
					EntradaTela.show("Erro ao executar a exclusão...");
				} else {
					EntradaTela.show("Veiculo excluido com sucesso....");
				}

				break;
			case 'S':
				break;
			default:
				EntradaTela.show("Você precisa digitar as iniciais do menu!");
				break;
			}

		} while (!opcao.equalsIgnoreCase("S"));
	}

}
