package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.Innlegg;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		boolean klar = false;
		try (PrintWriter writer = new PrintWriter(mappe + filnavn)){
			
			
			writer.write(samling.toString());
			
			
			writer.close();
			klar = true;
			
		} catch (FileNotFoundException e) {
			
		}
		
		return klar;
	}
}

/*
som skriver ut samlingen til fil. Eksempel på innhold av fil for en samling med to elementer:
Metoden skal returnere true om filen blev skrevet og skal håndtere eventuelle unntak 
ifm. fil-håndtering ved å bruke try-catch. 
Hint: bruk toString()-metoden på innlegg-samling. 
Filen bloggkorrekt.dat i Eclipse-prosjektet med tester inneholder korrekt resultat. 
Når testen TestSkriv-testen kjøres vil der bli skrevet i filen blogg.dat der resultatet kan inspiseres. 
Dvs. om metoden er korrekt implementert skal innholdet av filen blogg.dat 
være lik innholdet av filen bloggkorrekt.dat */