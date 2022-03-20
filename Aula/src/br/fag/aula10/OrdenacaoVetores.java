package br.fag.aula10;

import java.util.Random;

import br.fag.listasorteio.Dados;

public class OrdenacaoVetores {
	
	private static int jogoAleatorio[] = new int[300000];
	private static Random randomizar = new Random();
	
	public static void main(String[] args) {
		
		apostaAleatoria();
		long tempoInicial = System.currentTimeMillis();
		ordenarVetor();
		long tempoFinal = System.currentTimeMillis();
//		Dados.exibirVetor(jogoAleatorio);
		Dados.exibirMensagem("O tempo total foi: "+(tempoFinal-tempoInicial)+"ms");
	}

	private static void ordenarVetor() {
		int indiceMin = 0, valorMin=0, aux=0;
		for (int i = 0; i < jogoAleatorio.length; i++) {
			indiceMin = i;
			valorMin = jogoAleatorio[i];
			
			for (int j = i; j < jogoAleatorio.length; j++) {
				if (valorMin>jogoAleatorio[j]) {
					indiceMin = j;
					valorMin = jogoAleatorio[j];					
				}
			}
			if (indiceMin!=i) {
				aux = jogoAleatorio[i];
				jogoAleatorio[i] = valorMin;
				jogoAleatorio[indiceMin] = aux;
			}
		}		
	}
	
	private static void apostaAleatoria() {
		for (int i = 0; i < jogoAleatorio.length; i++) {
			jogoAleatorio[i] = randomizar.nextInt(300000);		
		}
	}
	
	/*BubbleSort - conhecido pela simplicidade e pela eficácia, ao realizar ordenaçoes em número limitado de valores.
	 * Seu princípio baseia-se na troca de valores entre posições consecutivas, fazendo com que valores altos ou baixos
	 * borbulhem para o final da fila
	 * InsertionSort - Sua teoria baseia-se em ordenar os valores da esquerda para a direita, deixando os elementos 
	 * lidos (a esquerda) ordenados. Este é geralmente utilizado para ordenar um pequeno número de valores.
	 * QuickSort - Este algoritmo usa uma técnica conhecida por divisão e conquista, muito conhecida por reduzir 
	 * problemas complexos em problemas menores para tentar chegar em uma solução. Sendo assim, o resultado do problema
	 * inicial é dada como a soma do resultado de todos os problemas menores.
	 * SelectionSort - implementação mais simples ainda, porém perde desempenho. Este algoritmo tem por objetivo passar
	 * sempre o menore valor para a primeira posição
	 * MergeSort - método simples e compacto, normalmente implementado utilizando recursão. A ideia do MergeSort
	 * é embasada na divisão de um vetor, dividi-lo em vários vetores menores até que não se possa dividir mais. Depois
	 * compara-se os elementos dos vetores menores para uni-los na ordem desejada.
	 * método currentTimeMillis() traz o timestamp, utilizado para fazer o cálculo tempofinal-tempoinicial
	 * */
	

}
