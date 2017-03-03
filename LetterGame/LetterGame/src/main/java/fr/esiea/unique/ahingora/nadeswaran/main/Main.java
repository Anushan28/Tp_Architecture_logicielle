package fr.esiea.unique.ahingora.nadeswaran.main;
import java.util.Scanner;

import fr.esiea.unique.ahingora.nadeswaran.letterpot.*;
import fr.esiea.unique.ahingora.nadeswaran.letterbag.*;

public class Main {
	public static void main(String[] args) {
		Scanner	myscan = new Scanner(System.in);
			
			Joueur p1 = new Joueur();
		    Joueur cpu = new Joueur();
		    
		    char l1 = LetterBag.LetterRandom();
		    char l2 = LetterBag.LetterRandom();

			System.out.println("Joueur 1 Veuillez saisir votre nom: ");
			String str = myscan.nextLine();
			System.out.println("Bienvenue "+str);
			
			
			System.out.println("Joueur 2 Veuillez saisir votre nom: ");
			String str1 = myscan.nextLine();
			System.out.println("Bienvenue " +str1);
			
			System.out.println(str +" vous avez choisi " +l1);
			System.out.println(str1 +" vous avez choisi "+l2);
			
			if((int)l1<(int)l2){
				System.out.println(str+" C'est à vous de commencer");
			}
			else{
					System.out.println(str1+" C'est à vous de commencer.");
				}
			}
		
}
