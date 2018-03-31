//sadrzi sve nenaplacene racune
package ostale_klase;

import java.util.ArrayList;
import java.util.List;

public class Promet {
	
	private List<Racun> lstRacuni;
	private double ukupanPromet;
	
	public Promet() {
		lstRacuni = new ArrayList<Racun>();
	}
	
	public void dodajRacun(Racun r) {
		lstRacuni.add(r);
	}
	
	public void printPromet() {
		for(int i=0; i<lstRacuni.size(); i++) {
			System.out.println();
			System.out.println("Racun " + (i+1) + ":");
			lstRacuni.get(i).printRacun();
			
			ukupanPromet += lstRacuni.get(i).vrednostRacuna();
			System.out.println("Ukupan promet: " + ukupanPromet);
		}
	}
}
