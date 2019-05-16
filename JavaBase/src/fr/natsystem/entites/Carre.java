package fr.natsystem.entites;

public class Carre extends Rectangle {

	public Carre() {
		super();
	}
	
	public Carre(double cote) {
		super(cote, cote);
	}
	
	public void setCote(double cote) {
		super.setLongueur(cote);
		super.setLargeur(cote);
	}
	
	public double getCote() {
		return super.getLargeur();
	}

	
}
