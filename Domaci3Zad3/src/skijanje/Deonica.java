package skijanje;

public abstract class Deonica {
	
	private double duzina;
	private double nagib;
	protected char oznaka;
	
	public abstract char oznaka();
	public abstract double ubrzanje();
	
	public Deonica(double duzina, double nagib) {
		this.duzina = duzina;
		this.nagib = nagib;
	}
	
	public double duzina() {
		return duzina;
	}
	
	public double nagib() {
		return nagib;
	}
	
	public double brzina(double pocetnaBrzina) {
		return Math.sqrt(2 * ubrzanje() * duzina() + Math.pow(pocetnaBrzina, 2));
	}
	
	public double vreme(double pocetnaBrzina) {
		return (brzina(pocetnaBrzina) - pocetnaBrzina) / ubrzanje();
	}
	
	@Override
	public String toString() {
		return oznaka() + "(" + duzina() + "," + nagib() + ")";
	}
	
}
