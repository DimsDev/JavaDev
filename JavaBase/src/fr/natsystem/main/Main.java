package fr.natsystem.main;

import java.util.Scanner;

import fr.natsystem.datamodel.Client;
import fr.natsystem.datamodel.Epargne;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello world !");
		
		Client premierClient = new Client();
		Client deuxiemeClient = new Client("Bob", "3 rue du Paadis");
		
		System.out.println(deuxiemeClient.avoirAdresse());
		premierClient.avoirAdresse();
		deuxiemeClient.avoirAdresse();
		
		// CTRL+Shift+0 import auto des packages
		
		deuxiemeClient.setS_nom("Boby");
		
		Client clt = new Client();
		Epargne cptEpargne = new Epargne();
		
		cptEpargne.setSolde(1000);
		cptEpargne.calculInteret();
		cptEpargne.setTauxInteret(1.02); // 2%
		cptEpargne.retraitArgent(29);
		
		clt.setS_nom("Igor");
		clt.setS_adresse("13 Avenue d'Issy");
		
		// ******
		
		System.out.println("Saisir solde initial :");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entrez un chiffre entre 1 et 9");
		
		double cpt = scan.nextInt();
		System.out.println("Vous avez entrez : " + cpt);
	}
	
}
