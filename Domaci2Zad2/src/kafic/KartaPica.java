package kafic;

import java.util.List;
import java.util.ArrayList;

public class KartaPica {
	
	private List<Pice> pica;
	
	public KartaPica() {
		pica = new ArrayList<Pice>();
	}
	
	public void dodajPice(Pice p) throws GPostoji {
		
		for (Pice pice : pica) {
			if (pice.equals(p)) throw new GPostoji();
		}
		
		pica.add(p);
	}
	
	public int getBrojPica() {
		return pica.size();
	}	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("GAZIRANI SOKOVI\n");
		for (Pice pice : pica) {
			if(pice.oznaka == 'G') sb.append(pice.toString() + "\n");
		}
		
		sb.append("NEGAZIRANI SOKOVI\n");
		for (Pice pice : pica) {
			if(pice.oznaka == 'N') sb.append(pice.toString() + "\n");
		}
		
		return sb.toString();
	}
	
}









