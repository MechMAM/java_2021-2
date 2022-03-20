package br.fag.lista04;

import br.fag.listasorteio.Dados;

public class Exercicio4 {
	
	private static double vetor[] = new double[5];
	private static int operador = 1;
	
	public static void main(String[] args) {
		vetor = Dados.criarVetorDouble(vetor.length);
		while (operador!=0) {
			validarOperador();
			exibirResultado();
		}				
	}

	private static void validarOperador() {
		operador = Dados.obterDadosInteiros("\nDigite um valor para o operador \n0 - Finalizar \n1 - Exibir vetor ordem direta \n2 - Exibir vetor ordem inversa");
		while (!(operador==0 || operador==1 || operador==2)) {
			operador = Dados.obterDadosInteiros("Valor inválido, tente novamente: ");
		}
	}

	private static void exibirResultado() {
		switch (operador) {
		case 1:
			for (int i = 0; i < vetor.length; i++) {
				System.out.print(vetor[i]+" ");
			}
			System.out.println("");
			break;
		case 2:
			for (int j = (vetor.length-1); j >= 0; j--) {
				System.out.print(vetor[j]+" ");				
			}
			System.out.println("");
			break;
		default:
			Dados.exibirMensagem("Programa finalizado, obrigado!");
			break;
		}
		
	}

}
