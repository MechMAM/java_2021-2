package br.fag.lista3;

import br.fag.listasorteio.Dados;

public class Exercicio1 {
	
	private static int idade=0, maiorIdade=0, menorIdade=0, contFeminino=0, contMasculino=0, idadeMenorSalario=0;
	private static String sexo="", generoMenorSalario="";
	private static double salario=0, somaSalario=0, menorSalario=0, mediaSalario=0;
	
	public static void main(String[] args) {		
		obterDados();
		processarDados();
		exibirResultado();		
	}

	private static void obterDados() {
		idade = Dados.obterDadosInteiros("Informe a idade. \nPara finalizar insira um número negativo: ");
		if (idade>0) {
			sexo = Dados.obterDadosString("Informe o sexo: (M/F)");
			while (!(sexo.equals("M") || sexo.equals("m") || sexo.equals("F") || sexo.equals("f"))) {
				Dados.exibirMensagem("Informe uma caractér válido! ");
				sexo = Dados.obterDadosString("Informe o sexo: (M/F)");			
			}
			salario = Dados.obterDadosDouble("Informe o salário: ");
			while (salario<0) {
				Dados.exibirMensagem("Digite um salário válido! ");
				salario = Dados.obterDadosDouble("Informe o salário: ");
			}			
		}
	}

	private static void processarDados() {
		
		while (idade>0) {
			if (contMasculino==0 && contFeminino==0) {
				menorIdade=idade;
				menorSalario=salario;			
			}
			somaSalario+=salario;
						
			if (salario<menorSalario) {
				menorSalario=salario;
				generoMenorSalario=sexo;
				idadeMenorSalario = idade;			
			}
			
			if (sexo.equals("M") || sexo.equals("m")) {
				contMasculino++;
			}else {
				contFeminino++;
			}
			
			if (idade>maiorIdade) {
				maiorIdade=idade;			
			}
			
			if (idade<menorIdade) {
				menorIdade=idade;			
			}
			
			mediaSalario = somaSalario/(contMasculino+contFeminino);
			obterDados();			
		}
	}

	private static void exibirResultado() {
		Dados.exibirMensagem("A média dos salários é: "+mediaSalario);
		Dados.exibirMensagem("A maior idade é: "+maiorIdade+". \nA menor idade é: "+menorIdade);
		Dados.exibirMensagem("A quantidade de homens é: "+contMasculino+" \nA quantidade de mulheres é: "+contFeminino);
		Dados.exibirMensagem("O menor salário é: "+menorSalario+" \nEsta pessoa é do sexo: "+generoMenorSalario+ "\nA idade desta pessoa é: "+idadeMenorSalario);
	}	

}
