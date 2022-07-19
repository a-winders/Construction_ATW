
public class Business extends Building {

	protected int numRentableUnits;
	//	end instance fields
	
	public Business () {
		super ();
	
	}	// end empty-argument constructor
	
	public Business(int numRentableUnits) {
		super();
		this.numRentableUnits = numRentableUnits;
	}	// end preferred constructor

	public int getNumRentableUnits() {
		return numRentableUnits;
	}	// end getNumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}	// end setNumRentableUnits

	public void draw () {
		
	}	// end draw
	
	public String displayData () {
		return "\n*** BUSINESS *** \nProject Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup + "\nRentable Units: " +numRentableUnits;
	}	// end displayData
	
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + "]";
	}	// end toString
	
	

}	//	end class

