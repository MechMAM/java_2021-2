package br.fag.lista01;

import java.util.Scanner;

public class Exercicio1 {
	
	private static double valorUsuario;
	private static String resultado;
	public static Scanner entrada = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		obterDados();
		compararDados();
		exibirResultado();
	}

	private static void exibirResultado() {
		System.out.println(resultado);		
	}

	private static void compararDados() {
		if (valorUsuario>10) {
			resultado="É MAIOR QUE 10!";			
		}else {
			resultado="NÃO É MAIOR QUE 10!";
		}				
	}

	private static void obterDados() {
		System.out.println("Digite um valor numérico. \n");
		valorUsuario = entrada.nextDouble();		
	}

}
