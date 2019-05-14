package fr.natsystem.datamodel;

public class Epargne extends Compte {
	
	private double solde;
	private double tauxInteret;
	
	// Créer une méthode calculInteret qui retourne le nouveau solde apres calcul de l'interet
	public  double calculInteret() {
		this.solde = this.solde * this.tauxInteret;
		
		return this.solde;
	}
	

	public double getSolde() {
		return solde;
	}


	public void setSolde(double solde) {
		this.solde = solde;
	}


	public double getTauxInteret() {
		return tauxInteret;
	}


	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}


	public double retraitArgent(double montant) {
		this.solde -= montant;
		
		return this.solde;
	}
}
