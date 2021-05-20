package localtaxes.business;

import landowner.LandOwner;

public class LandCarTaxesPayer implements TaxPayer{


	private LandOwner landOwner;
	private CarOwner  carOwner;
	private LandTaxesRole landTaxes;
	
	public LandCarTaxesPayer(LandOwner landOwner,CarOwner carOwner, LandTaxesRole landTaxes) {
		super();
		this.landOwner = landOwner;
		this.carOwner = carOwner;
		this.landTaxes = landTaxes;
	}
	


	public double computeTaxes() {
		return carOwner.computeTotalTaxes()+landTaxes.computeTaxes(landOwner);
	}

}
