package org.lessons.java.security;

public class Utente {
	
	private String nome;
	private String cognome;
	private String colorePreferito;
	private int giornoNascita;
	private int meseNascita;
	private int annoNascita;
	
	// costruttore
	public Utente( String nome , String cognome , String colorePreferito , int giornoNascita , 
			int meseNascita , int annoNascita
			)  {
		
		this.nome = nome;
		
		this.cognome = cognome;
		
		this.colorePreferito = colorePreferito;
		
		this.giornoNascita = giornoNascita;
		
		this.meseNascita = meseNascita;
		
		this.annoNascita = annoNascita;
		
		
		
	}
	
	// getter
	

	public String getNome() {
		return nome;
	}

	public String getCognome() {
		return cognome;
	}

	public String getColorePreferito() {
		return colorePreferito;
	}

	public int getGiornoNascita() {
		return giornoNascita;
	}

	public int getMeseNascita() {
		return meseNascita;
	}

	public int getAnnoNascita() {
		return annoNascita;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	public void setCognome(String cognome) {
		this.cognome = cognome;
	}



	public void setColorePreferito(String colorePreferito) {
		this.colorePreferito = colorePreferito;
	}


	public void setGiornoNascita(int giornoNascita) {
		this.giornoNascita = giornoNascita;
	}



	public void setMeseNascita(int meseNascita) {
		this.meseNascita = meseNascita;
	}



	public void setAnnoNascita(int annoNascita) {
		this.annoNascita = annoNascita;
	}
	
	
	public String toString() {
		
		return "Il tuo nome è " + nome + "\n" +
				"Il tuo cognome è " + cognome + "\n" +
				"Il tuo colorre preferito è " + colorePreferito + "\n" + 
				"Il tuo giorno di nascita è " + giornoNascita + "\n" +
				"Il tuo mese di nascita è " + meseNascita + "\n" +
				"Il tuo anno di nascita è " + annoNascita;	
		
		
	}
	
	
 
}
