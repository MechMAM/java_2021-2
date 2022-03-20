package br.fag.lista01;

import java.util.Scanner;

public class Exercicio2 {
	private static double valor;
	private static String resultado; 
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args){
		obterDados();
		verificarSinal();
		exibirResultado();
	}
	private static void verificarSinal() {
		if (valor>=0) {
			resultado = "positivo";
		} else {
			resultado = "negativo";
		}	
	}

	private static void obterDados() {
		System.out.println("Informe um valor");
		valor = entrada.nextDouble(); 
	}

	private static void exibirResultado() {
		System.out.println("O valor lido é: " +resultado);
	}
}
