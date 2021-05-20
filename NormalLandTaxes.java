package localtaxes.business;

import landowner.LandOwner;

public class NormalLandTaxes implements LandTaxesRole {

	
	private double myTax;
	
	public NormalLandTaxes(double myTax) {
		super();
		this.myTax = myTax;
	}

	public double computeTaxes(LandOwner landOwner) {
		
		return landOwner.compute_total_area()/myTax;
	}

}
