package br.fag.lista04;

import java.util.Random;

import br.fag.listasorteio.Dados;

public class Exercicio7 {
	
	private static int cartela[][] = new int[5][5]; 
	private static Random aleatorio = new Random();
	
	public static void main(String[] args) {		
		gerarCartela();		
		Dados.exibirMatriz(cartela);		
	}

	private static void gerarCartela() {				
		for (int i = 0; i < cartela.length; i++) {
			for (int j = 0; j < cartela[i].length; j++) {
				cartela[i][j] = aleatorio.nextInt(99);
			}
		}
		testarCartela();
	}

	private static void testarCartela() {
		int iguais=0;
		for (int i = 0; i < cartela.length; i++) {
			for (int j = 0; j < cartela[i].length; j++) {
				for (int k = 0; k < cartela.length; k++) {
					for (int l = 0; l < cartela.length; l++) {
						if (cartela[i][j]==cartela[k][l] && !(k==i && l==j)) {
							iguais++;
						}
					}
				}
			}
		}
		if (iguais!=0) {
			gerarCartela();			
		}
	}

}
