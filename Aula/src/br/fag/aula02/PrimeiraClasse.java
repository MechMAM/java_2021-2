package br.fag.aula02;

import java.util.Scanner;

public class PrimeiraClasse {
	
//	private static int numero; //visibilidade apenas na classe PrimeiraClasse
	private static double valor1, valor2, resultado; //declaração de variáveis
	private static Scanner entrada = new Scanner(System.in);   //criação de instância, para utilizar mais de uma vez

	public static void main(String[] args) { //visibilidade do método pelo projeto todo
		
		obterDados();
		calcularMedia();
		exibirResultado(); //variável local quando declarar o int no escopo do main
		
	}

	private static void calcularMedia() {
		resultado = (valor1+valor2)/2;
	}

	private static void obterDados() {
		
		System.out.println("Informe um valor");
		valor1 = entrada.nextDouble();
		System.out.println("Informe um valor");
		valor2 = entrada.nextDouble();
		
	}

	protected static void exibirResultado() { //visibilidade do método dentro do package
		System.out.println("A média dos números é: " + resultado);
	}
}
