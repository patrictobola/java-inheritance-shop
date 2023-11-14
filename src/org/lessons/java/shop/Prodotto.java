//aggiunto il Locale per sfizio di avere il punto invece di virgola come separatore
package org.lessons.java.shop;



import java.util.Locale;
import java.util.Random;

public class Prodotto {

	private int codice;
	private String nome;
	private String descrizione;
	private float prezzo;
	private int iva;
	
	
		public Prodotto(String nome, String descrizione, float prezzo, int iva) {
			setCodice(rndNumber());
			setNome(nome);
			setDescrizione(descrizione);
			setPrezzo(prezzo);
			setIva(iva);
		}
		
//		Altri metodi
		protected int rndNumber() {
			Random in = new Random();
			return in.nextInt(9_999_999);
		}
		
//		Codice
		public int getCodice() {
			return codice;
		}
		private void setCodice(int codice) {
			this.codice = codice;
		}
		public String getPaddedCode() {
			return String.format("%08d", codice);
		}
		
//		Nome
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getFullName() {
			return codice + "-" + nome;
		}

//		Descrizione
		public String getDescrizione() {
			return descrizione;
		}
		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}
		
//		Prezzo
		public float getPrezzo() {
			return prezzo;
		}
		public void setPrezzo(float prezzo) {
			if(prezzo <= 0) {
				return ;
			}
			this.prezzo = prezzo;
		}
		public String getFullPrice() {
			float fullPrice = prezzo + (prezzo * iva / 100);
			return String.format(Locale.US, "%.2f", fullPrice);
		}
		
//		Iva
		public int getIva() {
			return iva;
		}
		public void setIva(int iva) {
			if(iva <= 0 || iva > 100) {
				return ;
			}
			this.iva = iva;
		}
		
		@Override
		public String toString() {
			return "Il codice del prodotto è: " + codice + "\n"
					+ "Il nome del prodotto è: " + nome + "\n"
					+ "La sua descrizione: " + descrizione + "\n"
					+ "Il suo prezzo è: " + prezzo + "€\n"
					+ "Con un iva di: " + iva + "%\n"
					+ "Il nome esteso è: " + getFullName() + "\n"
					+ "Il prezzo compreso di iva è: " + getFullPrice() + "€\n"
					+ "Il codice con pad left è: " + getPaddedCode() + "\n";
		}
		
		
}
