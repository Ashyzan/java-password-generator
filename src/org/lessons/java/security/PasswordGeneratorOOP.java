package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGeneratorOOP {
	
	 
	// Creare la classe Password generator che fornisca un metodo per generare la password 
	// e restituirla

	//metodo password generator
		public String passwordGen(String nomeUtente , 
									String cognomeUtente , 
									String colorePreferitoUtente , 
									int giornoNascitaUtente , 
									int meseNascitaUtente , 
									int annoNascitaUtente) {
			
			Utente Pippo  = new Utente( //"Pippo", "splendor", "viola", 18, 3,1987 
					);
			Pippo.setNome(nomeUtente);
			Pippo.setCognome(cognomeUtente);
			Pippo.setColorePreferito(colorePreferitoUtente);
			Pippo.setGiornoNascita(giornoNascitaUtente);
			Pippo.setMeseNascita(meseNascitaUtente);
			Pippo.setAnnoNascita(annoNascitaUtente);
			
			int sommaNumeriNascita = giornoNascitaUtente +  meseNascitaUtente + annoNascitaUtente;
			
			String password =  ("nome + cognome + colorePreferito + sommaNumeriNascita");
			
			System.out.println("Sei l'utente " + Pippo);
			System.out.println("La tua password è " + password);
			
			return password;
			
			

			}

}
