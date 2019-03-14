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

public abstract class Building {

	// Create Instance/Private Variables
	private String name;
	private String city;
	private int numberOfFloors;
	
	// Create Constructors - forcing the user to have to use this constructor with parameters to pass through
	public Building(String aName, String aCity, int floors)
	{
		name = aName;
		city = aCity;
		numberOfFloors = floors;
	}
	
	// Accessors
	public String getName()
	{
		return name;
	}
	
	public String getCity()
	{
		return city;
	}
	
	public int getNumberOfFloors()
	{
		return numberOfFloors;
	}
	
	// Mutators
	public void setName(String aName)
	{
		name = aName;
	}
	
	public void setCity(String aCity)
	{
		city = aCity;
	}
	
	public void setNumberOfFloors(int floors)
	{
		numberOfFloors = floors;
	}
	
	// Other Methods
	public String toString()
	{
		String tempString = "Error: tempString is undeclared in: Building.java > toString() method";
		
		tempString = "Building Name: " + name + "\nCity: " + city + "\nFloors: " + numberOfFloors;
		
		return tempString;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
