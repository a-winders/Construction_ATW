
public class Mall extends Business {

	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;
	// end instance fields
	
	public Mall() {
		super();
	}	// end empty argument constructor

	public Mall(int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		super ();
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	}	// end preferred constructor
	
	public int getNumRentedUnits() {
		return numRentedUnits;
	}	// end getNumRentedUnits

	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}	// end setNumRentedUnits

	public double getMedianUnitSize() {
		return medianUnitSize;
	}	// end getMedianUnitSize

	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}	// end setMedianUnitSize

	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}	// end getNumParkingSpaces

	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}	// end setNumParkingSpaces

	public void draw () {
		
	}	// end draw
	
	
	public String displayData () {
		return "\n*** MALL *** \nProject Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup + "\nRented Units: " + numRentedUnits + "\nMedian Unit Size: " +medianUnitSize+ "\nParking Spaces: " +numParkingSpaces ;
	}	// end displayData

	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + "]";
	}	// end toString
	
	
	
}	// end class
