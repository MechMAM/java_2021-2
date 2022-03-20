package br.fag.aula11;

public class Principal {
	
	public static void main(String[] args) {
		EstruturaQualquer<String> eq1 = new EstruturaQualquer<String>(10);
		
		eq1.setItem(0, "Elenilton");
		eq1.setItem(1, "Dezengrini");
		
		EstruturaQualquer<Aluno> eq2 = new EstruturaQualquer<Aluno>(10);
		
		EstruturaQualquer<Produto> eq3 = new EstruturaQualquer<Produto>(10);
		
		Produto produto1 = new Produto();
		produto1.setId(0);
		produto1.setQuantidade(10);
		produto1.setUnidadeMedida("kg");
		produto1.setDescricao("Queijo");
		
		Produto produto2 = new Produto();
		
		eq3.setItem(0, produto1);
		eq3.setItem(1, produto2);
		
		Aluno aluno = new Aluno();
		
		System.out.println("-------------------Dados do produto");
		System.out.println(eq3.getItem(0));
		System.out.println(eq3.getItem(1));
		System.out.println(eq3.getItem(0).getDescricao());
		System.out.println(eq3.getItem(0).getQuantidade());
		
	}

}
