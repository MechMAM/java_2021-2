package br.fag.lista01;

import java.util.Scanner;

public class Exercicio7 {
	
	private static int horaInicio, horaFim, resultado;
	private static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		obterDados();
		calcularDuracao();
		exibirResultado();
	}

	private static void obterDados() {
		System.out.println("Informe a hora de início do jogo (24hr): \n");
		horaInicio = entrada.nextInt();
		System.out.println("Informe a hora fim do jogo (24hr): \n");
		horaFim = entrada.nextInt();
	}

	private static void calcularDuracao() {
		if (horaInicio>=horaFim) {
			resultado = 24-horaInicio+horaFim;			
		} else {
			resultado = horaFim-horaInicio;
		}		
	}

	private static void exibirResultado() {
		System.out.println("O jogo durou "+resultado+" horas.");		
	}
}
