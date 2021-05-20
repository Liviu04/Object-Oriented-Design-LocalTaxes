package localtaxes.business;

public class SmallCapacity implements EngineCapacitiesRole {

	
	private double myTax;
	
	
	public SmallCapacity(double myTax) {
		super();
		this.myTax = myTax;
	}

	public boolean isRightCategory(double engineSize) {
		if (engineSize<1000)
		return true;
		return false;
	}

	@Override
	public double computeTax() {
		return myTax;
	}

}
