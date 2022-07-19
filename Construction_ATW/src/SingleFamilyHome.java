
public class SingleFamilyHome extends Residential {

	private boolean garage;
	// end instance fields
	
	public SingleFamilyHome() {
		super();
	}	// end empty argument constructor

	public SingleFamilyHome(boolean garage) {
		super ();
		this.garage = garage;
	}	// end preferred constructor
	
	
	public boolean isGarage() {
		return garage;
	}	// end boolean isGarage

	public void setGarage(boolean garage) {
		this.garage = garage;
	}	// end setGarage

	public void draw () {
		
	}	// end draw

	public String displayData () {
		return "\n*** SINGLE FAMILY HOME *** \nProject Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup + "\nGarage: " +garage;
	}	// end displayData

	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + "]";
	}	// end toString

	
}	// end class
