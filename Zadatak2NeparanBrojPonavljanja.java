package domaci;

import java.util.ArrayList;
import java.util.HashMap;

public class Zadatak2NeparanBrojPonavljanja {

	public static void main(String[] args) {

		Integer [] niz = {2,3,5,4,5,2,4,3,5,2,4,4,2};
		
		HashMap<Integer, Integer> hashNiz = brojPonavljanja(niz);
		
		ArrayList<Integer> neparniBrPonavljanja = elementiSaNeparnimBrPonavljanja(hashNiz);
		
		System.out.println(neparniBrPonavljanja);
		
	}
	
	public static HashMap<Integer, Integer> brojPonavljanja (Integer [] niz) {
		HashMap<Integer, Integer> hashNiz = new HashMap<Integer, Integer>();
		
		for ( int i = 0; i < niz.length; i++) {
			if ( !hashNiz.containsKey(niz[i]) ) {
				hashNiz.put(niz[i], 1);
			} else {
				hashNiz.replace(niz[i], hashNiz.get(niz[i])+1);
			}
		}
		
		return hashNiz;
	}
	
	public static ArrayList<Integer> elementiSaNeparnimBrPonavljanja (HashMap<Integer, Integer> hashNiz) {
		ArrayList<Integer> neparniBrPonavljanja = new ArrayList<Integer>();
		
		for ( int kljuc: hashNiz.keySet()) {
			if ( hashNiz.get(kljuc) % 2 != 0) {
				neparniBrPonavljanja.add(kljuc);
			}
		}
		
		return neparniBrPonavljanja;
	}

}
