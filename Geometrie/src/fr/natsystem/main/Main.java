package fr.natsystem.main;

import java.util.Scanner;

import fr.natsystem.entites.Carre;
import fr.natsystem.entites.Cercle;
import fr.natsystem.entites.Triangle;

public class Main {

	public static void main(String[] args) {
		Carre carre = new Carre();
		Cercle cercle = new Cercle();
		double pi = Cercle.pi;
		Triangle triangle = new Triangle();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entrez ici la valeur du côté du carré : ");
		double coteCarre = scanner.nextDouble();
		carre.setCote(coteCarre);
		System.out.println("Entrez ici la valeur du rayon du cercle : ");
		double rayonCercle = scanner.nextDouble();
		cercle.setRayon(rayonCercle);
		System.out.println("Entrez ici la valeur de la base du triangle : ");
		double baseTriangle = scanner.nextDouble();
		triangle.setBase(baseTriangle);
		System.out.println("Entrez ici la valeur du 2e côté du triangle : ");
		double coteBTriangle = scanner.nextDouble();
		triangle.setCoteB(coteBTriangle);
		System.out.println("Entrez ici la valeur du 3e côté du triangle : ");
		double coteCTriangle = scanner.nextDouble();
		triangle.setCoteC(coteCTriangle);
		System.out.println("Entrez ici la valeur de la hauteur du triangle : ");
		double hauteurTriangle = scanner.nextDouble();
		triangle.setHauteur(hauteurTriangle);
		
		System.out.println("Le périmètre du carré est : "
		+ carre.calculPerimetre() 
		+ " et son aire est : " 
		+ carre.calculAire());
		
		System.out.println("Le périmètre du cercle est : "
		+ cercle.calculPerimetre() 
		+ " et son aire est : " 
		+ cercle.calculAire());
		
		System.out.println("Le périmètre du triangle est : "
		+ triangle.calculPerimetre() 
		+ " et son aire est : " 
		+ triangle.calculAire());
		
	}

}
