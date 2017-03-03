package fr.esiea.unique.ahingora.nadeswaran.letterpot;
import java.util.*;

import fr.esiea.unique.ahingora.nadeswaran.letterbag.LetterBag;

public class LetterPot extends LetterBag {
	
	static ArrayList<String> pot = new ArrayList<String>();
	static String l;
	
	public static void Pot() {
		//System.out.println(l);
		pot.add(l);
		System.out.println(pot);
	}
	
	public void setLettre(String lettre){
		LetterPot.l = lettre;
	}
	
	public static void main (String[] args){
		for(int i=0; i<10; i++){
			LetterPot letterpot = new LetterPot();
			String le = Character.toString(LetterBag.LetterRandom());
			
			letterpot.setLettre(le);
		}
		LetterPot.Pot();
	}
}