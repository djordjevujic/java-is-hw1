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
		
		int IndexTrenutniRacun = 0;
		int i=0;
		
		//String probniString = "1,Cokoladica CIPIRIPI,80g,51.99";
		List<Racun> lstRacuni = new ArrayList<Racun>();
		List<Proizvod> lstSviProizvodi = new ArrayList<Proizvod>();
		
		Promet trenutniPromet = new Promet();
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
		int komandaInt = 0;
		boolean inputSuccess = true;
		
		System.out.println("Novi racun - R");
		System.out.println("Prikaz pazara - P");
		System.out.println("Izlaz - end");
		
		while(!komanda.equalsIgnoreCase("end")) {
			do {	
				inputSuccess = true;
				try {
					komanda = konzola.nextLine();
				}
				catch (Exception e)
				{
					inputSuccess = false;
					System.out.println(e);
					System.out.println("Try again!");
				}
			}while(inputSuccess = false);
			switch(komanda) {
				
				case "R":{
				
					Racun tempRacun = new Racun();
					lstRacuni.add(tempRacun);
					do {
						System.out.println("Dodavanje novog proizvoda - unesite ID");
						//zastita unosa intedzera
						do {	
							inputSuccess = true;
							try {
								komanda = konzola.nextLine();
								komandaInt = Integer.parseInt(komanda);
							}
							catch (Exception e)
							{
								if((!komanda.equalsIgnoreCase("o")) && (!komanda.equalsIgnoreCase("n")))
								{
									inputSuccess = false;
								
									System.out.println(e);
									System.out.println("Neispravan unos! Pokusajte ponovo.");
								}
							}
						}while(inputSuccess == false);
						
						//dodavanje novog racuna
						if(komanda.equalsIgnoreCase("o") || komanda.equalsIgnoreCase("n"))
							break;
						//dodavanje novog racuna
						for(i=0; i < lstSviProizvodi.size(); i++)
						{
							if(lstSviProizvodi.get(i).getId() == komandaInt) {
								lstRacuni.get(IndexTrenutniRacun).dodajNaRacun(lstSviProizvodi.get(i));
							}
						}
					}while(komandaInt > 1 || 
							komandaInt < lstSviProizvodi.get(lstSviProizvodi.size()-1).getId());
					
					//Naplati racun
					if(komanda.equalsIgnoreCase("n")) {
						lstRacuni.get(IndexTrenutniRacun).printRacun(); //test function
						trenutniPromet.dodajRacun(lstRacuni.get(IndexTrenutniRacun));
						IndexTrenutniRacun++;
					}
					
					if(komanda.equalsIgnoreCase("o")) {
						lstRacuni.get(IndexTrenutniRacun).obrisiRacune();
						lstRacuni.get(IndexTrenutniRacun).printRacun(); //test function
					}
					
					break;
				}
				case "P":{
					trenutniPromet.printPromet();
					break;
				}
			}
		}
		System.out.println("Kraj programa");
	}
}
