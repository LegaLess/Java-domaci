package fakultet;

public class Osoba {
	
	protected String ime, prezime;
	protected char oznaka;
	
	public Osoba(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}
	
	
	public char getOznaka() {
		return oznaka;
	}
	
	@Override
	public String toString() {
		return ime + " " +  prezime;
	}
	
}
