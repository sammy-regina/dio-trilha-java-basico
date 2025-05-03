package lanchonete;


import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.cozinha.Atendente;
import lanchonete.cozinha.Almoxarife;
import lanchonete.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main (String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estarem disponíveis
		cozinheiro.lavarIngredientes();
		cozinheiro.baterVitaminaLiquidificador();
		cozinheiro.selecionarIngredientesVitamina();
		cozinheiro.prepararLanche();
		cozinheiro.prepararVitamina();
		cozinheiro.prepararVitamina();
		
		//ações que o estabelecimento precisa ter ciencia
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		
		Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estar disponiveis para toda a aplicação
		almoxarife.controlarEntrada();
		almoxarife.controlarSaida();
		//ações que somente o seu pacote cozinha precisa conhecer
		almoxarife.entregarIngredientes();
		almoxarife.trocarGas();
		
		Atendente atendente = new Atendente();
		atendente.pegarLancheCozinha();
		atendente.receberPagamento();
		atendente.servirMesa();
		//ações que somente o seu pocote cozinha precisa conhecer
		atendente.trocarGas();
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
		cliente.pegarPedidoBalcao();
		
		cliente.consultarSaldoAplicativo();
		
		cozinheiro.pedirParaTrocarGas(atendente);
		cozinheiro.pedirParaTrocarGas(almoxarife);
	}

}
