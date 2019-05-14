package fr.natsystem.main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import fr.natsystem.datamodel.Saison;

public class LoginMain {

	
	public static void main(String[] args) {
		String utilisateurValide = "admin";
		String motDePasseValide = "password";
		System.out.println("Entrez votre nom d'utilisateur : ");
		Scanner scanner = new Scanner(System.in);
		String utilisateurSaisi = scanner.nextLine();
		
		System.out.println("Entrez votre mot de passe : ");
		String motDePasseSaisi = scanner.nextLine();
		  // utilisateurValide == utilisateurSaisi
		  // && : ET logique
		  // || : OU logique
		if (utilisateurValide.equals(utilisateurSaisi)) {
			if (motDePasseValide.equals(motDePasseSaisi)) {
				System.out.println("Bienvenu(e) dans le programme !");
			} else {
				System.out.println("Utilisateur et/ou mot de passe invalides");
			}
		} else {
			System.out.println("Utilisateur et/ou mot de passe invalides");
		}
		
		
	}
}
