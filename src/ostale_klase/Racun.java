package ostale_klase;

import java.util.ArrayList;
import java.util.List;

public class Racun {
	
	private List<Proizvod> lst_proizvodi;
	private boolean naplacen = false;
	
	public Racun() {
		lst_proizvodi = new ArrayList<Proizvod>();	
	}
	
	public void printRacun() {
		for(int i=0; i<lst_proizvodi.size(); i++) {
			lst_proizvodi.get(i).printProizvod();
		}
	}
	
	public void dodajNaRacun(Proizvod p) {
		lst_proizvodi.add(p);
	}

	public List<Proizvod> getLst_proizvodi() {
		return lst_proizvodi;
	}

	public void setLst_proizvodi(List<Proizvod> lst_proizvodi) {
		this.lst_proizvodi = lst_proizvodi;
	}

	public boolean isNaplacen() {
		return naplacen;
	}

	public void setNaplacen(boolean naplacen) {
		this.naplacen = naplacen;
	}

	
}
