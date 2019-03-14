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
 */

import java.util.ArrayList;

public class BuildingDatabase {

	// Declare Instance/Private Variables
	private ArrayList<Building> buildings;
	
	// Constructor
	public BuildingDatabase()
	{
		buildings = new ArrayList<Building>();
	}
	
	// Other Methods
	public void addBuilding(Building aBuilding)
	{
		//Building tempBuilding = null;
		
		buildings.add(aBuilding);
		
	}
	
	public Building removeBuilding(Building aBuilding) throws EmptyDatabaseException
	{
		
		Building buildingFound = null;
		Building tempBuilding = null;
		
		String tempBuildingName = "Not Yet Declared in: BuildingDatabase.java > removeBuilding() method";
		String userBuildingName = "Not Yet Declared in: BuildingDatabase.java > removeBuilding() method";
		
		userBuildingName = aBuilding.getName();
		
		if (buildings.size() < 1)
		{
			throw new EmptyDatabaseException("There are no buildings currently in your building list");
		}
		else
		{
			for (int index = 0; index < buildings.size(); index++)
			{
				tempBuilding = buildings.get(index);
				
				tempBuildingName = tempBuilding.getName();
				
				if (tempBuildingName.equals(userBuildingName))
				{
					buildingFound = tempBuilding;
					
					buildings.remove(index);
					
					return buildingFound;
				}
			}
		}
		/**
		// Create a tempBuilding
		Building tempUserBuilding = null;
		Building tempBuilding = null;
		
		String tempBuildingName = "Not Yet Declared in: BuildingDatabase.java > removeBuilding() method";
		String userBuildingName = "Not Yet Declared in: BuildingDatabase.java > removeBuilding() method";
		
		String tempBuildingCity = "Not Yet Declared in: BuildingDatabase.java > removeBuilding() method";
		String userBuildingCity = "Not Yet Declared in: BuildingDatabase.java > removeBuilding() method";
		
		int tempBuildingFloors = 8888;
		int userBuildingFloors = 9999;

		int tempBuildingFootage = 7777;
		int userBuildingFootage = 6666;
		
		int tempNumOfSuites = 8989;
		int userNumOfSuites = 5454;
		
		// Find out what instance is the Building the was pass through the parameter & cast it to that type of instance
		if (aBuilding instanceof Hotel)
		{
			tempUserBuilding = (Hotel)aBuilding;
		}
		else if (aBuilding instanceof Warehouse)
		{
			tempUserBuilding = (Warehouse)aBuilding;
		}
		
		// go through the list to find the building with the exact info to remove
		for (int index = 0; index < buildings.size(); index++)
		{
			tempBuilding = buildings.get(index);
			
			if (tempBuilding instanceof Hotel)
			{
				tempBuilding = (Hotel)tempBuilding;
				tempUserBuilding = (Hotel)aBuilding;
				
				userBuildingName = aBuilding.getName();
				tempBuildingName = tempBuilding.getName();
				
				userBuildingCity = aBuilding.getCity();
				tempBuildingCity = tempBuilding.getCity();
				
				userBuildingFloors = aBuilding.getNumberOfFloors();
				tempBuildingFloors = tempBuilding.getNumberOfFloors();
				
				userNumOfSuites = tempUserBuilding.
			}
			else if (tempBuilding instanceof Warehouse)
			{
				
			}
		}
		**********/
		return buildingFound;
	}
	
	public void showBuildingInfo(String searchName) throws EmptyDatabaseException
	{
		String tempName = "Not Yet Declared in: BuildingDatabase.java > showBuildingInfo() method";
		Building tempBuildings = null;
		
		if (buildings.size() < 1)
		{
			throw new EmptyDatabaseException("There are no buildings currently in your building list");
		}
		else
		{
			for (int index = 0; index < buildings.size(); index++)
			{
				tempBuildings = buildings.get(index);
				
				tempName = tempBuildings.getName();
				
				if (searchName.equals(tempName))
				{
					System.out.println(tempBuildings);
				}
				
				//System.out.println("\n" + tempBuildings);
			}
		}
	}
	
	public void showAll() throws EmptyDatabaseException
	{
		Building tempBuildings;
		
		if (buildings.size() < 1)
		{
			throw new EmptyDatabaseException("There are no buildings currently in your building list");
		}
		else
		{
			for (int index = 0; index < buildings.size(); index++)
			{
				tempBuildings = buildings.get(index);
				
				System.out.println("\n" + tempBuildings);
			}
		}
	}
	
	public void printBuildingWithMostFloors() throws EmptyDatabaseException
	{
		Building tempBuilding = null;
		String mostFloorBuildingName = "Not Yet Declared";
		int mostNumOfFloors	= 0;
		int numOfFloors = 0;
		
		if (buildings.size() < 1)
		{
			throw new EmptyDatabaseException("There are no buildings currently in your building list");
		}
		else
		{
			tempBuilding = buildings.get(0);
			mostNumOfFloors = tempBuilding.getNumberOfFloors();
			
			for (int index = 0; index < buildings.size(); index++)
			{
				tempBuilding = buildings.get(index);
				
				numOfFloors = tempBuilding.getNumberOfFloors();
				
				if (numOfFloors >= mostNumOfFloors)
				{
					mostNumOfFloors = numOfFloors;
					
					mostFloorBuildingName = tempBuilding.getName();
				}
			}
		}
		
		System.out.println(mostFloorBuildingName + " Has the most floors");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
