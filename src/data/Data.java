
//   Scrivere un programma che chiede in ingresso il giorno e il mese e stampa il numero dei giorni che sono trascorsi dall'inizio dell'anno fino alla data inserita. 
//   Il programma deve verificare la validità della data inserita, stampando nel caso un messaggio d'errore.
//	 L’anno va considerato non bisestile (febbraio ha 28 giorni)
//	 Esempio: 5 10 (5 Ottobre) → 278 giorni 
//	 Esempio: 33 4 (33 Aprile) → data non valida 
//	 Esempio: 3 14 (3 ?) → data non valida

package data;

import java.util.Scanner;

public class Data {
	public static void main(String[] args) {
	
		
		
//		Qui faccio inserire i valori all'utente
		Scanner s = new Scanner(System.in) ;
		
//		giorno
		System.out.println("Inserisci il giorno");
		
		int giornoUtente = s.nextInt();
		
		System.out.println("Il giorno é : " + giornoUtente);
		
//		mese
		System.out.println("Inserisci il mese");
				
		
		int meseUtente = s.nextInt();
		if (meseUtente > 12 ) {
			System.out.println("Input non valido inserisci un valore tra 1 e 12");
			 meseUtente = s.nextInt();
		}
		System.out.println("Il mese é : " + meseUtente);
	}
}
