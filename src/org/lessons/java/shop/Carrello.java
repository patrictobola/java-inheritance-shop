package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Seleziona un prodotto tra: \n"
				+ "Smartphone \n"
				+ "Televisore \n"
				+ "Cuffie \n"
				+ "");
		String product = in.nextLine().toLowerCase();
		if(product.equals("smartphone")) {
			System.out.println("daje");
		}
		
	}
}