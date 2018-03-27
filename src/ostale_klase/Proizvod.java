package ostale_klase;

public class Proizvod {
	private int id;
	private String naziv;
	private int tezina;
	private double cena;
	

	public Proizvod() {	

	}
	
	public void setData(String linija) {	
		int index = 0;
		String[] podaci = linija.split(",");
		
		id = Integer.parseInt(podaci[index++]);
		naziv = podaci[index++];
		tezina = Integer.parseInt(removeLastChar(podaci[index++]));
		cena = Double.parseDouble(podaci[index++]);
	}
	
	public void printProizvod() {
		System.out.print(this.id + " ");
		System.out.print(this.naziv  + " ");
		System.out.print(this.tezina + " ");
		System.out.println(this.cena);
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
	
	public String removeLastChar(String str) {
		if(str.length() > 1)
			str = str.substring(0, str.length()-1);
		return str;
	}
}

