package fr.natsystem.datamodel;

public class Client {
	
	String s_nom;
	String s_adresse;
	
	public Client() { // constructeur
	}
	
	public Client(String nom, String adresse) { // constructeur
		
		this.s_nom = nom;
		this.s_adresse = adresse;
	}
	
	void changerAdresse(String nouvelleAdresse) {
		
		this.s_adresse = nouvelleAdresse;
	}
	
	public String avoirAdresse() {
		
		return this.s_adresse;
	}

	public String getS_nom() {
		return s_nom;
	}

	public void setS_nom(String s_nom) {
		this.s_nom = s_nom;
	}

	public String getS_adresse() {
		return s_adresse;
	}

	public void setS_adresse(String s_adresse) {
		this.s_adresse = s_adresse;
	}
}
