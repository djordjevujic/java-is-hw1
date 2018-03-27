package ostale_klase;

import java.util.ArrayList;
import java.util.List;

public class Racun {
	
	private List<Proizvod> lst_racuni;
	private boolean naplacen = false;
	
	public Racun() {
		lst_racuni = new ArrayList<Proizvod>();	
	}
	
	
	public void dodajNaRacun(Proizvod p) {
		lst_racuni.add(p);
	}

	public List<Proizvod> getNenaplaceniRacun() {
		return lst_racuni;
	}

	public void setNenaplaceniRacun(List<Proizvod> nenaplaceniRacun) {
		this.lst_racuni = nenaplaceniRacun;
	}

	public boolean isNaplacen() {
		return naplacen;
	}

	public void setNaplacen(boolean naplacen) {
		this.naplacen = naplacen;
	}
	
}
