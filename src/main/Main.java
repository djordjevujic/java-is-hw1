package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import ostale_klase.*;


public class Main {
	public static void main(String[] args) {
		
		int index = 0;
		
		//String probniString = "1,Cokoladica CIPIRIPI,80g,51.99";
		Racun trenutniRacun = new Racun();
		List<Proizvod> lstSviProizvodi = new ArrayList<Proizvod>();
		
		File file = new File("/home/zoran/Desktop/proizvodi.csv");
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String linija = "";
			while((linija = reader.readLine()) != null) {
				Proizvod prTemp = new Proizvod();
				prTemp.setData(linija);
				//prTemp.printProizvod();
				lstSviProizvodi.add(prTemp);
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		
		Scanner konzola = new Scanner(System.in);
		String komanda = "";
		System.out.println("Za izlaz iz programa unesite end)");
		
		while(!komanda.equalsIgnoreCase("end")) {
			
		}
		System.out.println("Kraj programa");
	}
}
