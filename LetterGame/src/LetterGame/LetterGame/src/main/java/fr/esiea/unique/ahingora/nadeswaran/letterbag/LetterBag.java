package fr.esiea.unique.ahingora.nadeswaran.letterbag;

import java.util.Random;
  
public class LetterBag  {
	protected static char c;
	static Random r = new Random();

	public static char LetterRandom() {
		c = (char)((int)'a' + r.nextInt(26));
		return c;
	}
	
	public boolean BestLetter(char letter1,char letter2){
		if((int)letter1<(int)letter2) {
			return true;
		}else{
			return false;
		}
	}

}