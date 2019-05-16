package fr.natsystem.entites;

public interface Forme {  // déclaration de l'interface
	// contraint les classes qui l'implémente a définir les méthodes
	// ci dessous
	public double calculPerimetre();
	// toute classe implémentant cette interface
	// doit posséder ces methodes
	public double calculAire();

}
