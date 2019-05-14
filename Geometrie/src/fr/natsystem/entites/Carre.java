package fr.natsystem.entites;

public class Carre {

	private double cote;
	
	public Carre() { // constructeur qui ne fait rien sur 
					// l'attribut cote
					// existe par defaut jusqu'à implémentation
					// d'un autre constructeur
	}
	
	public Carre(double cote) {
		this.cote = cote;
	}

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}
	
	public double calculPerimetre() {
		return 4*this.cote;
	}
	
	public double calculAire() {
		return this.cote * this.cote;
	}
	
}
