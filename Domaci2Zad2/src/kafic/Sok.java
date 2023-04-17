package kafic;

public class Sok extends Pice {
	
	public enum Vrsta{
		GAZIRAN,
		NEGAZIRAN;
	}
	
	private Vrsta vrsta;
	
	public Sok(String naziv, float zapremina, int cenaPoL, Vrsta v) {
		super(naziv, zapremina, cenaPoL);
		
		this.vrsta = v;
		
		this.oznaka = vrsta == Vrsta.GAZIRAN ? 'G' : 'N';
	}
	
	public Vrsta getVrsta() {
		return vrsta;
	}
	
}
