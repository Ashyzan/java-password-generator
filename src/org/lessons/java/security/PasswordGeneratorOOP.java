package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGeneratorOOP {
	
	//metodo password generator

		public String passwordGen(String nome , String cognome , String colorePreferito , int giornoNascita , 
				int meseNascita , int annoNascita) {
			
			int sommaNumeriNascita = giornoNascita +  meseNascita + annoNascita;
			
			String password =  ("nome + cognome + colorePreferito + sommaNumeriNascita");
			
			return password;
			

			}

}
