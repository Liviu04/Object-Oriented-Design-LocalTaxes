package localtaxes.business;

public class MediumCapacity implements EngineCapacitiesRole {

	private double myTax;
	
	public MediumCapacity(double myTax) {
		super();
		this.myTax = myTax;
	}

	public boolean isRightCategory(double engineSize) {
		if(engineSize>=1000&&engineSize<2000)
			return true;
		return false;
	}

	@Override
	public double computeTax() {
		return myTax;
	}

}
