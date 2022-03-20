package br.fag.lista3;

import br.fag.listasorteio.Dados;

public class Exercicio3 {
	
	private static int valor, notas100, notas50, notas20, notas10, notas5, notas2;
	
	public static void main(String[] args) {
		obterDados();
		if (!(valor == 1 || valor ==3) && valor>0) {
			calcularNotas();
			exibirResultado();			
		}else {
			Dados.exibirMensagem("Valor inválido, tente novamente!");
		}
	}

	private static void obterDados() {
		valor = Dados.obterDadosInteiros("Digite o valor do saque");		
	}

	private static void calcularNotas() {
		notas100 = testarValor100();
		notas50 = testarValor(50);
		notas20 = testarValor(20);
		notas10 = testarValor(10);
		notas5 = testarMenor10(5);
		notas2 = testarMenor10(2);	
	}
	
	private static int testarValor100() {
		int notas = 0;
		if (!(((valor%100) == 1) || ((valor%100) == 3))) {
			notas=testar100();
		} else {
			subtrair5();
			notas=testar100();
		}
		return notas;
	}
	
	private static int testar100() {
		int notas = 0;
		if (valor>=100) {
			notas=valor/100;
			valor=valor%100;
		}
		return notas;
	}
	
	private static int testarValor(int valorNota) {
		int notas = 0;	
			if (!(((valor%valorNota) == 1) || ((valor%valorNota) == 3))) {
				notas = valor/valorNota;
				valor=valor%valorNota;
			} else {
				subtrair5();
			}					
		return notas;
	}

	private static int testarMenor10(int valorNota) {
		int notas = 0;
		if (!(((valor%valorNota) == 1) || ((valor%valorNota) == 3))) {
			notas = valor/valorNota;
			valor=valor%valorNota;
		}
		return notas;
	}

	private static void subtrair5() {
		valor-=5;
		notas5++;		
	}

	private static void exibirResultado() {
		Dados.exibirMensagem("Menor número de notas para este valor: \n\nNotas de 100: "+notas100);
		Dados.exibirMensagem("Notas de 50: "+notas50);
		Dados.exibirMensagem("Notas de 20: "+notas20);
		Dados.exibirMensagem("Notas de 10: "+notas10);
		Dados.exibirMensagem("Notas de 5: "+notas5);
		Dados.exibirMensagem("Notas de 2: "+notas2);		
	}

}
