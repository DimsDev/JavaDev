package fr.natsystem.entites;

public class Ellipse implements Forme {

	private double petitRayon;
	
	private double grandRayon;
	
	public Ellipse(double petitRayon, double grandRayon) {
		this.petitRayon = petitRayon;
		this.grandRayon = grandRayon;
	}

	public Ellipse() {
	}

	public double getPetitRayon() {
		return petitRayon;
	}

	public void setPetitRayon(double petitRayon) {
		this.petitRayon = petitRayon;
	}

	public double getGrandRayon() {
		return grandRayon;
	}

	public void setGrandRayon(double grandRayon) {
		this.grandRayon = grandRayon;
	}
	
	public double calculAire() {
		return Math.PI * this.petitRayon * this.grandRayon;
	}
	
	public double calculPerimetre() {
		return 2*Math.PI*Math.sqrt((this.petitRayon*this.petitRayon + this.grandRayon*this.grandRayon)/2);
	}
}
