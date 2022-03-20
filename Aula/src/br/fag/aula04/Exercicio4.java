package br.fag.aula04;

import java.util.Scanner;

public class Exercicio4 {
	
	private static Scanner entrada = new Scanner(System.in);
	private static double mediaidades = 0, somaidades = 0;
	public static void main(String[] args) {
		coletarIdades();
		calcularMedia();
		exibirResultado();
	}

	private static void coletarIdades() {		
		int i = 1;
		while (i<=10) {
			System.out.println("Digite a idade "+ i +": ");
			somaidades+= entrada.nextDouble();
			i++;
		}		
	}

	private static void calcularMedia() {		
		mediaidades=somaidades/10;		
	}

	private static void exibirResultado() {		
		System.out.println("A média das idades digitadas é: "+mediaidades);		
	}

}
