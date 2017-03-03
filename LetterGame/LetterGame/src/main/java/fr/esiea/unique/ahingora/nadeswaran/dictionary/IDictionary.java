package fr.esiea.unique.ahingora.nadeswaran.dictionary;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created on 16/01/17.
 */
public interface IDictionary {
    boolean isWord(String word);
    
    static boolean LectureFichier (String motSelect){
    	// TODO Auto-generated method stub
    	String chaine="";
    	String fichier ="src/main/ressources/dico.txt";
    	boolean MotVerif = false;
    	//lecture du fichier texte
    	try{
    		InputStream ips = new FileInputStream(fichier);
    		InputStreamReader ipsr = new InputStreamReader(ips);
    		BufferedReader br = new BufferedReader(ipsr);
    		String ligne;
    		//test de mots
    		do{
    			while ((ligne=br.readLine())!=null){
    				chaine=ligne;
    				Object MotTest = null;
    				if(chaine.equals(MotTest)){
    					MotVerif=true;
    					System.out.println("le mot existe");
    				}
    			}
    		}while(MotVerif == false);
    		
    		br.close();
    	}
    	catch(Exception e){
    		System.out.println(e.toString());
    	}
    	return MotVerif;
    }
}
