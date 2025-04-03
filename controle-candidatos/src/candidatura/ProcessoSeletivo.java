package candidatura;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		//analisarCandidato(1900.0);
		//analisarCandidato(2200.0);
		//analisarCandidato(2000.0);
		
		//selecaoCandidatos();
		
		//imprimirSelecionados();
		
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}
	//método ligar/entrar em contato
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {//condição pra continuar ligando
			atendeu = atender(); //se atender, atendeu encerra
			continuarTentando = !atendeu;//se for diferente de atender continuar tentando
			if(continuarTentando)// se continuar tentando
				tentativasRealizadas ++;//contar a tentativa realizada + 1 
			else
				System.out.println("Contato com " + candidato + " realizado com sucesso!");//se atender(atendeu=true)
		}while(continuarTentando && tentativasRealizadas <3); //enquanto tentativas realizadas for menor que 3 continuar tentando
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA.");
		else 
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + " NUMERO MAXIMO DE TENTATIVAS: " + tentativasRealizadas);
	}
	
	//método auxiliar "Atender"
	static boolean atender() {
		return new Random().nextInt(3)== 1;
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento.");
		
		for(int indice = 0; indice < candidatos.length; indice ++) {
		System.out.println("O candidato de nº " + (indice + 1) + " é: " + candidatos[indice]);
		}
		System.out.println("Forma abreviada de interação for each");
		for (String candidato: candidatos) {
			System.out.println("O candidato selecionado foi: " + candidatos);
		}	
	}
	
	static void selecaoCandidatos() {
		String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou este valor de salário: R$ " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
				candidatosSelecionados++;
			}
			candidatosAtual ++;
		}
	}
	
	// método para gerar valorPretendido aleatório
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO.");
		}
		else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA.");
		}
		else {
			System.out.println("AGUARDANDO RRESULTADO DOS DEMAIS CANDIDATOS.");
		}
	}
}
