package br.fag.aula05;

import br.fag.listasorteio.Dados;

public class Principal {
	
	private static int idade;
	private static String nome;
	private static double salario;
	
	
	public static void main(String[] args) {
		obterDados();
		exibirDados();
	}
	/*private não tem outra opção, a visibilidade é apenas na mesma classe
	protected a visibilidade é no mesmo package
	A biblioteca padrão do java não necessita ser importada java.lang.*;
	
	Refactor rename altera o nome da classe e altera suas referências
	
	ctrl+shift+o elimina imports que não estejam sendo utilizados
	se está faltando ele coloca se está sobrando ele tira bibliotecas importadas
	
	*/

	private static void exibirDados() {
		System.out.println("O nome informado é..: " +nome);
		System.out.println("O saláro informado é: " +salario);
		System.out.println("O idade informada é.: " +idade);
	}


	private static void obterDados() {
		idade = Dados.obterDadosInteiros("Informe sua idade: ");
		nome = Dados.obterDadosString("Informe seu nome: ");
		salario = Dados.obterDadosDouble("Informe seu salário: ");
		
	}

}
