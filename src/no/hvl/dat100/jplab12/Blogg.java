package no.hvl.dat100.jplab12.oppgave3;

import no.hvl.dat100.jplab12.common.TODO;
import no.hvl.dat100.jplab12.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	
	private Innlegg[] innleggtabell;
	private int nesteledige;
	
	public Blogg() {
		
		this.innleggtabell = new Innlegg[20];
		this.nesteledige = 0;
	}

	public Blogg(int lengde) {
		
		this.innleggtabell = new Innlegg[lengde];
		this.nesteledige = 0;
	}

	public int getAntall() {
		
		int ant = 0;
		while(ant < nesteledige) {
			ant++;
		}
		System.out.println(ant);
		return ant;
	}
	
	public Innlegg[] getSamling() {
		
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {

		boolean funnet = false;
		int pos = 0;
		while (pos < nesteledige && !funnet) {
			if (innleggtabell[pos].erLik(innlegg)) {
				funnet = true;
			}

			else {
				pos++;
			}
		}
		if (funnet == true) {
			return pos;
		} else {
			return -1;
		}
	}

	public boolean finnes(Innlegg innlegg) {
		
		boolean funnet = false;
		int pos = 0;
		while (pos < nesteledige && !funnet) {
			if (innleggtabell[pos].getId() == innlegg.getId()) {
				funnet = true;
			}

			else {
				pos++;
			}
		}
		if (funnet) {
			return true;
		} else {
			return false;
		}
	}

	public boolean ledigPlass() {
		
		boolean ledig = false;
		int pos = 0;
		while (pos < innleggtabell.length && !ledig) {
			if (nesteledige < pos) {
				ledig = true;
			}
			pos++;
		}
		return ledig;


	}
	
	public boolean leggTil(Innlegg innlegg) {

int p = finnInnlegg(innlegg);
        
		if (p == -1) {
			innleggtabell[nesteledige] = innlegg;
			nesteledige++;
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		
		int i = 0;
		return String.format("%x%n%s%s", innleggtabell.length ,innleggtabell[i].toString(), 
							innleggtabell[i+1].toString());
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}