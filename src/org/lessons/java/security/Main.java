package org.lessons.java.security;

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
		

		// metodo Scanner permette di prendere un input dalla tastiera
				Scanner input = new Scanner(System.in);
				// apre il field per inserimento dati utente
				System.out.println("Inserisci il tuo nome");
				// attribuisce alla variabile nome l'input inserito dall'utente
				String nome = input.nextLine();
				
				// cognome
				
				System.out.println("Inserisci il tuo conome");
				
				String cognome = input.nextLine();
				
				// colore preferito
				System.out.println("Inserisci il colore preferito");
				
				String colorePreferito = input.nextLine();
				
				// giorno nascita
				System.out.println("Inserisci il giorno di nascita (numero)");
				
				int dataNascita = input.nextInt();
				
				// mese nascita
				System.out.println("Inserisci il mese di nascita (numero)");
				
				int meseNascita = input.nextInt();
				
				// anno nascita
				System.out.println("Inserisci l'anno di nascita");
				int annoNascita = input.nextInt();
				
				
				// Creo l'oggetto utente a partire dagli input inseriti con scanner
				Utente Pippo = new Utente(nome, cognome, colorePreferito, dataNascita,meseNascita, annoNascita );
				
				System.out.println(Pippo);
				
				System.out.println("La tua password è " + Pippo.generaPassword(Pippo));
				
				
				

				
	}


}
