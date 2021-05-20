package localtaxes.business;

public class NormalElectricEngineTaxes implements ElectricEngineTaxesRole {

	double myTax;
	
	
	public NormalElectricEngineTaxes(double myTax) {
		super();
		this.myTax = myTax;
	}


	public double computeTax() {
		
		return myTax;
	}

}
