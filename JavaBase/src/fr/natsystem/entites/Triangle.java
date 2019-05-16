package fr.natsystem.entites;

public class Triangle {

	private double base; // premier côté
	
	private double hauteur;
	
	private double coteB; // deuxième côté
	
	private double coteC; // 3e côté

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHauteur() {
		return hauteur;
	}

	public void setHauteur(double hauteur) {
		this.hauteur = hauteur;
	}

	public double getCoteB() {
		return coteB;
	}

	public void setCoteB(double coteB) {
		this.coteB = coteB;
	}

	public double getCoteC() {
		return coteC;
	}

	public void setCoteC(double coteC) {
		this.coteC = coteC;
	}
	
	
	public double calculPerimetre() {
		return this.base + this.coteB + this.coteC;
	}
	
	public double calculAire() {
		return this.base * this.hauteur/2;
	}
	
	
	
}
