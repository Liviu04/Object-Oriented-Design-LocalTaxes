package localtaxes.business;

import java.util.ArrayList;
import java.util.List;

public class Township {
	
	public List<TaxPayer> taxPayers=new ArrayList<TaxPayer>();
	
	
	
	public Township(List<TaxPayer> taxPayers) {
		super();
		this.taxPayers = taxPayers;
	}
	public void addTaxPayer(TaxPayer taxPayer) {
		taxPayers.add(taxPayer);
	}
	public void deleteTaxPayer(int index) {
		taxPayers.remove(index);
	}

}
