package fr.natsystem.log;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Logger {

	public static final String LOG_FILE = "text.log";

	// Dans un log il faut :
	// ajouter date
	
	public void log(String message) {
		// methode qui log le message dans le fichier de log
	try {
				
			Files.write(Paths.get("text.log"), phrase.getBytes(), StandardOpenOption.APPEND);
		}
		catch (IOException e) {
			
			System.out.println("Erreur d'accès au fichier");
			e.printStackTrace();
		}
	}
}