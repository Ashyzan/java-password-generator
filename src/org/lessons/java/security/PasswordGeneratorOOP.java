package org.lessons.java.security;


public class PasswordGeneratorOOP {
	
	 
	// Creare la classe Password generator che fornisca un metodo per generare la password 
	// e restituirla

	//metodo password generator (accetta i parametri dell'utente)
	
	
	public static String generaPassword (Utente pippo) {
		
		String password = 
		pippo.getNome() + "-" +
		pippo.getCognome() + "-" +
		pippo.getColorePreferito() + "-" +
		pippo.getGiornoNascita() + "-" +
		pippo.getMeseNascita() + "-" + 
		pippo.getAnnoNascita();
		
		return password;
		
	}


}

