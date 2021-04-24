
//   Scrivere un programma che chiede in ingresso il giorno e il mese e stampa il numero dei giorni che sono trascorsi dall'inizio dell'anno fino alla data inserita. 
//   Il programma deve verificare la validità della data inserita, stampando nel caso un messaggio d'errore.
//	 L’anno va considerato non bisestile (febbraio ha 28 giorni)
//	 Esempio: 5 10 (5 Ottobre) → 278 giorni 
//	 Esempio: 33 4 (33 Aprile) → data non valida 
//	 Esempio: 3 14 (3 ?) → data non valida

package data;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.Scanner;

public class Data {
	public static void main(String[] args) {
	
//		Dichiaro le variabili 
		int annoDefault = 2021 ;
		int giornoDefault = 1;
		int meseDefault = 1;
		int meseUtente = 1 ;
		int giornoUtente = 1 ;
		LocalDate localDateDefault = LocalDate.of(annoDefault,meseDefault,giornoDefault);
		LocalDate localDateUtente = LocalDate.of(annoDefault, giornoUtente, meseUtente);
		
		
//		Qui faccio inserire i valori all'utente
		Scanner s = new Scanner(System.in) ;

//		mese
		System.out.println("Inserisci il mese");
				
		
		 meseUtente = s.nextInt();
		
		while (meseUtente > 12  || meseUtente < 0 ) {
			System.out.println("Input non valido inserisci un valore tra 1 e 12");
			 meseUtente = s.nextInt();
		}

		
		
		
//		giorno
		
		System.out.println("Inserisci il giorno");
		giornoUtente = s.nextInt();
		switch (meseUtente) {
//		Questa é la casistica del mese di Febbraio
			case 2: {
				
				while ( giornoUtente < 0 || giornoUtente >28  ) {
					System.out.println("Data inserita non corretta inserisci un valore tra 1 e 28");
					giornoUtente = s.nextInt();
				}
//				Qui tengo conto di tutti i mesi che terminano il 31 
			}
			case 1,3,5,7,8,10,12 :{
				while ( giornoUtente < 0 || giornoUtente >31  ) {
					System.out.println("Data inserita non corretta inserisci un valore tra 1 e 31");
					giornoUtente = s.nextInt();
				}
			}
//			Qui tengo conto di tutti i mesi che terminano il 30
			case 4,6,9,11 : {
				while ( giornoUtente < 0 || giornoUtente > 30  ) {
					System.out.println("Data inserita non corretta inserisci un valore tra 1 e 30");
					giornoUtente = s.nextInt();
				}
			}
		}
//		System.out.println("Il giorno é : " + giornoUtente);
		
//		System.out.println("Il mese é : " + meseUtente);
		
		localDateUtente = LocalDate.of(annoDefault, meseUtente,giornoUtente );
		
		System.out.println("Data inserta dall'utente: " + localDateUtente);
		int days = (int) ChronoUnit.DAYS.between(localDateDefault,localDateUtente);

		System.out.println("Dall'inizio dell anno sono passati:" + days + " giorni");
	}
}
