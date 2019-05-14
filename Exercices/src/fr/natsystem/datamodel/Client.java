package fr.natsystem.datamodel;

public class Client {
	
	private String nom; // attribut nom de type String
	/*
	commentaire
	�largi
	*/
	private String adresse;
	
	public Client() { // constructeur
	}

	public Client(String nom, String adresse) { 
		// 2e constructeur
		// avec param�tres
		this.nom = nom; // je mets la valeur du nom pass� en param�tre
						// dans l'attribut nom de l'objet
		this.adresse = adresse;
		
	}
	public void setAdresse(String nouvelleAdresse) {
		this.adresse = nouvelleAdresse; // change la valeur de l'adresse
			// en prenant celle pass�e en param�tre
	}
	
	public String getAdresse() {
		return this.adresse;
		// renvoie la valeur actuelle de l'adresse
	}

	
	public String getNom() { // renvoie la valeur actuelle de l'attribut nom 
		return nom;
	}

	public void setNom(String nom) { // change la valeur de l'attribut nom 
									// par celle du param�tre
		this.nom = nom;
	}
	
	

}
