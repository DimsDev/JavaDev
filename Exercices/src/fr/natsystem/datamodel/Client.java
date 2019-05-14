package fr.natsystem.datamodel;

public class Client {
	
	private String nom; // attribut nom de type String
	/*
	commentaire
	élargi
	*/
	private String adresse;
	
	public Client() { // constructeur
	}

	public Client(String nom, String adresse) { 
		// 2e constructeur
		// avec paramètres
		this.nom = nom; // je mets la valeur du nom passé en paramètre
						// dans l'attribut nom de l'objet
		this.adresse = adresse;
		
	}
	public void setAdresse(String nouvelleAdresse) {
		this.adresse = nouvelleAdresse; // change la valeur de l'adresse
			// en prenant celle passée en paramètre
	}
	
	public String getAdresse() {
		return this.adresse;
		// renvoie la valeur actuelle de l'adresse
	}

	
	public String getNom() { // renvoie la valeur actuelle de l'attribut nom 
		return nom;
	}

	public void setNom(String nom) { // change la valeur de l'attribut nom 
									// par celle du paramètre
		this.nom = nom;
	}
	
	

}
