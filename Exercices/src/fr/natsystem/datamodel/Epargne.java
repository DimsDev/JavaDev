package fr.natsystem.datamodel;

public class Epargne {

	private double solde;
	private double tauxInteret;
	
	// créer une méthode calculInteret
	// qui renvoie le nouveau solde apres
	// calcul de l'interet
	
	public double calculInteret(double ancienSolde, double tauxInteret) {
		double nouveauSolde = ancienSolde * tauxInteret; // calcule une variable
		return nouveauSolde;  //renvoie la variable
	}
	
	public double calculInteret() {
		//this.solde = this.solde * this.tauxInteret;
		this.solde *= this.tauxInteret; // modifie une propriete de l'objet Epargne 
		return this.solde; //renvoie la nouvelle valeur de cette propriete
	}
	
	//TODO créer une methode appelée retraitArgent
	public double retraitArgent(double montantARetirer) {
		this.solde -= montantARetirer;
		return this.solde;
	}

	public double getSolde() {
		return this.solde;
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
	
	
}
