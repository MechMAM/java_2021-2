package br.fag.lista04;

import br.fag.listasorteio.Dados;

public class Exercicio5 {
	private static int matriz[][] = new int [4][4];
	
	public static void main(String[] args) {
		criarMatriz();
		Dados.exibirMatriz(matriz);	
	}

	private static void criarMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = i*j;
			}			
		}		
	}
}
