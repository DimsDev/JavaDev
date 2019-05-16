package fr.natsystem.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class LoginMain {

	public static void main(String[] args) {
		String user;
		
		String utilisateurValide ="admin";
		String mdpValide ="pwrd";
		
		System.out.println("Entrez votre ID !");
		Scanner scan = new Scanner(System.in);
		String idSaisi = scan.nextLine();
		idSaisi = idSaisi.trim();
		
		System.out.println("Entrez votre mdp !");
		String mdpSaisi = scan.nextLine();
		mdpSaisi = idSaisi.trim();
		
		user = idSaisi + "\t" + mdpSaisi;
		
		mdpSaisi += "\n";
		
		try {
			
			Files.write(Paths.get("text.log"), mdpSaisi.getBytes(), StandardOpenOption.APPEND);
		}
		catch (IOException e) {
			
			System.out.println("Erreur d'accès au fichier");
			// e.printStackTrace();
		}
		
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
