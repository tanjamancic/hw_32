package domaci;

import java.util.ArrayList;
import java.util.HashMap;

public class Zadatak3DedaMraz {

	public static void main(String[] args) {

		ArrayList<String> svaDeca = new ArrayList<String>();
		svaDeca.add("Petar");
		svaDeca.add("Sonja");
		svaDeca.add("Tanja");
		svaDeca.add("Uros");
		svaDeca.add("Ivana");
		svaDeca.add("Sanja");
		svaDeca.add("Veljko");
		svaDeca.add("Nebojsa");

		ArrayList<String> decaDobroDelo = new ArrayList<String>();
		decaDobroDelo.add("Tanja");
		decaDobroDelo.add("Uros");
		decaDobroDelo.add("Veljko");
		decaDobroDelo.add("Sanja");
		decaDobroDelo.add("Tanja");
		decaDobroDelo.add("Uros");
		decaDobroDelo.add("Nebojsa");

		HashMap<String, Integer> decaBrojDD = decaBrojDobrihDela(svaDeca, decaDobroDelo);

		brojDeceSa2iliViseDD(decaBrojDD);

	}

	public static HashMap<String, Integer> decaBrojDobrihDela(ArrayList<String> svaDeca, ArrayList<String> decaDobroDelo) {
		HashMap<String, Integer> decaBrojDD = new HashMap<String, Integer>();
		
		for (int i = 0; i < decaDobroDelo.size(); i++) {
			if (!decaBrojDD.containsKey(decaDobroDelo.get(i))) {
				decaBrojDD.put(decaDobroDelo.get(i), 1);
			} else {
				decaBrojDD.replace(decaDobroDelo.get(i), decaBrojDD.get(decaDobroDelo.get(i)) + 1);
			}
		}

		return decaBrojDD;
	}

	public static void brojDeceSa2iliViseDD(HashMap<String, Integer> decaBrojDD) {
		for (String dete : decaBrojDD.keySet()) {
			if (decaBrojDD.get(dete) > 1) {
				System.out.println(dete + ", broj dobrih dela: " + decaBrojDD.get(dete));
			}
		}
	}
}
