package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;
// import no.hvl.dat100.tests.TInnlegg;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable. objektvariable id (heltall), 
	// bruker (tekststreng), dato (tekststreng), og antall likes (heltall). 
	private int id;
	private int likes;
	private String bruker, dato;
	// private String dato;
	// Innlegg = new Innlegg();
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {
		this.bruker = bruker;
		this.id = id;
		this.dato = dato;
		this.likes = 0;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {
		this.bruker = bruker;
		this.id = id;
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
		// Implementer metoden public boolean erLik(Innlegg innlegg) som returnerer true 
		// hvis og kun hvis innlegget har samme id som innlegget innlegg git med som parameter.
		boolean lik = false;
		
		if (this == innlegg) {
			lik = true;
		}
		
		return lik;

	}
	
	@Override
	public String toString() {
		// System.out.println(id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n");
		String info = id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
		// "1\nOle Olsen\n23-10\n7\n"
		return info;		
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
