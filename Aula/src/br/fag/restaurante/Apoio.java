package br.fag.restaurante;

import java.util.Scanner;

public class Apoio {
	
	private static Scanner entrada = new Scanner(System.in);
	
	public static String obterDadosString(String mensagem) {
		System.out.println(mensagem);
		return entrada.next();		
	}
	
	public static void exibirMensagem(String mensagem) {
		System.out.println(mensagem);
	}
	
	public static int obterDadosInteiros(String mensagem) {
		System.out.println(mensagem);
		return entrada.nextInt();		
	}

}
