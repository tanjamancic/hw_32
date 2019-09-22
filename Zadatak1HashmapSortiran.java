package domaci;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Zadatak1HashmapSortiran {

	public static void main(String[] args) {

	Map<String, Integer> mapa = new HashMap<String, Integer>();
	
	mapa.put("Jovica", 35);
	mapa.put("Katarina", 20);
	mapa.put("Aleksa", 23);
	mapa.put("Bilja", 1);
	mapa.put("Svetlana", 19);
	
	sortiranjePoKljucu(mapa);
	System.out.println();
	sortiranjePoKljucuOpcija2(mapa);
		
	}
	
	public static void sortiranjePoKljucu (Map<String, Integer> mapa) {
		
		Map<String,Integer> sortirana = new TreeMap<String,Integer>(mapa);  //TreeMap odmah sortira po kljucu
																			//plus, vezbam oop, primenjujem polimorfizam :)
		for ( String kljuc : sortirana.keySet()) {
			System.out.println(kljuc + " - " + sortirana.get(kljuc));
		}
	}
	
	public static void sortiranjePoKljucuOpcija2 (Map<String, Integer> mapa) {
		
		Object [] nizKljuceva = mapa.keySet().toArray();
		Arrays.sort(nizKljuceva);
		
		for ( Object kljuc: nizKljuceva) {
			System.out.println(kljuc + " - " + mapa.get(kljuc));
		}		
	}
}
