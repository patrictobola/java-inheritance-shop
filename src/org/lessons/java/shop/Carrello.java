package org.lessons.java.shop;

import java.util.Arrays;
import java.util.Scanner;

public class Carrello {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Prodotto[] carrello = new Prodotto[10];
		for(int x = 0; x < carrello.length; x++) {
			
		System.out.println("Vuoi inserire un nuovo elemento? Si/No: ");
		String answer = in.next().toLowerCase();
		
		if (answer.equals("no")) {
			System.out.println(Arrays.asList(carrello));
			break;
		} else {
			System.out.println("Quale tipo di prodotto vuoi aggiungere? Smartphone/Cuffia/TV");
			String product = in.next().toLowerCase();
			if(product.equals("tv")) {
				carrello[x] = createTV(in);
			}else if(product.equals("cuffia")) {
				carrello[x] = createCuffia(in);
			}else if(product.equals("smartphone")) {
			carrello[x] = createSmartphone(in);
			}else {
				System.out.println("Inserisci uno dei 3 prodotti sopracitati");
			}
			System.out.println(carrello[x]);
		}
		
		}
		
	}
	private static Televisore createTV(Scanner in) {
		System.out.println("Inserisci nome della tv");
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
	private static Cuffia createCuffia(Scanner in) {
		System.out.println("Inserisci nome delle cuffie");
		String nome = in.next();
		System.out.println("Inserisci breve descrizione");
		String descrizione = in.next();
		System.out.println("Inserisci il prezzo lordo");
		float prezzo = in.nextFloat();
		System.out.println("Inserisci l'iva del prodotto");
		int iva = in.nextInt();
		System.out.println("Inserisci il colore delle cuffie");
		String color = in.next();
		System.out.println("Le cuffie sono cablate o wireless? Rispondi: cablate/wireless");
		String connection = in.next();
		
		return new Cuffia(nome, descrizione, prezzo, iva, color, connection);
	}
	private static Smartphone createSmartphone(Scanner in) {
		System.out.println("Inserisci nome dello smartphone");
		String nome = in.next();
		System.out.println("Inserisci breve descrizione");
		String descrizione = in.next();
		System.out.println("Inserisci il prezzo lordo");
		float prezzo = in.nextFloat();
		System.out.println("Inserisci l'iva del prodotto");
		int iva = in.nextInt();
		int codiceImei = 0;
		System.out.println("Da quanti GB è la memoria?");
		int memorySize = in.nextInt();
		
		return new Smartphone(nome, descrizione, prezzo, iva, codiceImei, memorySize);
	}
	
}