package skijanje;

public class Teska extends Deonica {

	private final double g = 9.81;
	
	public Teska(double duzina, double nagib) {
		super(duzina, nagib);
		
		oznaka = 'T';
	}
	
	@Override
	public char oznaka() {
		return oznaka;
	}

	@Override
	public double ubrzanje() {
		return g * Math.sin(Math.toRadians(nagib()));
	}

}