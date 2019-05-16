package fr.natsystem.entites;

public class Rectangle {
	
	private double longueur;
	
	private double largeur;
	
	public Rectangle() {
		
	}

	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	
	public double calculPerimetre() {
		return this.largeur * 2 + this.longueur * 2;
	}
	
	public double calculAire() {
		return this.largeur * this.longueur;
	}

}
