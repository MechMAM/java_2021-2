package br.fag.restaurante;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Principal {
	
	private static Random randomizar = new Random();
	
	private static EstruturaQualquer<EstruturaCardapio> cardapio = Cardapio.gerarCardapio();
	private static EstruturaQualquer<EstruturaBebida> bebidas = Bebidas.gerarBebidas();
	private static EstruturaQualquer<EstruturaChocolate> chocolates = Chocolates.gerarChocolates();
	private static EstruturaQualquer<EstruturaCliente> clientes = Clientes.gerarClientes();
	
	private static Stack<EstruturaChocolate> pilhaChocolates = new Stack<EstruturaChocolate>();
	private static ArrayList<EstruturaCliente> clientesRestaurante = new ArrayList<EstruturaCliente>();
	private static Queue<EstruturaCliente> filaCaixa = new LinkedList<EstruturaCliente>();
	
	public static void main(String[] args) {
		
		int opcao=0;
		int nClientes=0;
		
		while (clientesRestaurante.size()<20) {
			nClientes = obterNClientes();
			adicionarCliente(nClientes);
			Apoio.exibirMensagem("\n"+nClientes+" Clientes entraram no restaurante!");
		}
		
		opcao = obterOpcoes();
		do {
			processarOpcao(opcao);
			opcao = obterOpcoes();			
		} while (opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4  || opcao == 5);
		processarOpcao(opcao);
		Apoio.exibirMensagem("Obrigado por utilizar o sistema!");
		
	}


	private static int obterNClientes() {
		int nClientes = 0;
		int nPossivel = 20-clientesRestaurante.size();
		nClientes = Apoio.obterDadosInteiros("Digite um valor entre 1 e "+nPossivel);
		while (nClientes<=0 || nClientes>nPossivel) {
			nClientes = Apoio.obterDadosInteiros("Valor inválido, digite um valor entre 1 e "+nPossivel);
		}
		return nClientes;
	}
	
	private static void adicionarCliente(int nClientes) {
		
		int tamanho = clientesRestaurante.size();
		for (int i = tamanho; i < (tamanho+nClientes); i++) {
			clientesRestaurante.add(clientes.getItem(i));			
			fazerPedido(i);			
		}		
		
	}
	
	private static void exibirClientesRestaurante() {
		if (!clientesRestaurante.isEmpty()) {
			Apoio.exibirMensagem("-----------------Ínicio da Exibição de Clientes---------------");
			for (int i = 0; i < clientesRestaurante.size(); i++) {
				Apoio.exibirMensagem("\nCliente "+(i+1)+" : "+clientesRestaurante.get(i).getNome());
				int idCardapio = clientesRestaurante.get(i).getIdCardapio();
				int idBebida = clientesRestaurante.get(i).getIdBebida();
				Apoio.exibirMensagem("Comeu: "+cardapio.getItem(idCardapio).getNome());
				Apoio.exibirMensagem("Bebeu: "+bebidas.getItem(idBebida).getNome());
			}
			Apoio.exibirMensagem("-----------------Fim da Exibição de Clientes---------------");
		} else {
			Apoio.exibirMensagem("Não há mais Clientes no Restaurante, tente outra opção!");		
		}
		
	}
	
	private static int obterOpcoes() {
		int opcao = 0;
		Apoio.exibirMensagem("\n1 - Exibir a lista de Clientes e seus pedidos \n2 - Exibir a Fila do Caixa \n3 - Exibir a Pilha de Chocolates \n4 - Mandar 5 Clientes para o Caixa \n5 - Finalizar o pagamento de todos na fila \nQualquer valor para finalizar o programa");
		opcao = Apoio.obterDadosInteiros("\nEntre com uma opção:\n");
		return opcao;			
	}
	
	private static void processarOpcao(int opcao) {
		switch (opcao) {
		case 1:
			exibirClientesRestaurante();
			break;
		case 2:
			exibirFilaCaixa();
			break;
		case 3:
			exibirChocolates();
			break;	
		case 4:
			irParaPagamento();
			break;
		case 5:
			finalizarPagamento();
			break;
		default:
			while (!clientesRestaurante.isEmpty() || !filaCaixa.isEmpty()) {
				irParaPagamento();
				finalizarPagamento();				
			}
			break;
		}
		
	}

	private static void finalizarPagamento() {
		if (!filaCaixa.isEmpty()) {
			while (!filaCaixa.isEmpty()) {
				gerarChocolates();
				int idChocolate = pilhaChocolates.pop().getId();
				filaCaixa.peek().setIdChocolate(idChocolate);
				int idBebida = filaCaixa.peek().getIdBebida();
				int idCardapio = filaCaixa.peek().getIdCardapio();
				String nome = filaCaixa.peek().getNome();
				String prato = cardapio.getItem(idCardapio).getNome();
				String bebida = bebidas.getItem(idBebida).getNome();
				String chocolate = chocolates.getItem(idChocolate).getNome();
				double conta = cardapio.getItem(idCardapio).getPreco()+bebidas.getItem(idBebida).getPreco();
				Apoio.exibirMensagem("\n"+nome+" comeu um "+prato+"\nbebeu "+bebida+"\nrecebeu um "+chocolate+"\ne pagou R$ "+conta);
				filaCaixa.remove();
			}
		} else {
			Apoio.exibirMensagem("Não há mais Clientes na fila!");
		}		
	}

	private static void exibirFilaCaixa() {
		int i =1;
		Apoio.exibirMensagem("----------------- Ínicio da Exibição da Fila ---------------");
		for (EstruturaCliente clienteProximo : filaCaixa) {			
			Apoio.exibirMensagem("Número "+i+" da Fila: "+clienteProximo.getNome());	
			i++;
		}
		Apoio.exibirMensagem("----------------- Fim da Exibição de Clientes ---------------");
		
	}

	private static void irParaPagamento() {
		if (!clientesRestaurante.isEmpty()) {
			Apoio.exibirMensagem("----------------- Exibição de Clientes que foram para a Fila ---------------");
			EstruturaCliente clienteProximo = new EstruturaCliente();
			gerarChocolates();
			for (int i = 0; i < 5; i++) {
				int idCliente = randomizar.nextInt(clientesRestaurante.size());
				clienteProximo = clientesRestaurante.get(idCliente);
				Apoio.exibirMensagem(clienteProximo.getNome()+" foi para o caixa!"); 
				clientesRestaurante.remove(idCliente);
				filaCaixa.add(clienteProximo);				
			}	
			Apoio.exibirMensagem("--------------------------------- FIM -------------------------------------");
		} else {
			Apoio.exibirMensagem("Não há mais Clientes no Restaurante!");
		}
	}

	private static void fazerPedido(int i) {
		
		int idC = randomizar.nextInt(70)/10;
		int idB = randomizar.nextInt(90)/10;
		
		clientesRestaurante.get(i).setIdCardapio(idC);
		clientesRestaurante.get(i).setIdBebida(idB);	
		
	}


	private static void exibirChocolates() {
		Apoio.exibirMensagem("----------------- Ínicio da Exibição da Pilha ---------------");
		for (int i = (pilhaChocolates.size()-1); i >= 0; i--) {
			Apoio.exibirMensagem("Chocolate "+ (i+1) + ": "+pilhaChocolates.get(i).getNome());			
		}
		Apoio.exibirMensagem("----------------- Fim da Exibição da Pilha ---------------");
	}

	private static void gerarChocolates() {		
		if (pilhaChocolates.isEmpty()) {
			Apoio.exibirMensagem("\nNova Pilha de Chocolates Gerada!");
			int idChocolate=0;
			while(pilhaChocolates.size()<9) {
				pilhaChocolates.push(chocolates.getItem(idChocolate));
				idChocolate++;					
			}
		}		
	}
}
