package localtaxes.business;

import java.util.ArrayList;
import java.util.List;

public class PetrolDieselTaxesComputer implements EngineCategoryTaxesComputer {

	private List<EngineCapacitiesRole> engineCapacities=new ArrayList<EngineCapacitiesRole>();
	

	public PetrolDieselTaxesComputer(List<EngineCapacitiesRole> engineCapacities) {
		super();
		this.engineCapacities = engineCapacities;
	}

	public void addCapacity(EngineCapacitiesRole capacity) {
		engineCapacities.add(capacity);
	}
	public void removeCapacity(int index) {
		engineCapacities.remove(index);
	}
	
	public double computeTax(double engineSize) {
            double tax=0;		
			for (EngineCapacitiesRole engineCategory : engineCapacities) {
				if(engineCategory.isRightCategory(engineSize))
					tax=engineCategory.computeTax();
					
			}
			return tax;
	
	}

}
