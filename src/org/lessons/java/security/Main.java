package org.lessons.java.security;

import java.util.Scanner;

public class Main {

	static Utente nuovoUser = new Utente();
	
	public static void main(String[] args) {
		
		
		 //nuovoUser.passwordGen("rosa","pist","viola", 18,3,1982);

		// metodo Scanner permette di prendere un input dalla tastiera
				Scanner input = new Scanner(System.in);
				// apre il field per inserimento dati utente
				System.out.println("Inserisci il tuo nome");
				
				String nuovoUser.setNome(input.nextLine());
				
				System.out.println(nuovoUser);
	}

}
