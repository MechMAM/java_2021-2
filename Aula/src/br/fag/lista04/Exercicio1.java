package br.fag.lista04;

import br.fag.listasorteio.Dados;

public class Exercicio1 {
	
	private static int vetor1[] = new int[10], vetor2[] = new int[10], vetorResultado[] = new int[10];
	
	public static void main(String[] args) {
		
		Dados.exibirMensagem("Informe os dados do Vetor 1 \n");
		vetor1 = Dados.criarVetor(vetor1.length);
		Dados.exibirMensagem("Informe os dados do Vetor 2 \n");
		vetor2 = Dados.criarVetor(vetor2.length);
		calcularResultado();
		Dados.exibirVetor(vetorResultado);
	}

	private static void calcularResultado() {
		for (int i = 0; i < vetor1.length; i++) {
			for (int j = 0; j < vetor2.length; j++) {
				if (vetor1[i]==vetor2[j] && !verificarConteudo(vetor1[i])) {
					vetorResultado[i]=vetor1[i];
				} 
			}
		}	
	}	

	private static boolean verificarConteudo(int valor) {
		boolean auxiliar = false;
		for (int i = 0; i < vetorResultado.length; i++) {
			if (vetorResultado[i]==valor) {
				auxiliar = true;
			}			
		}
		return auxiliar;
	}
}
