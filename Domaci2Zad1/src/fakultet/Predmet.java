package fakultet;

import java.util.ArrayList;
import java.util.List;

public class Predmet {

	private List<Osoba> ucesnici;
	
	private String naziv, sifra;
	
	public Predmet(String naziv, String sifra) {
		this.ucesnici = new ArrayList<Osoba>();
		this.naziv = naziv;
		this.sifra = sifra;
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public String getSifra() {
		return sifra;
	}
	
	public void dodajOsobu(Osoba o) throws GViseNastavnika {
		
		for (Osoba osoba : ucesnici) {
			if (o instanceof Nastavnik && osoba instanceof Nastavnik) throw new GViseNastavnika();
		}
		
		ucesnici.add(o);
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(naziv + " (" + sifra + ")\n");
		
		for (Osoba osoba : ucesnici) {
			sb.append(osoba.toString() + "\n");
		}
		
		return sb.toString();
	}
	
}
