package fr.natsystem.main;

import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {
		String utilisateurValide ="admin";
		String mdpValide ="pwrd";
		
		System.out.println("Entrez votre ID !");
		Scanner scan = new Scanner(System.in);
		String idSaisi = scan.nextLine();
		
		System.out.println("Entrez votre mdp !");
		String mdpSaisi = scan.nextLine();
		
		if(utilisateurValide.equals(idSaisi)) {
			if(mdpValide.equals(mdpSaisi)) {
				System.out.println("Bienvenue !!!");
			}
			else {
				System.out.println("Mauvaise infos !");
			}
		}
		else {
			System.out.println("Movaiz Zinfo !");
		}
	}
}
