package br.fag.lista01;

import java.util.Scanner;

public class Exercicio5 {
	
	public static double valor1, valor2, resultado;
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		obterDados();
		compararDados();
		exibirResultado();		
	}

	private static void obterDados() {
		System.out.println("Digite um valor numérico!");
		valor1 = entrada.nextDouble();
		System.out.println("Digite outro valor numérico!");
		valor2 = entrada.nextDouble();
	}

	private static void compararDados() {
		if (valor1>valor2) {
			resultado = valor1;
		} else {
			resultado = valor2;			
		}
	}

	private static void exibirResultado() {
		System.out.println("O número maior é "+resultado);		
	}

}
