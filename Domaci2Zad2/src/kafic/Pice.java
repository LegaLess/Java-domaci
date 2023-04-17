package kafic;

public class Pice {
	
	private String naziv;
	private float zapremina;
	private int cenaPoL;
	
	protected char oznaka;
	
	public Pice(String naziv, float zapremina, int cenaPoL) {
		this.naziv = naziv;
		this.zapremina = zapremina;
		this.cenaPoL = cenaPoL;
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public float getZapremina() {
		return zapremina;
	}
	
	public float getCena() {
		return zapremina * cenaPoL;
	}
	
	public char getOznaka() {
		return oznaka;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(naziv + " (");
		sb.append(String.format("%.2f", zapremina));
		sb.append(" L): ");
		sb.append(String.format("%.2f", zapremina * cenaPoL));
		sb.append(" RSD");
		
		return sb.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj == null) return false;
		
		if(!(obj instanceof Pice)) return false;
		
		
		Pice p = (Pice)obj;
		if(p.naziv.equals(this.naziv) && p.zapremina == this.zapremina) return true;
		
		return false;
		
	}
}