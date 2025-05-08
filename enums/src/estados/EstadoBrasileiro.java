package estados;

public enum  EstadoBrasileiro {
	SAO_PAULO ("SP", "SÃO PAULO"),
	RIO_JANEIRO ("RJ", "RIO DE JANEIRO"),
	PIAUI ("PI", "PIAUÍ"),
	MARANHAO ("MA", "MARANHÃO");
	
	private String nome;
	private String sigla;
	
	private EstadoBrasileiro(String sigla, String nome) {
		this.sigla = sigla;
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
}