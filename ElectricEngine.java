package localtaxes.business;

public class ElectricEngine implements Engines {

	private ElectricEngineTaxesRole engineTaxes; 
	
	public ElectricEngine(ElectricEngineTaxesRole engineTaxes) {
		super();
		this.engineTaxes = engineTaxes;
	}

	public double computeTax() {
		
		return engineTaxes.computeTax();
	}

}
