package br.fag.lista04;

import br.fag.listasorteio.Dados;

public class Exercicio2 {
	
	private static int vetor[] = new int [8];
	private static int posicao1, posicao2, soma;
	
	public static void main(String[] args) {
		vetor = Dados.criarVetor(vetor.length);
		lerPosicoesVetor();		
		exibirResultado();
	}

	private static void lerPosicoesVetor() {
		posicao1 = Dados.obterDadosInteiros("Informe a posição desejada: \n(apenas números de 0 a 7)");
		posicao1 = validarPosicao(posicao1);
		
		posicao2 = Dados.obterDadosInteiros("Informe a posição desejada: \n(apenas números de 0 a 7)");
		posicao2 = validarPosicao(posicao2);
	}

	private static int validarPosicao(int posicaoAuxiliar) {
		while (posicaoAuxiliar<0 || posicaoAuxiliar>7) {
			System.out.println("Valor inválido, tente novamente");
			posicaoAuxiliar = Dados.obterDadosInteiros("Informe a posição desejada: \n(apenas números de 0 a 7)");
		}
		return posicaoAuxiliar;
	}

	private static void exibirResultado() {
		soma = vetor[posicao1]+vetor[posicao2];
		Dados.exibirMensagem("O vetor inserido foi: ");
		Dados.exibirVetor(vetor);
		System.out.println("\nO resultado da soma é: "+soma+ ".\nOs números somados foram: "+vetor[posicao1]+ " e "+vetor[posicao2]);
		
	}
}
