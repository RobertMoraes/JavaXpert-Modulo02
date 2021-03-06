package implementacao;

import java.text.SimpleDateFormat;
import java.util.Scanner;

import beans.AgendaRevisao;

public class ExecutarAgendaRevisao {

	public static void main(String[] args) throws Exception {
		
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		
		SimpleDateFormat formataHora = new SimpleDateFormat("HH:mm");
		
		AgendaRevisao agendaRevisao = new AgendaRevisao();
		@SuppressWarnings("resource")
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe cliente: ");
		agendaRevisao.cliente = leitor.nextLine();
		
		System.out.println("Informe modelo: ");
		agendaRevisao.modelo = leitor.nextLine();
		
		System.out.println("Informe Data: (dd/MM/yyyy) ");
		agendaRevisao.data = formataData.parse(leitor.nextLine());
		
		System.out.println("Informe Hora: (HH:mm) ");
		agendaRevisao.hora = formataHora.parse(leitor.nextLine());
		
		System.out.println("Informe quilometragem: ");
		agendaRevisao.kmVeiculo = leitor.nextLong();
		
		
		System.out.println("Agendado para a seguinte data "+agendaRevisao.data+" as "
								+ agendaRevisao.hora+".\n"+
							"Modelo do veiculo "+ agendaRevisao.modelo+" Km do veiculo "+agendaRevisao.kmVeiculo+"\n"
							+"Responsável pelo agendamento "+agendaRevisao.cliente);
		

		
	}

}
