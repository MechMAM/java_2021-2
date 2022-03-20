package br.fag.aula04;

import java.util.Scanner;

public class Exercicio05 {
	private static Scanner entrada = new Scanner(System.in);
	private static int valor, par = 0, impar = 0;
	
	
	public static void main(String[] args) {
		obterDados();
		exibirResultado();
	}

	private static void exibirResultado() {
		System.out.println(par+" números são pares e "+impar+" números são ímpares");	
	}

	private static void verificarParidade() {
		if(valor%2==0) {
			par++;
		} else {
			impar++;
		}			
	}

	private static void obterDados() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o número "+(i+1)+":");
			valor = entrada.nextInt();
			verificarParidade();
		}	
	}
}
