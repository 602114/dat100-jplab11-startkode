package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;


import java.net.*;

public class Bilde extends Tekst {

	// TODO - objekt variable
	private String url;
	URL bilde;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
		super(id, bruker, dato, tekst);
		this.url = url;
		// throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
		super(id, bruker, dato, likes, tekst);
		this.url = url;
		// throw new UnsupportedOperationException(TODO.constructor("Bilde"));
	}
	
	public String getUrl() {
		return url;
		// throw new UnsupportedOperationException(TODO.method());

	}

	public void setUrl(String url) {
		this.url = url;
		// throw new UnsupportedOperationException(TODO.method());
	}

	@Override
	public String toString() {
		// String bruker = super.getBruker();
		String urk = "BILDE\n" + super.getId() + "\n" + super.getBruker() + "\n" + super.getDato() + "\n" + super.getLikes() + "\net bilde\n" + url + "\n";
		return urk;
		// throw new UnsupportedOperationException(TODO.method ()); 
		// BILDE \n 1 \n Ole Olsen \n 23-10 \n 0 \n et bilde \n http://www.picture.com/oo.jpg \n

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
