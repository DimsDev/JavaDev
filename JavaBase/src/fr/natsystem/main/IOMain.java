package fr.natsystem.main;

import java.util.Scanner;

public class IOMain {

	public static void main(String[] args) {
		System.out.println("Bienvenu");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entrez un chiffre entre 1 et 9");
		
		int chiffre = scan.nextInt();
		System.out.println("Vous avez entrez " + chiffre);
	}
}
