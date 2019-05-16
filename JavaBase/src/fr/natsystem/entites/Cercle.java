package fr.natsystem.entites;

public class Cercle {

	private double rayon;
	public static final double pi = 3.14;

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	
	public double calculPerimetre() { // prend le rayon de l'instance actuelle
														// l'objet actuel
										// et le multiplie par 2pi
		return this.rayon*2*Math.PI;
	}
	
	public double calculAire() {
		return this.rayon*this.rayon*Math.PI;
	}
	
}
