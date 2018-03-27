//sadrzi sve nenaplacene racune
package ostale_klase;

import java.util.ArrayList;
import java.util.List;

public class Promet {
	
	private List<Racun> lst_racuni;
	
	public Promet() {
		lst_racuni = new ArrayList<Racun>();
	}
	
	public void dodajRacun(Racun r) {
		if(r.isNaplacen() == false)
			lst_racuni.add(r);
	}
}
