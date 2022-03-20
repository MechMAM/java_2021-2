package br.fag.restaurante;

public class Chocolates {
	
	public static EstruturaQualquer<EstruturaChocolate> gerarChocolates() {
		EstruturaQualquer<EstruturaChocolate> chocolates = new EstruturaQualquer<EstruturaChocolate>(9);
		
		EstruturaChocolate chocolate1 = new EstruturaChocolate();
		chocolate1.setId(0);
		chocolate1.setNome("Diamante Negro");
		chocolates.setItem(0, chocolate1);
		
		EstruturaChocolate chocolate2 = new EstruturaChocolate();
		chocolate2.setId(1);
		chocolate2.setNome("Charge");
		chocolates.setItem(1, chocolate2);
		
		EstruturaChocolate chocolate3 = new EstruturaChocolate();
		chocolate3.setId(2);
		chocolate3.setNome("Baton");
		chocolates.setItem(2, chocolate3);
		
		EstruturaChocolate chocolate4 = new EstruturaChocolate();
		chocolate4.setId(3);
		chocolate4.setNome("Shot");
		chocolates.setItem(3, chocolate4);
		
		EstruturaChocolate chocolate5 = new EstruturaChocolate();
		chocolate5.setId(4);
		chocolate5.setNome("Prestígio");
		chocolates.setItem(4, chocolate5);
		
		EstruturaChocolate chocolate6 = new EstruturaChocolate();
		chocolate6.setId(5);
		chocolate6.setNome("Talento");
		chocolates.setItem(5, chocolate6);
		
		EstruturaChocolate chocolate7 = new EstruturaChocolate();
		chocolate7.setId(6);
		chocolate7.setNome("Laka");
		chocolates.setItem(6, chocolate7);
		
		EstruturaChocolate chocolate8 = new EstruturaChocolate();
		chocolate8.setId(7);
		chocolate8.setNome("Smash");
		chocolates.setItem(7, chocolate8);
		
		EstruturaChocolate chocolate9 = new EstruturaChocolate();
		chocolate9.setId(8);
		chocolate9.setNome("Serenata");
		chocolates.setItem(8, chocolate9);
		return chocolates;
	}
	

}
