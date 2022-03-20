package br.fag.aula04;

import java.util.Scanner;

public class Exercicio7 {
	
	private static Scanner entrada = new Scanner(System.in);
	private static double valor;
	public static void main(String[] args) {		
		obterNumero();
	}
	private static void obterNumero() {
		
		System.out.println("Digite um número entre 12 e 20: ");
		valor = entrada.nextDouble();
		validarResultado();
		
	}
	private static void validarResultado() {
		if ((valor>=12 && valor<=20)) {
			System.out.println("O número digitado foi: "+valor);			
		}else {
			System.out.println("Entrada inválida!");
			obterNumero();
		}
		
	}

}
