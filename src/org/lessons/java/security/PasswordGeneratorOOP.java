package org.lessons.java.security;


public class PasswordGeneratorOOP {
	
	 
	// Creare la classe Password generator che fornisca un metodo per generare la password 
	// e restituirla

	//metodo password generator (accetta i parametri dell'utente)
	
	
	public static  String generaPassword (Utente pippo) {
		
		Utente pippo1 = new Utente("Pippo", "Pisto", "viola", 6, 3 , 1980);
		
		String password = 
		pippo1.getNome() + "-" +
		pippo1.getCognome() + "-" +
		pippo1.getColorePreferito() + "-" +
		pippo1.getGiornoNascita() + "-" +
		pippo1.getMeseNascita() + "-" + 
		pippo1.getAnnoNascita();
		
		return password;
		
	}



}

