package localtaxes.construction;

import java.util.ArrayList;
import java.util.List;

import landowner.LandOwner;
import landowner.Rectangle;
import landowner.Shape;
import landowner.Square;
import localtaxes.business. *;
public class Application {
	private Township township;

	public Application() {
		List<TaxPayer> taxPayers = new ArrayList<TaxPayer>();
		township = new Township(taxPayers);

	}

	public static void main(String[] args) {
		Application application = new Application();
		application.run();
	}

	private void run() {
		List<Shape> shapes1 = new ArrayList<Shape>();
		LandOwner landOwner1 = new LandOwner(shapes1);
		Rectangle land1 = new Rectangle(20, 8);
		Square land2 = new Square(40);
		landOwner1.addLand(land1);
		landOwner1.addLand(land2);
		
		NormalLandTaxes landTax =new NormalLandTaxes(100);
		
		SmallCapacity dieselSmallCapacity = new SmallCapacity(80);
		MediumCapacity dieselMediumCapacity=new MediumCapacity(90);
		LargeCapacity  dieselLargeCapacity=new LargeCapacity(105);
		
		SmallCapacity petrolSmallCapacity =new SmallCapacity(70);
		MediumCapacity petrolMediumCapacity=new MediumCapacity(80);
		LargeCapacity petrolLargeCapacity=new LargeCapacity(95);
		List<EngineCapacitiesRole> dieselCapacities=new ArrayList<EngineCapacitiesRole>();
		PetrolDieselTaxesComputer dieselTaxesComputer = new PetrolDieselTaxesComputer(dieselCapacities);
		dieselTaxesComputer.addCapacity(dieselSmallCapacity);
		dieselTaxesComputer.addCapacity(dieselMediumCapacity);
		dieselTaxesComputer.addCapacity(dieselLargeCapacity);
		
		List<EngineCapacitiesRole>petrolCapacities=new ArrayList<EngineCapacitiesRole>();
		PetrolDieselTaxesComputer petrolTaxesComputer=new PetrolDieselTaxesComputer(petrolCapacities);
		petrolTaxesComputer.addCapacity(petrolLargeCapacity);
		petrolTaxesComputer.addCapacity(petrolMediumCapacity);
		petrolTaxesComputer.addCapacity(petrolSmallCapacity);
		
		DieselPetrolEngine dieselEngine1=new DieselPetrolEngine(1598,dieselTaxesComputer);
		DieselPetrolEngine petrolEngine1=new DieselPetrolEngine(2500,petrolTaxesComputer);
		NormalElectricEngineTaxes electricEngineTaxes=new NormalElectricEngineTaxes(0);
		ElectricEngine electricEngine1=new ElectricEngine(electricEngineTaxes);
		
		List<Engines> engines1=new ArrayList<Engines>();
		CarOwner carOwner1= new CarOwner(engines1);
		carOwner1.addEngine(electricEngine1);
		carOwner1.addEngine(petrolEngine1);
		carOwner1.addEngine(dieselEngine1);
		
		LandCarTaxesPayer landCarPayer1=new LandCarTaxesPayer(landOwner1,carOwner1,landTax);
		
		township.addTaxPayer(landCarPayer1);
		
		System.out.println("Total taxes for Payer1 : " + landCarPayer1.computeTaxes());
		
		
		
		
		
		
		

		
		

		

	}

}
