package localtaxes.business;

public class LargeCapacity implements EngineCapacitiesRole {

	private double myTax;
	
	public LargeCapacity(double myTax) {
		super();
		this.myTax = myTax;
	}

	public boolean isRightCategory(double engineSize) {
		if(engineSize>=2000)
			return true;
		return false;
	}

	
	public double computeTax() {	
		return myTax;
	}

}
