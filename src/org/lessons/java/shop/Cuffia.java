package org.lessons.java.shop;

public class Cuffia extends Prodotto {
	private String color;
	private String connection;
	
	public Cuffia(String nome, String descrizione, float prezzo, int iva, String color, String connection) {
		super(nome, descrizione, prezzo, iva);
		setColor("Verde");
		setConnection("Wireless");
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConnection() {
		return connection;
	}

	public void setConnection(String connection) {
		this.connection = connection;
	}
	
	@Override
	public String toString() {

		return super.toString()
				+ "Le cuffie che hai scelto sono: " + getColor() + "\n"
				+ "E sono: " + getConnection() + "\n" ;
	}
}
