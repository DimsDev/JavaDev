package fr.natsystem.services;

public class Calculs {
	
	int addition(int a, int b) {
		
		int resultat;
		resultat = a + b;
		
		return resultat;
	}
	
	// Factorielle avec la boucle For
	public static int factoFor(int nbr) {
		
		for(int i = 1; i <= nbr; i++) {
			nbr *= nbr - 1;
		}
			
		return nbr;
	}
	
	// Factorielle avec la boucle While
	public static int factoWhile(int nbr) {
		int i = 1;
		
		while(i <= nbr) {
			nbr *= nbr - 1;
			
			i++;
		}
		
		return nbr;
	}
	
	// Factorielle avec la boucle 
//	public static int factoDoWhile(int nbr) {
//		
//		
//		return nbr;
//	}
	public static void main(String[] rags) {
		factoFor(4);
	}
	
}
