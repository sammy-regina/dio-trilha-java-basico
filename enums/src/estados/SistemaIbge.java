package estados;

public class SistemaIbge {
	public static void main(String[] args) {
		//mostra todos os valores do enum
		for(EstadoBrasileiro e: EstadoBrasileiro.values()) {
			System.out.println(e.getSigla() + " - " + e.getNome());
		}
		//mostra apenas de um estado 
		EstadoBrasileiro eb = EstadoBrasileiro.PIAUI; // só alterar o nome do estado
		System.out.println(eb.getNome());
		System.out.println(eb.getSigla());
		System.out.println(eb.getNomeMaiusculo());
		
	}
}
