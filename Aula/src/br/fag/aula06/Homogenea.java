package br.fag.aula06;

import java.util.Random;

import br.fag.listasorteio.Dados;

public class Homogenea {
	
	private static int vetor[] = new int[100];
	private static double vetorD[] = new double[10];
	private static int matriz[][] = new int[4][5];
	private static Random random = new Random();
	
	public static void main(String[] args) {
//		criarVetor();
//		mostrarVetor();
//		mostrarElementoVetor();
//		criarMatriz();
//		mostrarMatriz();
		criarVetorAleatorio();
		mostrarVetorAleatorio();
	}

	private static void mostrarVetorAleatorio() {
		for (int i = 0; i < vetorD.length; i++) {
			Dados.exibirMensagem(""+vetorD[i]);
			System.out.printf("%.2f%n",vetorD[i]);
		}
	}

	private static void criarVetorAleatorio() {
		for (int i = 0; i < vetorD.length; i++) {
			vetorD[i] = random.nextDouble();			
		}
		
	}

	//selecionar vários elementos alt+shift+R
	//para três dimensões adicionar mais um colchete para declaração do tamanho e para exibir
	//erro NullPointer é quando chama objeto não inicializado ou instanciado
	private static void criarMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = i*j;				
			}			
		}
	}

	private static void mostrarMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static void mostrarElementoVetor() {
		Dados.exibirMensagem("Elemento específico: "+vetorD[5]);		
	}

	private static void mostrarVetor() {
		for (int i = 0; i < vetor.length; i++) {
			Dados.exibirMensagem(""+vetorD[i]);
		}
	}

	private static void criarVetor() {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = Dados.obterDadosInteiros("Informe um valor inteiro: ");			
		}		
	}

}
