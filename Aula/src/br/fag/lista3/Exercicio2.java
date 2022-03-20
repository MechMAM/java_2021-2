package br.fag.lista3;

import br.fag.listasorteio.Dados;

public class Exercicio2 {
	
	public static int saldo = 0, saque = 0, deposito=0;
	public static String opcao="";
	
	public static void main(String[] args) {
		
		while (!(opcao.equals("d") || opcao.equals("D"))) {
			exibirOpcoes();
			obterOpcao();
			exibirResultado();
		}	
	}

	private static void exibirResultado() {
		switch (opcao) {
		case "a":
			mostrarSaldo();			
			break;
		case "b":
			saque = Dados.obterDadosInteiros("\n Entre com o valor do saque: ");
			while (saldo<saque || saque<0) {
				Dados.exibirMensagem("\n Valor inválido, tente novamente: ");
				saque = Dados.obterDadosInteiros("\n Entre com o valor do saque: ");
			}
			saldo-= saque;
			mostrarSaldo();
			break;
		case "c":
			deposito = Dados.obterDadosInteiros("\n Entre com o valor a depositar: ");
			while (deposito<0) {
				Dados.exibirMensagem("\n Valor inválido, tente novamente: ");
				deposito = Dados.obterDadosInteiros("\n Entre com o valor a depositar: ");
			}
			saldo+= deposito;
			mostrarSaldo();
			break;
		case "d":
			Dados.exibirMensagem("\n Programa finalizado, obrigado! ");
			break;
		default:
			Dados.exibirMensagem("\n Opção inválida, tente novamente! ");
			break;
		}
	}
	
	private static void mostrarSaldo() {
		Dados.exibirMensagem("\n Operação concluída com sucesso \n Saldo: R$ "+saldo+",00");		
	}
	
	private static void obterOpcao() {
		opcao = Dados.obterDadosString(" Entre com uma opção ");
	}

	private static void exibirOpcoes() {
		Dados.exibirMensagem(" Opções: \n a) Consulta saldo \n b) Saque \n c) Deposito \n d) Sair ");		
	}
	
	
}
