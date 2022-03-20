package br.fag.restaurante;

public class Bebidas {
	
public static EstruturaQualquer<EstruturaBebida> gerarBebidas() {
		
		EstruturaQualquer<EstruturaBebida> bebidas = new EstruturaQualquer<EstruturaBebida>(9);
		
		EstruturaBebida bebida1 = new EstruturaBebida();
		bebida1.setId(0);
		bebida1.setNome("Água mineral");
		bebida1.setPreco(4.00);
		bebidas.setItem(0, bebida1);
		
		EstruturaBebida bebida2 = new EstruturaBebida();
		bebida2.setId(1);
		bebida2.setNome("Água com gás");
		bebida2.setPreco(4.00);
		bebidas.setItem(1, bebida2);
		
		EstruturaBebida bebida3 = new EstruturaBebida();
		bebida3.setId(2);
		bebida3.setNome("Coca-cola");
		bebida3.setPreco(7.50);
		bebidas.setItem(2, bebida3);
		
		EstruturaBebida bebida4 = new EstruturaBebida();
		bebida4.setId(3);
		bebida4.setNome("Sprite Lemon Fresh");
		bebida4.setPreco(7.00);
		bebidas.setItem(3, bebida4);
		
		EstruturaBebida bebida5 = new EstruturaBebida();
		bebida5.setId(4);
		bebida5.setNome("Guaraná Jesus");
		bebida5.setPreco(11.90);
		bebidas.setItem(4, bebida5);
		
		EstruturaBebida bebida6 = new EstruturaBebida();
		bebida6.setId(5);
		bebida6.setNome("Cerveja Budweiser");
		bebida6.setPreco(8.00);
		bebidas.setItem(5, bebida6);
		
		EstruturaBebida bebida7 = new EstruturaBebida();
		bebida7.setId(6);
		bebida7.setNome("Cerveja Patagonia Weisse");
		bebida7.setPreco(12.00);
		bebidas.setItem(6, bebida7);
		
		EstruturaBebida bebida8 = new EstruturaBebida();
		bebida8.setId(7);
		bebida8.setNome("Energético Monster Ultra Violet");
		bebida8.setPreco(12.00);
		bebidas.setItem(7, bebida8);
		
		EstruturaBebida bebida9 = new EstruturaBebida();
		bebida9.setId(8);
		bebida9.setNome("Suco Pratts laranja");
		bebida9.setPreco(13.99);
		bebidas.setItem(8, bebida9);
		
		return bebidas;
	}
}
