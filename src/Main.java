import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String args[]) {
		//Create a new inventory
		Player player = new Player();
		System.out.println("-------Menu-------");
		System.out.println("Enter in the type of supplement you want to add: \n1) Protein \n2) Creatine \n3) BCAAs \n4) Exit \n5) Remove Item \n6) Display Items");	
		
		/*Processes user input on type of supplement he wants to add to the inventory*/
		while(true) {
			int numberChosen;
			String supplementChoice = Input.sc.nextLine();
			
			try {
				numberChosen = Integer.parseInt(supplementChoice);
			}catch (NumberFormatException e) {
				System.out.println("Enter choices 1-4! Not a string!");
				continue;
			}
			
			numberChosen = Integer.parseInt(supplementChoice);
			
			if(numberChosen== 1) {
				processProteinInput(player);
			}
			else if(numberChosen == 2) {
				processCreatine(player);
				
			}
			else if (numberChosen == 3) {
				processBCAA(player);
			}
			else if (numberChosen == 4) {
				System.out.println("Exiting...");
				break;
			}
			else if(numberChosen == 5) {
				removeItem(player);
			}
			else if(numberChosen == 6) {
				player.printInv();
			}
			System.out.println("\n-------Menu-------");
			System.out.println("Select what you want to add: \n1) Protein \n2) Creatine \n3) BCAAs \n4) Exit \n5) Remove Item \n6) Display Items");
		}
		
		player.printInv();			//print out inventory to user
	}
	
	
	
	/*Adds type of protein to user inventory*/
	public static void processProteinInput(Player player) {
		
		System.out.println("-------Select a protein number-------");
		System.out.println("\n1) Whey \n2) Casein \n3) Isolate \n4) Exit");
		String protein = Input.sc.nextLine();
		int proteinInt = Integer.parseInt(protein);
		
		while(true) {
			if(proteinInt==1) {
				Protein wheyProtein = new Whey();
				player.addItemToInv(wheyProtein);
			}
			else if (proteinInt==2) {
				Protein caseinProtein = new Casein();
				player.addItemToInv(caseinProtein);
			}
			else if (proteinInt==3) {
				Protein isolateProtein = new Isolate();
				player.addItemToInv(isolateProtein);
			}else if(proteinInt==4){
				System.out.println("Exiting proteins");
				break;
				
			}else{
				System.out.println("Incorrect number...Restarting!");
			}
			System.out.println("\n-------Select a protein number-------");
			System.out.println("Enter in a new protein: \n1) Whey \n2) Casein \n3) Isolate \n4) Return to Menu");
			proteinInt = Integer.parseInt(Input.sc.nextLine());
		}
	}
	
	/*Adds creatine to user inventory*/
	public static void processCreatine(Player player) {
		System.out.println("\nAdding in Creatine to your inventory");
		Supplements creatine = new Creatine();
		player.addItemToInv(creatine);
	}
	
	/*Adds BCAA's to user inventory*/
	public static void processBCAA(Player player) {
		System.out.println("\nAdding BCAA's to your inventory");
		Supplements bcaa = new BCAA();
		player.addItemToInv(bcaa);
	}
	
	/*Removal of an item from inventory*/
	public static void removeItem(Player player) {
		int removeChoiceInt;
		System.out.println("\n----Remove Menu----");
		System.out.println("Select an item to remove: \n1) Protein \n2) Creatine \n3) BCAAs \n4) Exit");
		String removeChoice = Input.sc.nextLine();
		try {
			removeChoiceInt = Integer.parseInt(removeChoice);		
		}catch (Exception e) {
			System.out.println("Choose a number! Exiting...");
		}
		
		removeChoiceInt = Integer.parseInt(removeChoice);
		if(removeChoiceInt==1) {
			//Takes in user input
			System.out.println("--Protein Removal--");
			System.out.println("Select the type of protein to remove: \n1) Whey \n2) Casein \n3) Isolate");
			String removeInput = Input.sc.nextLine();
			int removeInputInt = Integer.parseInt(removeInput);
			if(removeInputInt==1) {
				player.removeItem("whey");
			}
			else if (removeInputInt == 2) {
				player.removeItem("casein");
			}
			else if (removeInputInt == 3) {
				player.removeItem("isolate");
			}
			
		}else if (removeChoiceInt == 2) {
			player.removeItem("creatine");
		}
		else if (removeChoiceInt == 3) {
			player.removeItem("bcaa");
		}

	}
}
