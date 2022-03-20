package br.fag.restaurante;

public class Cardapio {
	
	public static EstruturaQualquer<EstruturaCardapio> gerarCardapio() {
		EstruturaQualquer<EstruturaCardapio> cardapio = new EstruturaQualquer<EstruturaCardapio>(7);
		
		EstruturaCardapio prato1 = new EstruturaCardapio();
		prato1.setId(0);
		prato1.setNome("Bife à cavalo");
		prato1.setDescricao("Arroz, feijão, batata frita, bife, ovo e salada");
		prato1.setPreco(29.90);
		cardapio.setItem(0, prato1);
		
		EstruturaCardapio prato2 = new EstruturaCardapio();
		prato2.setId(1);
		prato2.setNome("Frango Grelhado");
		prato2.setDescricao("Frango Grelhado, arroz, batata frita, e salada mista (alface, tomate, pepino, couve-flor, brócolis, ovo cozido, cebola em conserva");
		prato2.setPreco(27.90);
		cardapio.setItem(1, prato2);
		
		EstruturaCardapio prato3 = new EstruturaCardapio();
		prato3.setId(2);
		prato3.setNome("Filé de tilápia à parmegiana");
		prato3.setDescricao("Filé de tilápia à parmegiana, arroz, batata frita, e salada mista (alface, tomate, pepino, couve-flor, brócolis, ovo cozido, cebola em conserva");
		prato3.setPreco(41.49);
		cardapio.setItem(2, prato3);
		
		EstruturaCardapio prato4 = new EstruturaCardapio();
		prato4.setId(3);
		prato4.setNome("Frango à passarinho");
		prato4.setDescricao("Frango à passarinho, arroz, batata frita, e salada mista (alface, tomate, pepino, couve-flor, brócolis, ovo cozido, cebola em conserva");
		prato4.setPreco(29.90);
		cardapio.setItem(3, prato4);
		
		EstruturaCardapio prato5 = new EstruturaCardapio();
		prato5.setId(4);
		prato5.setNome("Alcatra acebolada");
		prato5.setDescricao("Alcatra acebolada, arroz, batata frita, e salada mista (alface, tomate, pepino, couve-flor, brócolis, ovo cozido, cebola em conserva");
		prato5.setPreco(39.99);
		cardapio.setItem(4, prato5);
		
		EstruturaCardapio prato6 = new EstruturaCardapio();
		prato6.setId(5);
		prato6.setNome("Camarão");
		prato6.setDescricao("Camarão, arroz, batata frita, e salada mista (alface, tomate, pepino, couve-flor, brócolis, ovo cozido, cebola em conserva");
		prato6.setPreco(69.49);
		cardapio.setItem(5, prato6);
		
		EstruturaCardapio prato7 = new EstruturaCardapio();
		prato7.setId(6);
		prato7.setNome("Fettuccine Gorgonzola");
		prato7.setDescricao("Fettuccine importado da Itália, ao molho de queijos feito com queijos frescos e lascas de gorgonzola, acompanhado por frango à milanesa");
		prato7.setPreco(38.90);
		cardapio.setItem(6, prato7);	
		
		return cardapio;
	}

	

}
