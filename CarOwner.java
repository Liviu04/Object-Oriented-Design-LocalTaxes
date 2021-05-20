package localtaxes.business;

import java.util.ArrayList;
import java.util.List;

public class CarOwner {
	
	List<Engines>engines=new ArrayList<Engines>();

	public CarOwner(List<Engines> engines) {
		super();
		this.engines = engines;
	}
	public void addEngine(Engines engine) {
		engines.add(engine);
	}
	public void deleteEngine(int index) {
		engines.remove(index);
	}
	
	public double computeTotalTaxes() {
		double totalTaxes=0;
		for (Engines engine : engines) {
			totalTaxes=engine.computeTax();
		}
		return totalTaxes;
	}

}
