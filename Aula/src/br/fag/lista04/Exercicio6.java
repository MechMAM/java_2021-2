package br.fag.lista04;

import br.fag.listasorteio.Dados;

public class Exercicio6 {
	private static int matriz[][] = new int [3][3];
	private static int soma = 0;
	
	public static void main(String[] args) {
		criarMatriz();
		processar();
		exibirResultado();		
	}

	private static void exibirResultado() {
		Dados.exibirMatriz(matriz);
		Dados.exibirMensagem("O resultado da soma dos elementos que \nestão acima da diagonal principal é: "+soma);		
	}

	private static void processar() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j>i) {
					soma = soma+matriz[i][j];
				}
			}
		}
	}

	private static void criarMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = Dados.obterDadosInteiros("Insira o valor M"+(i+1)+(j+1)+" da matriz");	
			}
		}	
	}

}
