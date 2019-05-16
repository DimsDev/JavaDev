package fr.natsystem.entites;

public abstract class Quadrilatere implements Forme {
	// class non instanciable qui sert
	// a donner des informations sur toutes ses classes enfants

	private double coteA;
	
	private double coteB;
	
	private double coteC;
	
	private double coteD;
	
	
	

	public Quadrilatere() {
	}

	public Quadrilatere(double coteA, double coteB, double coteC, double coteD) {
		this.coteA = coteA;
		this.coteB = coteB;
		this.coteC = coteC;
		this.coteD = coteD;
	}

	public double getCoteA() {
		return coteA;
	}

	public void setCoteA(double coteA) {
		this.coteA = coteA;
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

	public double getCoteD() {
		return coteD;
	}

	public void setCoteD(double coteD) {
		this.coteD = coteD;
	}
	
	public double calculPerimetre() {
		return this.coteA + this.coteB + this.coteC + this.coteD;
	}
	
	public abstract double calculAire();
	// méthode abstraite sans implémentation
	// qui force toute classe fille a l'implémenter
	
}
