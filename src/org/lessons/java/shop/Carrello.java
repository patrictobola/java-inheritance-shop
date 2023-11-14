package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Prodotto[] carrello = new Prodotto[10];
		
		System.out.println("Vuooi inserire un nuovo elemento? Si/No: ");
		String answer = in.next().toLowerCase();
		
		if (answer.equals("no")) {
			System.out.println("TODO lista di oggetti nel carrello");
		} else {
			System.out.println("Quale tipo di prodotto vuoi aggiungere? Smartphone/Cuffia/TV");
			String product = in.next().toLowerCase();
			if(product.equals("tv")) {
				carrello[0] = createTV(in);
			}
			System.out.println(carrello[0]);
		}
		
		
	}
	private static Televisore createTV(Scanner in) {
		System.out.println("Inserisci nome");
		String nome = in.next();
		System.out.println("Inserisci breve descrizione");
		String descrizione = in.next();
		System.out.println("Inserisci il prezzo lordo");
		float prezzo = in.nextFloat();
		System.out.println("Inserisci l'iva del prodotto");
		int iva = in.nextInt();
		System.out.println("Inserisci la grandezza della tv espressa in pollici");
		int inch = in.nextInt();
		System.out.println("La tv è smart? Rispondi: true/false");
		boolean smart = in.nextBoolean();
		
		return new Televisore(nome, descrizione, prezzo, iva, inch, smart);
	}
	
}