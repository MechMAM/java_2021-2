package br.fag.lista04;

import br.fag.listasorteio.Dados;

public class Exercicio3 {
	
	private static int vetor[] = new int [10];
	private static int maiorValor, posicaoMaiorValor;
	
	public static void main(String[] args) {
		vetor = Dados.criarVetor(vetor.length);
		processarVetor();		
		exibirResultado();		
	}

	private static void exibirResultado() {
		Dados.exibirMensagem("O vetor digitado foi: ");
		Dados.exibirVetor(vetor);
		System.out.println("\nO maior elemento é: "+maiorValor+ "\nA sua posição é: "+posicaoMaiorValor);
		
	}

	private static void processarVetor() {
		maiorValor = vetor[0];
		posicaoMaiorValor = 0;
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i]>maiorValor) {
				maiorValor = vetor[i];
				posicaoMaiorValor = i;		
			}				
		}
	}
}
