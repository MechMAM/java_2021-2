package br.fag.listasorteio;

import java.util.Scanner;

public class Dados {
	
	private static Scanner entrada = new Scanner(System.in);
	
	public static int obterDadosInteiros(String mensagem) {
		System.out.println(mensagem);
		return entrada.nextInt();		
	}
	
	public static String obterDadosString(String mensagem) {
		System.out.println(mensagem);
		return entrada.next();		
	}
	
	public static float obterDadosFloat(String mensagem) {
		System.out.println(mensagem);
		return entrada.nextFloat();		
	}
	
	public static double obterDadosDouble(String mensagem) {
		System.out.println(mensagem);
		return entrada.nextDouble();		
	}
	
	public static void exibirMensagem(String mensagem) {
		System.out.println(mensagem);
	}
	
	public static int[] criarVetor(int tamanho) {
		int vetorAuxiliar[] = new int[tamanho];		
		for (int i = 0; i < vetorAuxiliar.length; i++) {
			vetorAuxiliar[i] = obterDadosInteiros("Informe o valor "+(i+1)+":");
		}		
		return vetorAuxiliar;
	}
	
	public static double[] criarVetorDouble(int tamanho) {
		double vetorAuxiliar[] = new double[tamanho];		
		for (int i = 0; i < vetorAuxiliar.length; i++) {
			vetorAuxiliar[i] = obterDadosDouble("Informe o valor "+(i+1)+":");
		}		
		return vetorAuxiliar;
	}
	
	
	public static void exibirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			Dados.exibirMensagem(" ");
		}
	}
	
	public static void exibirMatrizString(String[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			Dados.exibirMensagem(" ");
		}
	}
	
	public static void exibirVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			 System.out.print(vetor[i]+" ");
		}
		System.out.println("");
	}

}
