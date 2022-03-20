package br.fag.lista05;

import java.util.Random;
import java.util.Scanner;

public class MetodosApoio {
	
	private static Random randomizar = new Random();
	private static Scanner entrada = new Scanner(System.in);
	
	public static int[] gerarVetorAleatorio(int tamanho) {
		int vetor[] = new int[tamanho];
		for (int i = 0; i < vetor.length; i++) {
			vetor[i]= randomizar.nextInt(tamanho*5);
		}
		return vetor;
	}
	
	public static int obterDadosInteiros(String mensagem) {
		System.out.println(mensagem);
		return entrada.nextInt();		
	}
	
	public static void exibirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			 System.out.print(vetor[i]+" ");
		}
		System.out.println("");
	}

}
