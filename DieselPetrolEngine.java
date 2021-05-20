package localtaxes.business;

public class DieselPetrolEngine implements Engines {

	private double engineSize;
	private EngineCategoryTaxesComputer engineCategory;
	
	public DieselPetrolEngine(double engineSize, EngineCategoryTaxesComputer engineCategory) {
		super();
		this.engineSize = engineSize;
		this.engineCategory = engineCategory;
	}

	public double computeTax() {
		return engineCategory.computeTax(engineSize);
	}

}
