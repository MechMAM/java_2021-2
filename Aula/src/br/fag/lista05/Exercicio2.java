package br.fag.lista05;

public class Exercicio2 {
	
	
	public static void main(String[] args) {
		int tamanho = MetodosApoio.obterDadosInteiros("Digite o tamanho do vetor");	
		int[] vetorAleatorio = MetodosApoio.gerarVetorAleatorio(tamanho);
		MetodosApoio.exibirVetor(vetorAleatorio);
		quickSort(vetorAleatorio, 0, tamanho-1);
		MetodosApoio.exibirVetor(vetorAleatorio);
	}

	private static void quickSort(int[] vetor, int inicio, int fim) {
		if (inicio<fim) {
			int posicaoPivo = separar(vetor,inicio,fim);
			MetodosApoio.exibirVetor(vetor);
			quickSort(vetor, inicio, posicaoPivo-1);
			quickSort(vetor,posicaoPivo+1,fim);
		}
	}

	private static int separar(int[] vetor, int inicio, int fim) {
		int pivo = vetor[inicio];
		int i = inicio+1, f=fim;
		while (i <= f) {
			if (vetor[i] <= pivo) {
				i++;
			}else if (pivo < vetor[f]) {
				f--;				
			} else {
				int troca = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = troca;
				i++;
				f--;
			}			
		}
		vetor[inicio]=vetor[f];
		vetor[f]=pivo;
		return f;
	}
}


