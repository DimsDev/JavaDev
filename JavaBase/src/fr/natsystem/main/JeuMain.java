package fr.natsystem.main;

import java.util.Random;
import java.util.Scanner;

public class JeuMain {

	public static void main(String[] args) {
		Random r = new Random();
		int randomInt = r.nextInt(20) + 1;
		Scanner scanner = new Scanner(System.in);
		int saisie = 0;
		System.out.println("Veuillez saisir un nombre entre 1 et 20");
		
		
		// cas 1
		try {
		// tant que je n'ai pas trouvé le bon nombre
				saisie = scanner.nextInt();	
			while (saisie != randomInt) {
				if (saisie > randomInt) {
					System.out.println("Le nombre saisi est trop grand");
				} else if (saisie < randomInt) {
					System.out.println("Le nombre saisi est trop petit");
				}
			}
		} catch(Exception e) {
			System.out.println("Un entier doit être saisiiiiii !!!");
		}
		System.out.println("Bravo ! Tu as gagné");
	
		// cas 2
		try {
			saisie = scanner.nextInt();	
		}
		catch(Exception exc) {
			saisie = 0;
			System.out.println("Un entier doit être saisiiiiii !!!");
			scanner.nextInt();	
		}
		finally {
			// tant que je n'ai pas trouvé le bon nombre
			while (saisie != randomInt) {
				if (saisie > randomInt) {
					System.out.println("Le nombre saisi est trop grand");
				} else if (saisie < randomInt) {
					System.out.println("Le nombre saisi est trop petit");
				}
			}
		}
		
	}	
}
