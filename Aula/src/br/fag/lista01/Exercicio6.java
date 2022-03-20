package br.fag.lista01;

import java.util.Scanner;

public class Exercicio6 {
	private static double valor1, valor2;
	private static String resultado;
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		obterDados();
		ordenarDados();
		exibirResultado();	
	}

	private static void ordenarDados() {
		if (valor1<valor2) {
			resultado = (valor1+" e "+valor2); 
		} else {
			resultado = (valor2+" e "+valor1); 
		}
	}
		
	private static void obterDados() {
		System.out.println("Informe o primeiro valor");
		valor1 = entrada.nextDouble();
		System.out.println("Informe o segundo valor");
		valor2 = entrada.nextDouble();		
	}
	
	private static void exibirResultado() {
		System.out.println("Os numeros lidos em ordem crescente são " + resultado);
	}

}
