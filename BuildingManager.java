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

import java.util.Scanner;

//public final String QUIT = "quit";

public class BuildingManager {
	
	public static final String QUIT = "Quit";
	public static final String ADD = "Add";
	public static final String REMOVE = "Remove";
	public static final String SHOW_ALL = "Show all";
	public static final String FIND = "Find";
	public static final String MOST = "Most";
	public static final String HOTEL = "Hotel";
	public static final String WAREHOUSE = "Warehouse";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declare Scanner
		Scanner keyboard = new Scanner(System.in);
		
		// Declare & Initiate Variables
		String userName = "Error: Undeclared in: BuildingManager > Main";
		String userSelection = "Error: Undeclared in: BuildingManager > Main";
		String typeOfBuilding = "Error: Undeclared in: BuildingManager > Main";
		String buildingName = "Error: Undeclared buildingName in: BuildingManager > Main";
		String buildingCity = "Error: Undeclared buildingCity in: BuildingManager > Main";
		int buildingFloors = 0;
		int hotelSuites = 0;
		
		BuildingDatabase buildingList = new BuildingDatabase();
		Building building = null;
		
		// Display a Welcome Banner & Prompt user for his/her name using printWelcomeBanner() method
		userName = printWelcomeBanner(keyboard);
		
		// Display the Menu & Prompt user for his/her selection from the Menu
		userSelection = printMenu(userName, keyboard);
		
		// While the userSelection is NOT "QUIT" keep displaying the Menu, prompting the user for his/her selection
		while (!userSelection.equalsIgnoreCase(QUIT))
		{
			if (userSelection.equalsIgnoreCase(ADD))
			{
				building = makeBuilding(keyboard);
				
				buildingList.addBuilding(building);
				
				System.out.println("Added " + building.getName() + "...");
			}
			else if (userSelection.equalsIgnoreCase(REMOVE))
			{
				Building tempRemoveBuilding = null;
				
				System.out.print("You have selected remove, please enter in the info of the building you wish you remove.");
				//buildingName = keyboard.nextLine();
				
				tempRemoveBuilding = makeBuilding(keyboard);
				
				try
				{
					Building buildingFound = buildingList.removeBuilding(tempRemoveBuilding);
					
					if (buildingFound == null)
					{
						System.out.println("Could not find building to remove.");
					}
					else
					{
						System.out.println(buildingFound + "\nWas Removed!!!");
					}
				}
				catch (EmptyDatabaseException emptyException)
				{
					System.out.println(emptyException.getMessage());
				}
				
			}
			else if (userSelection.equalsIgnoreCase(SHOW_ALL))
			{
				try
				{
					buildingList.showAll();
				}
				catch (EmptyDatabaseException emptyException)
				{
					System.out.println(emptyException.getMessage());
				}
			}
			else if (userSelection.equalsIgnoreCase(FIND))
			{
				System.out.print("Enter the building name you wish you find: ");
				buildingName = keyboard.nextLine();
				
				try
				{
					buildingList.showBuildingInfo(buildingName);
				}
				catch (EmptyDatabaseException emptyException)
				{
					System.out.println(emptyException.getMessage());
				}
			}
			else if (userSelection.equalsIgnoreCase(MOST))
			{
				try
				{
					buildingList.printBuildingWithMostFloors();
				}
				catch (EmptyDatabaseException emptyException)
				{
					System.out.println(emptyException.getMessage());
				}
			}
			
			userSelection = printMenu(userName, keyboard);
		}

	}
	
	public static String printWelcomeBanner(Scanner aKeyboard)
	{
		// Declare & Initiate Variables
		String name = "Error: Undeclared name in: BuildingManager > printWelcomeBanner() method";
		
		System.out.println("Welcome to the Building Manager.");
		System.out.print("\nPlease enter your name: ");
		
		name = aKeyboard.nextLine();
		
		return name;
	}
	
	public static String printMenu(String aName, Scanner aKeyboard)
	{
		// Declare * Initiate Variables
		String selection = "Error: userSelection is undeclared in: BuildingManager > printMenu() method";
		
		System.out.println("\n******************************************************************************");
		System.out.println("Enter \"Add\" to add a Building");
		System.out.println("Enter \"Remove\" to remove a Building");
		System.out.println("Enter \"Show All\" to show all Building");
		System.out.println("Enter \"Find\" to search for a Building");
		System.out.println("Enter \"Most\" to display the name of the Building with the most floors");
		System.out.println("Enter \"Quit\" to exit the program");
		System.out.println("******************************************************************************");
		
		System.out.print(aName + ", please enter your selection here: ");
		selection = aKeyboard.nextLine();
		
		
		return selection;
	}
	
	public static Building makeBuilding(Scanner aKeyboard)
	{
		Building tempBuilding = null;
		
		String typeOfBuilding = "Error: typeOfBuilding Undeclared in > BuildingManager > makeBuilding() method";
		String buildingName = "Error: buildingName Undeclared in > BuildingManager > makeBuilding() method";
		String buildingCity = "Error: buildingCity Undeclared in > BuildingManager > makeBuilding() method";
		int buildingFloors = 0;
		int hotelSuites = 0;
		int warehouseFootage = 0;
		
		System.out.println("\nPlease enter in the Type of Building (Hotel/WareHouse)? ");
		typeOfBuilding = aKeyboard.nextLine();
		
		//while (tempBuilding == null)
		//{
			if (typeOfBuilding.equalsIgnoreCase(HOTEL))
			{
				System.out.print("Enter the Hotel's name: ");
				buildingName = aKeyboard.nextLine();
				System.out.print("Enter Hotel's city; ");
				buildingCity = aKeyboard.nextLine();
				System.out.print("Enter the " + buildingName + " number of floors: ");
				buildingFloors = aKeyboard.nextInt();
				
				// Clear the keyboard int input
				aKeyboard.nextLine();
				
				System.out.print("Enter the " + buildingName + " number of suites: ");
				hotelSuites = aKeyboard.nextInt();
				
				// Clear the keyboard int input
				aKeyboard.nextLine();
				
				Hotel hotelBuilding = new Hotel(buildingName, buildingCity, buildingFloors, hotelSuites);
				
				tempBuilding = hotelBuilding;
				
			}
			else if (typeOfBuilding.equalsIgnoreCase(WAREHOUSE))
			{
				System.out.print("Enter the Warehouse's name: ");
				buildingName = aKeyboard.nextLine();
				System.out.print("Enter Warehouse's city; ");
				buildingCity = aKeyboard.nextLine();
				System.out.print("Enter the " + buildingName + " nmber of floors: ");
				buildingFloors = aKeyboard.nextInt();
				
				// Clear the keyboard int input
				aKeyboard.nextLine();
				
				System.out.print("Enter the " + buildingName + " square footage: ");
				warehouseFootage = aKeyboard.nextInt();
				
				// Clear the keyboard int input
				aKeyboard.nextLine();
				
				Warehouse warehouseBuilding = new Warehouse(buildingName, buildingCity, buildingFloors, warehouseFootage);
				
				tempBuilding = warehouseBuilding;
			}
			else
			{
				System.out.println("Error: Invalid Type Of Building");
				
				/**
				System.out.println("\nPlease enter in the Type of Building (Hotel/WareHouse)? ");
				typeOfBuilding = aKeyboard.nextLine();
				**/
			}
		//}
			/**
			if (tempBuilding == null)
			{
				System.out.println("\nPlease enter in the Type of Building (Hotel/WareHouse)? ");
				typeOfBuilding = aKeyboard.nextLine();
			}
			**/
		
		return tempBuilding;
		
	}
	
	
	

}
