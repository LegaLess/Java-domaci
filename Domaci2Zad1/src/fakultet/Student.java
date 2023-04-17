package fakultet;

public class Student extends Osoba {

	private int godUpisa;
	
	private static int id = -1;
	
	private int indeks;
	
	public Student(String ime, String prezime, int godUpisa) {
		super(ime, prezime);
		
		this.godUpisa = godUpisa;
		oznaka = 'S';
		indeks = ++id;
	}
	
	@Override
	public String toString() {
		return godUpisa + "/" + String.format("%04d", indeks) + " - " + ime + " " + prezime;
	}
	
}
