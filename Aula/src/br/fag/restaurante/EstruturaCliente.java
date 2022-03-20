package br.fag.restaurante;

public class EstruturaCliente {
	
	private int id;
	private String nome;
	private int idBebida;
	private int idCardapio;
	private int idChocolate;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdBebida() {
		return idBebida;
	}
	public void setIdBebida(int idBebida) {
		this.idBebida = idBebida;
	}
	public int getIdCardapio() {
		return idCardapio;
	}
	public void setIdCardapio(int idCardapio) {
		this.idCardapio = idCardapio;
	}
	public int getIdChocolate() {
		return idChocolate;
	}
	public void setIdChocolate(int idChocolate) {
		this.idChocolate = idChocolate;
	}
}
