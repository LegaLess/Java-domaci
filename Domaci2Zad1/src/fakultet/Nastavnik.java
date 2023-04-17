package fakultet;

public class Nastavnik extends Osoba {
	
	public enum Zvanje{
		doc,
		prof;
	}
	
	private Zvanje zvanje;
	
	public Nastavnik(String ime, String prezime, Zvanje zvanje) {
		super(ime, prezime);
		
		this.zvanje = zvanje;
		oznaka = 'N';
	}
	
	@Override
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(zvanje);
		sb.append(". dr ");
		return sb.toString() + ime + " " + prezime;
	}
	
}
