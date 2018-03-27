package ostale_klase;

import java.util.ArrayList;
import java.util.List;

public class Racun {
	
	private List<Proizvod> lst_proizvodi;
	private boolean naplacen = false;
	
	public Racun() {
		lst_proizvodi = new ArrayList<Proizvod>();	
	}
	
	
	public void dodajNaRacun(Proizvod p) {
		lst_proizvodi.add(p);
	}
	
	public List<Proizvod> getNenaplaceniRacun() {
		return lst_proizvodi;
	}

	public void setNenaplaceniRacun(List<Proizvod> nenaplaceniRacun) {
		this.lst_proizvodi = nenaplaceniRacun;
	}

	public boolean isNaplacen() {
		return naplacen;
	}

	public void setNaplacen(boolean naplacen) {
		this.naplacen = naplacen;
	}
	
}
