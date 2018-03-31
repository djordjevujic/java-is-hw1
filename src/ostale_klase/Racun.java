package ostale_klase;

import java.util.ArrayList;
import java.util.List;

public class Racun {
	
	private List<Proizvod> lst_proizvodi;
	
	public Racun() {
		lst_proizvodi = new ArrayList<Proizvod>();	
	}
	
	public void obrisiRacune(){
		while(lst_proizvodi.size() > 0)
			lst_proizvodi.remove(0);
	}
	
	public double vrednostRacuna() {
		double suma = 0;
		
		for(int i=0; i<lst_proizvodi.size(); i++) {
			suma += lst_proizvodi.get(i).getCena();
		}
		
		return suma;
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
	
}
