package org.lessons.java.shop;

public class Smartphone extends Prodotto {

	private int codiceImei;
	private int memorySize;
	
	
	public Smartphone(String nome, String descrizione, float prezzo, int iva, int codiceImei, int memorySize) {
		super(nome, descrizione, prezzo, iva);
		setMemorySize(32);
		setCodiceImei(super.rndNumber());
	}
	
	
	
	public int getMemorySize() {
		return memorySize;
	}
	
	
	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}
	
	public void setCodiceImei(int codiceImei) {
		this.codiceImei = codiceImei;
	}
	
	
	public int getCodiceImei() {
		return codiceImei;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()
				+ "Lo smartphone che hai scelto è da: " + getMemorySize() + "GB\n"  
				+ "Con associato questo codice IMEI: " + getCodiceImei();
	}
}
