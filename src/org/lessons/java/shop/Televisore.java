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
	
	@Override
	public String toString() {

		return super.toString()
				+ "La TV che hai scelto è di: " + getInch() + "''\n"  +
			            (isSmart() ? "Ed è una smart tv!" : "E non è una smart tv");
	}
}
