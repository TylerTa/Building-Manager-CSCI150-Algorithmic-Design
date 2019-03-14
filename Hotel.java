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
public class Hotel extends Building{

	// Declare Instance/Private Variables
	private int numberOfSuites;
	
	// Create Constructors
	public Hotel(String aName, String aCity, int floors, int suites)
	{
		super(aName, aCity, floors);
		
		numberOfSuites = suites;
	}
	
	// Accessor
	public int getNumberOfSuites()
	{
		return numberOfSuites;
	}
	
	// Mutator
	public void setNumberOfSuites(int suites)
	{
		numberOfSuites = suites;
	}
	
	// Other Methods
	public String toString()
	{
		String tempString = "Error: tempString Undeclared in: Hotel.java > toString() method.";
		
		tempString = "Building Name: " + super.getName() + "\nCity: " + super.getCity() + "\nNumber of floors: " + super.getNumberOfFloors() + "\nNumber of Suites: " + numberOfSuites;
		
		return tempString;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
