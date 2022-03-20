package br.fag.lista01;

import java.util.Scanner;

public class Exercicio3 {
	
	private static double preco1, preco2, resultado;
	private static int numeroMacas;
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		obterDados();
		calcularCusto();
		exibirResultado();		
	}

	private static void obterDados() {
		System.out.println("Digite o número de maçãs compradas!");
		numeroMacas = entrada.nextInt();
				
	}

	private static void calcularCusto() {
		preco1 = 1.3;
		preco2 = 1;
		if (numeroMacas<12) {
			resultado = numeroMacas*preco1;			
		} else {
			resultado = numeroMacas*preco2;
		}
				
	}

	private static void exibirResultado() {
		System.out.println("O valor da sua compra foi de R$ "+ resultado);		
				
	}

}
