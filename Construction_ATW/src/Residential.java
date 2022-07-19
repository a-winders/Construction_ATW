
public class Residential extends Building {

	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;
	//	end instance fields
	
	public Residential () {
		super ();
	}	// end empty-argument constructor
	
	public Residential (int numBedRooms, int numBathrooms, boolean laundryRoom) {
		super ();
		this.numBedrooms = numBedRooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}	// end preferred constructor

	public int getNumBedrooms() {
		return numBedrooms;
	}	// end getNumBedrooms

	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}	// end setNumBedrooms

	public int getNumBathrooms() {
		return numBathrooms;
	}	// end getNumBathrooms

	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}	// end setNumBathrooms

	public boolean isLaundryRoom() {
		return laundryRoom;
	}	// end boolean isLaundryRoom

	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}	// end setLaundryRoom

	public void draw () {
		
	}	// end draw
	
	public String displayData () {
		return "\n*** RESIDENTIAL *** \nProject Name: " + projectName + "\nAddress: " + completeAddress + "\nSquare Feet: "
				+ totalSquareFeet + "\nOccupancy Group: " + occupancyGroup + "\nOccupancy Subgroup: " + subgroup + "\nNumber of Bedrooms: " +numBedrooms + "\nNumber of Bathrooms: " +numBathrooms+ "\nLaundry Room: " +laundryRoom;
	}	// end displayData
	
	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + "]";
	}	// end toString
	
	
	
	
}	// end class
