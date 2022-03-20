package br.fag.aula04;

import java.util.Scanner;

public class Lacos {
	
	private static int valor;
	private static Scanner entrada = new Scanner(System.in);
	private static boolean continuar = true;
	
	public static void main(String[] args) {
		
		while (continuar) {
			coletarDados();
			processarDadosComFor();
			pedirConfirmacao();
		}
		System.out.println("Terminou. Obrigado!");
		
//		processarDadosComWhile();
//		exibirResultado();
		
	}

	private static void pedirConfirmacao() {
		String resposta;
		System.out.println("Deseja continuar? (S/N): ");
		resposta = entrada.next();
		while (!(resposta.equals("s") || resposta.equals("S") || resposta.equals("n") || resposta.equals("N"))) {
			System.out.println("Resposta Inválida!");
			resposta = entrada.next();
		}
		
		if (!(resposta.equals("s") || resposta.equals("S"))) {
			continuar = false;
		}
		
	}

	private static void processarDadosComWhile() {
		
		int i = 0;
		while (i<valor) {
			System.out.println(i++);			
		}
	}

	private static void processarDadosComFor() {
		for (int i = 0; i <= valor; i++) {
			System.out.println(i);			
		}		
	}

	private static void coletarDados() {
		
		System.out.println("Digite um valor inteiro: ");
		valor = entrada.nextInt();		
	}

}
