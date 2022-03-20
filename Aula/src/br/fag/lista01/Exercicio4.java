package br.fag.lista01;

import java.util.Scanner;

public class Exercicio4 {
	private static double nota1, nota2, media;
	private static String resultado;
	private static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args){
		obterDados();
		calcularMedia();
		verificarAprovacao();
		exibirResultado();
	}

	private static void calcularMedia() {
		media = (nota1 + nota2)/2;
		
	}
	private static void verificarAprovacao() {
		if (media>=7) {
			resultado = "aprovado";
		} else {
			resultado = "reprovado";
		}
	}
	private static void obterDados() {
		System.out.println("Informe a nota da primeira avaliação");
		nota1 = entrada.nextDouble(); 
		System.out.println("Informe a nota da segunda avaliação");
		nota2 = entrada.nextDouble();
	}

	private static void exibirResultado() {
		System.out.println("A média das duas notas é: " + media+ " e o aluno está: " +resultado);
	}
}

