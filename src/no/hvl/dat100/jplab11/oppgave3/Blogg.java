package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	// TODO: objektvariable 
	/* Klassen Blogg skal lagre Innlegg-objektene sammenhengene fra starten av tabellen 
	 * og ha følgende objektvariable:

		- .innleggtabell. som er en referanse tabell av Innlegg-objekt.
		- .nesteledig. som angir antall Innlegg-objekt som er lagret i tabellen 
		  og dermed neste ledige posisjon i tabellen
	 */
	private Innlegg[] innleggtabell;
	private int nesteledig = 0;
	
	public Blogg() {
		innleggtabell = new Innlegg[20];
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
	}

	public int getAntall() {
		return nesteledig;
		// En metode public int getAntall() som returnerer antall 
		// innlegg-objekt som aktuelt er lagret i tabellen.
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;
	}
	
	/* 
	 * En metode public int finnInnlegg(Innlegg innlegg) som returnerer 
	 * indeks (posisjon) i tabellen for et innlegg i samlingen med samme 
	 * id som parameteren innlegg (om en slik finnes) og -1 ellers. 
	 * Bruk erLik-metoden for Innlegg-objekt i implementasjonen
	 */
	public int finnInnlegg(Innlegg innlegg) {
		int index = 0;
		for (Innlegg in: innleggtabell) {
		  if (innlegg.erLik(in)) {
		    return index;
		  }
		  index++;
		}

		return -1;
	}
	
	/*
	 * En metode public boolean finnes(Innlegg innlegg) 
	 * som returnerer true om der finnes et innlegg i samlingen med samme 
	 * id som innlegget gitt ved parameteren innlegg.
	 */
	public boolean finnes(Innlegg innlegg) {
		return this.finnInnlegg(innlegg) != -1;
	}
	
	// En metode public boolean ledigPlass() 
	// som returnerer true om der er ledig plass i samlingen og false ellers.
	public boolean ledigPlass() {
		return innleggtabell.length > nesteledig;
	}
	
	
	/*
	 * En metode public boolean leggTil(Innlegg innlegg) som legger innlegg inn i tabellen. 
	 * Dersom der ikke finnes et innlegg i tabellen med samme id som innlegg skal metoden 
	 * legge til innlegget på neste ledige plass i tabellen. 
	 * Ellers skal ikke metoden legge inn innlegg i tabellen. 
	 * Metoden skal returnere true om innlegget blev lagt til og false ellers.
	 */
	public boolean leggTil(Innlegg innlegg) {
		if(!this.ledigPlass()) {
			return false;
		}
		
		this.innleggtabell[nesteledig] = innlegg;
		nesteledig++;
		
		return true;
	}
	
	// En metode public String toString() som returnerer data i tabellen 
	// som en streng der første linje i strengen angir antall Innlegg-objekt i tabellen, 
	// eks., en tabell med to innlegg (et tekst-innlegg og et bilde-innlegg):
	// 2\nTEKST\n1\nOle Olsen\n23-10\n0\nen tekst\nBILDE\n2\nOline Olsen\n24-10\n0\net bilde\nhttp://www.picture.com/oo.jpg\n

	public String toString() {
		
		String ut = this.getAntall() + "\n";
		for (Innlegg in: innleggtabell) {
			if (in == null) {
				continue;
			}
			ut += in.toString();
		}
		return ut;
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