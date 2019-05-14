package fr.natsystem.main;

import java.util.ArrayList;
import java.util.List;

import fr.natsystem.datamodel.Saison;

public class EnumMain {

	
	public static void main(String[] args) {
		String[] moisDeLannee = new String[12];
		moisDeLannee[0] = "janvier";
		moisDeLannee[1] = "fevrier";
		// ...
		moisDeLannee[11] = "décembre";
		int tailleTableau = moisDeLannee.length;
		ArrayList<String> listeMois = new ArrayList<>();
		listeMois.add("janvier");
		listeMois.add("février");
		// ...
		listeMois.add("décembre");
		if (listeMois.contains("avril")) {
			System.out.println("le mois d'avril existe");
		}
		for (int i=0; i<listeMois.size(); i++) {
			String mois = listeMois.get(i);
			System.out.println(mois);
		}
		for (String mois : listeMois) { // on parcourt la liste listeMois
					// chaque élément constitue un tour de plus dans la boucle
					// et est représenté par l'objet mois
			System.out.println(mois);
		}
		
		ArrayList<Saison> listeSaisons = new ArrayList<>();
		listeSaisons.add(Saison.PRINTEMPS);
		listeSaisons.add(Saison.ETE);
		listeSaisons.add(Saison.AUTOMNE);
		listeSaisons.add(Saison.HIVER);
		
		for (Saison saison : listeSaisons) {
			System.out.println(saison);
		}
		
		
	}
}
