package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		String nome;
		String cognome;
		String colore;
		int giorno;
		int mese;
		int anno;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome");
		nome = scan.next();
		
		System.out.println("Inserisci il tuo cognome");
		cognome = scan.next();
		
		System.out.println("Inserisci il tuo colore preferito");
		colore = scan.next();
		
		System.out.println("Inserisci il tuo giorno di nascita");
		giorno = scan.nextInt();
		
		System.out.println("Inserisci il tuo mese di nascita sotto forma di numero");
		mese = scan.nextInt();
		
		System.out.println("Inserisci il tuo anno di nascita");
		anno = scan.nextInt();
		
		int somma_numeri = giorno + mese + anno;
				
		String user_password = nome + "-" + cognome + "-" + colore + "-" + somma_numeri;
		System.out.println(String.format("La tua password è %s", user_password));
		
		
	}

}
