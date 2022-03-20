package br.fag.aula04;

import java.util.Scanner;

public class Exercicio03 {
	private static Scanner entrada = new Scanner(System.in);
	private static int valor, resultado;
	
	public static void main(String[] args) {
		obterDados();
		verificarDados();
		calcularTabuada();
	}

	private static void calcularTabuada() {
		for (int i = 0; i <= 10; i++) {
			resultado = valor*i;
			System.out.println(valor+" x "+i+ " = "+resultado);
		}		
	}

	private static void verificarDados() {
		while (!((0< valor)&&(valor<11))) {
			System.out.println("Digite um valor válido");
		 	obterDados();
	}
	}

	private static void obterDados() {
		System.out.println("Digite um número inteiro entre 1 e 10");
		valor = entrada.nextInt();
	}
	
}
