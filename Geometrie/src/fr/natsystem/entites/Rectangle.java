package fr.natsystem.entites;

public class Rectangle extends Quadrilatere implements Forme{

	public Rectangle() {
		
	}

	public Rectangle(double longueur, double largeur) {
		super.setCoteA(longueur);
		super.setCoteB(largeur);
		super.setCoteC(longueur);
		super.setCoteD(largeur);
	}

	public double getLongueur() {
		return super.getCoteA();
	}

	public void setLongueur(double longueur) {
		super.setCoteA(longueur);
		super.setCoteC(longueur);
	}

	public double getLargeur() {
		return super.getCoteB();
	}

	public void setLargeur(double largeur) {
		super.setCoteB(largeur);
		super.setCoteD(largeur);
	}

	@Override
	public double calculAire() {
		return super.getCoteA() * super.getCoteB();
		//return this.getLongueur() * this.getLargeur();
	}

}
