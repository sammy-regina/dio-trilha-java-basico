package lanchonete.cozinha;

import lanchonete.atendimento.cozinha.Atendente;

public class Cozinheiro {
	//pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONAR LANCHE NATURAL AO BALCÃO");
	}
	//pode ser default
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCÃO");
	}
	//pode ser default
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
		}
	public void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
	}
	public void prepararVitamina() {
		System.out.println("PREPARANDO SUCO");
	}
	public void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	public void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
	}
	public void selecionarIngredientesVitamina() {
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
	}
	public void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	public void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
	}
	public void fritatIngredientesLanche() {
		System.out.println("FRITAR A CARNE E OVO PARA HAMBURGUER");
	}
	public void pedirParaTrocarGas(Atendente meuAmigo) {
		meuAmigo.trocarGas();
	}
	public void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	public void pedirParaTrocarGas(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
	
}
