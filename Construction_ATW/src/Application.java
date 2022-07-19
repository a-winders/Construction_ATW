
public class Application {

	public static void main(String[] args) {
		
		// ********************
		// ** Building Tests **
		// ********************
		
		Building obj = new Building ();	// empty argument constructor 
		System.out.println(obj);											
		
		Building obj2 = new Building ("Test Name", "1234 Test Avenue", 1234, null, null);	// preferred constructor 
		System.out.println(obj2);
		
		Building buildingGetPN = new Building();	// getProjectName
		System.out.println(buildingGetPN.getProjectName()); 
	
		Building buildingSetPN = new Building ();	// setProjectName
		buildingSetPN.setProjectName(null);
		
		Building buildingGetCA = new Building ();	// getCompleteAddress
		System.out.println(buildingGetCA.getCompleteAddress());
		
		Building buildingSetCA = new Building ();	// setCompleteAddress 
		buildingSetCA.setCompleteAddress(null);
		
		Building buildingGetTSF = new Building ();	// getTotalSquareFeet
		System.out.println(buildingGetTSF.getTotalSquareFeet());
		
		Building buildingSetTSF = new Building ();	// setTotalSquareFeet 
		buildingSetTSF.setTotalSquareFeet(0);
		
		Building buildingGetOG = new Building ();	// getOccupancyGroup
		System.out.println(buildingGetOG.getOccupancyGroup());
		
		Building buildingSetOG = new Building ();	// setOccupancyGroup
		buildingSetOG.setOccupancyGroup(null);
		
		Building buildingGetSG = new Building ();	// getSubGroup
		System.out.println(buildingGetSG.getSubgroup());
		
		Building buildingSetSG = new Building ();	// setSubGroup
		buildingSetSG.setSubgroup(null);
		
		Building buildingDraw = new Building ();	// draw
		System.out.println("Drawing code for BUILDING class");
		
		Building buildingDD = new Building ();	// displayData
		System.out.println(buildingDD.displayData());
		
		Building buildingString = new Building (); 	// toString
		System.out.println(buildingString.toString());
		
		// ********************
		// ** Business Tests **
		// ********************
		System.out.println("\n");	// returns new line
		Business obj3 = new Business ();	// empty argument constructor 
		System.out.println(obj3);
													
		Business obj4 = new Business (4);	// preferred constructor 
		System.out.println(obj4);
		
		Business businessGetNRU = new Business ();	// getNumRentableUnits
		System.out.println(businessGetNRU.getNumRentableUnits());
		
		Business businessSetNRU = new Business ();	// setNumRentableUnits
		businessSetNRU.setNumRentableUnits(0);
		
		Business businessDraw = new Business ();	// draw
		System.out.println("Drawing code for BUSINESS class");
		
		Business businessDD = new Business ();	// displayData
		System.out.println(businessDD.displayData());
		
		Business businessString = new Business ();	// toString
		System.out.println(businessString.toString());
		
		// ****************
		// ** Mall Tests **
		// ****************
		System.out.println("\n");	// returns new line
		
		Mall obj5 = new Mall ();	// empty argument constructor
		System.out.println(obj5);
												
		Mall obj6 = new Mall(10,9,8);	// preferred constructor
		System.out.println(obj6);
		
		Mall mallGetNRU = new Mall ();	// getNumRentedUnits
		System.out.println(mallGetNRU.getNumRentedUnits());
		
		Mall mallSetNRU = new Mall ();	// setNumRentedUnits
		mallSetNRU.setNumRentedUnits(0);
		
		Mall mallGetMUS = new Mall ();	// getMedianUnitSize
		System.out.println(mallGetMUS.getMedianUnitSize());
		
		Mall mallSetMUS = new Mall ();	// setMedianUnitSize
		mallSetMUS.setMedianUnitSize(0);
		
		Mall mallGetNPS = new Mall ();	// getNumParkingSpaces
		System.out.println(mallGetNPS.getNumParkingSpaces());
		
		Mall mallSetNPS = new Mall ();	// setNumParkingSpaces
		mallSetNPS.setNumParkingSpaces(0);
		
		Mall mallDraw = new Mall ();	// draw
		System.out.println("Drawing code for MALL class");
		
		Mall mallDD = new Mall ();	// displayData 
		System.out.println(mallDD.displayData());
		
		Mall mallString = new Mall ();	// toString
		System.out.println(mallString.toString());
		

		// ***********************
		// ** Residential Tests **
		// ***********************
		System.out.println("\n");	// returns new line
		
		Residential obj7 = new Residential ();	// empty argument constructor
		System.out.println(obj7);
		
		Residential obj8 = new Residential (2,3,true);	// preferred constructor
		System.out.println(obj8);
		
		Residential residentialGetNBed = new Residential ();	// getNumBedrooms
		System.out.println(residentialGetNBed.getNumBedrooms());
		
		Residential residentialSetNBed = new Residential ();	// setNumBedrooms
		residentialSetNBed.setNumBedrooms(0);
		
		Residential residentialGetNBath = new Residential ();	// getNumBathrooms
		System.out.println(residentialGetNBath.getNumBathrooms());
		
		Residential residentialSetNBath = new Residential ();	// setNumBathrooms
		residentialSetNBath.setNumBathrooms(0);
		
		Residential residentialLR = new Residential ();	// isLaundryRoom
		System.out.println(residentialLR.isLaundryRoom());
		
		Residential residentialSetLR = new Residential ();	// setLaundryRoom
		residentialSetLR.setLaundryRoom(false);
		
		Residential resDraw = new Residential ();	// draw
		System.out.println("Drawing code for RESIDENTIAL class");
		
		Residential resDD = new Residential ();	// displayData 
		System.out.println(resDD.displayData());
		
		Residential residentialString = new Residential ();	//toString
		System.out.println(residentialString.toString());
		
		
		// *********************
		// ** Apartment Tests **
		// *********************
		System.out.println("\n");	// returns new line
		
		Apartment obj9 = new Apartment ();	// empty argument constructor
		System.out.println(obj9);	
					
		Apartment obj10 = new Apartment (1,3,true);	// preferred constructor
		System.out.println(obj10);
		
		Apartment aptGetNRU = new Apartment ();	// getNumRentableUnits
		System.out.println(aptGetNRU.getNumRentableUnits());
		
		Apartment aptSetNRU = new Apartment ();	// setNumRentableUnits
		aptGetNRU.setNumRentableUnits(0);
		
		Apartment aptGetAUS = new Apartment ();	// getAverageUnitSize
		System.out.println(aptGetAUS.getAvgUnitSize());
		
		Apartment setAUS = new Apartment ();	// setAverageUnitSize
		setAUS.setAvgUnitSize(0);
		
		Apartment aptIsParking = new Apartment ();	// isParkingAvailable
		System.out.println(aptIsParking.isParkingAvailable());
		
		Apartment aptSetParking = new Apartment ();	// setParkingAvailable
		aptSetParking.setParkingAvailable(false);
		
		Apartment aptDraw = new Apartment ();	// draw
		System.out.println("Drawing code for APARTMENT class");
		
		Apartment aptDD = new Apartment ();	// displayData
		System.out.println(aptDD.displayData());

		Apartment aptString = new Apartment ();	// toString
		System.out.println(aptString.toString());
		
		// ****************************
		// ** SingleFamilyHome Tests **
		// ****************************
		System.out.println("\n");	// returns new line
		
		SingleFamilyHome obj11 = new SingleFamilyHome ();	// empty argument constructor
		System.out.println(obj10);
		
		SingleFamilyHome obj12 = new SingleFamilyHome (true);	// preferred constructor
		System.out.println(obj12);
		
		
		SingleFamilyHome sfhGarage = new SingleFamilyHome ();	// isGarage
		System.out.println(sfhGarage.isGarage());
		
		SingleFamilyHome sfhSetGarage = new SingleFamilyHome ();	// setGarage
		sfhSetGarage.setGarage(false);
		
		SingleFamilyHome sfhDraw = new SingleFamilyHome ();	// draw 
		System.out.println("Drawing code for SINGLE FAMILY HOME class");
		
		SingleFamilyHome sfhDD = new SingleFamilyHome ();	// displayData
		System.out.println(sfhDD.displayData());
		
		SingleFamilyHome sfhString = new SingleFamilyHome ();	// toString
		System.out.println(sfhString.toString());

		
		
	}	// end main

}	// end class
