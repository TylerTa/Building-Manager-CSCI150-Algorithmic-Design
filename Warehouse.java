/**
 * 
 */

/**
 * @author Tyler Ta
 * @class CSCI150
 * @professor Clint Fuchs
 * @test Lab Test 02
 * @date 11/20/2014
 * @email lhta@g.coastal.edu
 *
 */
public class Warehouse extends Building {

	// Declare Instance/Private Variables
	private int squareFootage;
	
	// Constructor
	public Warehouse(String aName, String aCity, int floors, int footage)
	{
		super(aName, aCity, floors);
		
		squareFootage = footage;
	}
	
	// Accessor
	public int getSquareFootage()
	{
		return squareFootage;
	}
	
	// Mutator
	public void setSquareFootage(int footage)
	{
		squareFootage = footage;
	}
	
	// Other Methods
	public String toString()
	{
		String tempString = "Error: tempString Undeclared in: Hotel.java > toString() method.";
		
		tempString = "Building Name: " + super.getName() + "\nCity: " + super.getCity() + "\nNumber of floors: " + super.getNumberOfFloors() + "\nWarehouse Footage: " + squareFootage;
		
		return tempString;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
