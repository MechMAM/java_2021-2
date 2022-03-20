package br.fag.aula11;

public class EstruturaQualquer<T> {
	
	private T[] vetor;
	
	public EstruturaQualquer(int tamanho) {
		vetor = (T[]) new Object[tamanho];
	}
	
	public void setItem(int posicao, T valor) {
		vetor[posicao] = valor;
	}
	
	public T getItem(int posicao) {
		return vetor[posicao];
	}

}
