package org.lessons.java.shop;

public class Televisore extends Prodotto {
	private int inch;
	private boolean smart;
	
	public Televisore(String nome, String descrizione, float prezzo, int iva, int inch, boolean smart) {
		super(nome, descrizione, prezzo, iva);
		setInch(32);
		setSmart(true);
		
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
}
