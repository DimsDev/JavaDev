package fr.natsystem.tests;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class LogWriterMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Ecrivez une phrase");
		String phrase = scan.nextLine();
		phrase += "\n";
		
		try {
			
			Files.write(Paths.get("text.log"), phrase.getBytes(), StandardOpenOption.APPEND);
		}
		catch (IOException e) {
			
			System.out.println("Erreur d'accès au fichier");
			// e.printStackTrace();
		}
	}

}
