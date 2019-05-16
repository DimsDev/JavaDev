package fr.natsystem.entites;

public class Cercle extends Ellipse implements Forme {

	public Cercle(double rayon) {
		super(rayon, rayon);
	}
	
	public Cercle() {
	}
	
	public double getRayon() {
		return super.getPetitRayon();
	// return super.getGrandRayon();
	}

	public void setRayon(double rayon) {
		super.setGrandRayon(rayon);
		super.setPetitRayon(rayon);
	}
	
	// polymorphisme
	@Override // redéfinition de méthode d'une classe parent
	public double calculPerimetre() {
		return 2*Math.PI*this.getRayon();
	}
	
	//surcharge de methode
	public double calculPerimetre(String message) {
		System.out.println(message);
		return 2*Math.PI*this.getRayon();
	}
	
}
