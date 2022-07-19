
public class Apartment extends Residential {

	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;
	// end instance fields
	
	public Apartment() {
		super();
	}	// end empty argument constructor
	
	public Apartment(int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		super ();
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}	// end preferred constructor

	public int getNumRentableUnits() {
		return numRentableUnits;
	}	// end getNumRentableUnits

	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}	// end setNumRentableUnits

	public double getAvgUnitSize() {
		return avgUnitSize;
	}	// end getAvgUnitSize

	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}	// end setAvgUnitSize

	public boolean isParkingAvailable() {
		return parkingAvailable;
	}	// end boolean isParkingAvailable

	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}	// end setParkingAvailable

	public void draw () {
		
	}	// end draw
	
	public String displayData () {
		return "\n*** APARTMENT *** \nProject Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup + "\nRentable Units: " +numRentableUnits+ "\nAverage Unit Size: " +avgUnitSize+ "\nParking Available: " +parkingAvailable;
	}	// end displayData

	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + "]";
	}	// end toString
	
		
}	// end class
