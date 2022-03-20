package br.fag.restaurante;

public class Clientes {
	
public static EstruturaQualquer<EstruturaCliente> gerarClientes() {
		
		EstruturaQualquer<EstruturaCliente> clientes = new EstruturaQualquer<EstruturaCliente>(20);
		
		EstruturaCliente cliente1 = new EstruturaCliente();
		cliente1.setId(0);
		cliente1.setNome("Leia Organa");
		clientes.setItem(0, cliente1);
		
		
		EstruturaCliente cliente2 = new EstruturaCliente();
		cliente2.setId(1);
		cliente2.setNome("Luke Skywalker");
		clientes.setItem(1, cliente2);
		
		EstruturaCliente cliente3 = new EstruturaCliente();
		cliente3.setId(2);
		cliente3.setNome("Boba Fett");	
		clientes.setItem(2, cliente3);
		
		EstruturaCliente cliente4 = new EstruturaCliente();
		cliente4.setId(3);
		cliente4.setNome("Anakin Skywalker");
		clientes.setItem(3, cliente4);
		
		EstruturaCliente cliente5 = new EstruturaCliente();
		cliente5.setId(4);
		cliente5.setNome("Padmé Amidala");	
		clientes.setItem(4, cliente5);
		
		EstruturaCliente cliente6 = new EstruturaCliente();
		cliente6.setId(5);
		cliente6.setNome("Obi-Wan Kenobi");	
		clientes.setItem(5, cliente6);
		
		EstruturaCliente cliente7 = new EstruturaCliente();
		cliente7.setId(6);
		cliente7.setNome("Han Solo");	
		clientes.setItem(6, cliente7);
		
		EstruturaCliente cliente8 = new EstruturaCliente();
		cliente8.setId(7);
		cliente8.setNome("Kylo Ren");	
		clientes.setItem(7, cliente8);
		
		EstruturaCliente cliente9 = new EstruturaCliente();
		cliente9.setId(8);
		cliente9.setNome("Rey Palpatine");	
		clientes.setItem(8, cliente9);
		
		EstruturaCliente cliente10 = new EstruturaCliente();
		cliente10.setId(9);
		cliente10.setNome("Chewbacca");	
		clientes.setItem(9, cliente10);
		
		EstruturaCliente cliente11 = new EstruturaCliente();
		cliente11.setId(10);
		cliente11.setNome("Lando Calrissian");
		clientes.setItem(10, cliente11);
		
		EstruturaCliente cliente12 = new EstruturaCliente();
		cliente12.setId(11);
		cliente12.setNome("Poe Dameron");	
		clientes.setItem(11, cliente12);
		
		EstruturaCliente cliente13 = new EstruturaCliente();
		cliente13.setId(12);
		cliente13.setNome("Finn");	
		clientes.setItem(12, cliente13);
		
		EstruturaCliente cliente14 = new EstruturaCliente();
		cliente14.setId(13);
		cliente14.setNome("Yoda");	
		clientes.setItem(13, cliente14);
		
		EstruturaCliente cliente15 = new EstruturaCliente();
		cliente15.setId(14);
		cliente15.setNome("Qui-Gon-Jin");
		clientes.setItem(14, cliente15);
		
		EstruturaCliente cliente16 = new EstruturaCliente();
		cliente16.setId(15);
		cliente16.setNome("Mace Windu");
		clientes.setItem(15, cliente16);
		
		EstruturaCliente cliente17 = new EstruturaCliente();
		cliente17.setId(16);
		cliente17.setNome("Ahsoka Tano");
		clientes.setItem(16, cliente17);
		
		EstruturaCliente cliente18 = new EstruturaCliente();
		cliente18.setId(17);
		cliente18.setNome("Kit Fisto");	
		clientes.setItem(17, cliente18);
		
		EstruturaCliente cliente19 = new EstruturaCliente();
		cliente19.setId(18);
		cliente19.setNome("Conde Dookan");
		clientes.setItem(18, cliente19);
		
		EstruturaCliente cliente20 = new EstruturaCliente();
		cliente20.setId(19);
		cliente20.setNome("Palpatine");
		clientes.setItem(19, cliente20);
		
		return clientes;
	}

}
