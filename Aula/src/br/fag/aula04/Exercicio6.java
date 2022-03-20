package br.fag.aula04;

import java.util.Scanner;

public class Exercicio6 {
	
	private static Scanner entrada = new Scanner(System.in);
	
	private static int foraintervalo = 0, dentrointervalo = 0;
	private static double valor = 0;
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			obterDados();
			classificarDados();		
		}
		exibirResultado();		
	}
	private static void obterDados() {
		System.out.println("Digite um número: ");
		valor = entrada.nextDouble();		
	}
	
	private static void classificarDados() {
		if ((valor>=10 && valor <=20)) {
			System.out.println("O número "+valor+" está entre 10 e 20!");
			dentrointervalo++;
		} else {
			System.out.println("O número "+valor+" não está entre 10 e 20!");
			foraintervalo++;
		}
		
	}
	private static void exibirResultado() {
		System.out.println("Dos 10 números digitados, "+dentrointervalo+" estão entre 10 e 20, inclusive, e "+foraintervalo+" não estão!");
	}

}
