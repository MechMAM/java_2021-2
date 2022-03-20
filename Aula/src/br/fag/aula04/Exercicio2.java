package br.fag.aula04;

public class Exercicio2 {
	
	public static void main(String[] args) {
		exibirPares();
		System.out.println("Terminou!");
	}

	private static void exibirPares() {
		int valor = 100;		
		for (int i = 0; i < valor; i+=2) {
			System.out.println(i+2);			
		}		
	}

	

}
