package no.hvl.dat100.jplab12.oppgave1;

import no.hvl.dat100.jplab12.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	protected int id;
	private String bruker;
	private String dato;
	private int likes;
	
	public Innlegg()  {
		
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		// TODO 
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		
		this.bruker = bruker;
	}

	public String getDato() {
		
		return dato;
		
	}

	public void setDato(String dato) {
		
		this.dato = dato;
	}

	public int getId() {
		
		return id;

	}

	public int getLikes() {
		
		return likes;

	}
	
	public void doLike () {
		
		likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		
		boolean sant = false;
			if(this == innlegg) {
				sant = true;
			}
				return sant;

	}
	
	@Override
	public String toString() {
		
		return String.format("%x%n%s%n%s%n%x%n", id, bruker, dato, likes);
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}