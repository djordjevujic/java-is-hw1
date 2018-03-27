package ostale_klase;

public class Proizvod {
	private int id;
	private String naziv;
	private int tezina;
	private double cena;
	private int index;
	

	public Proizvod(String linija) {	
		index = 0;
		String[] podaci = linija.split(",");
		
		id = Integer.parseInt(podaci[index++]);
		naziv = podaci[index++];
		tezina = Integer.parseInt(podaci[index++]);
		cena = Double.parseDouble(podaci[index++]);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getTezina() {
		return tezina;
	}

	public void setTezina(int tezina) {
		this.tezina = tezina;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}

