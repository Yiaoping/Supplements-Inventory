import java.util.Scanner;

public class Main {
	
	
	
	public static void main(String args[]) {
		//Create a new inventory
		Player player = new Player();
		System.out.println("Enter in the type of supplement you want to add: \n1) Protein \n2) Creatine \n3) BCAAs \n4) Exit");	
		
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
			
			System.out.println("\nSelect what you want to add: \n1) Protein \n2) Creatine \n3) BCAAs \n4 Exit");
		}
		
		player.printInv();			//print out inventory to user
	}
	
	
	
	/*Adds type of protein to user inventory*/
	public static void processProteinInput(Player player) {
		
		System.out.println("Type in a protein: (whey, casein, isolate, or exit)");
		String protein = Input.sc.nextLine();
		while(true) {
			if(protein.equals("whey")) {
				Protein wheyProtein = new Whey();
				player.addItemToInv(wheyProtein);
			}
			else if (protein.equals("casein")) {
				Protein caseinProtein = new Casein();
				player.addItemToInv(caseinProtein);
			}
			else if (protein.equals("isolate")) {
				Protein isolateProtein = new Isolate();
				player.addItemToInv(isolateProtein);
			}else if(protein.equals("exit")){
				System.out.println("Exiting proteins");
				break;
				
			}else{
				System.out.println("Need a proper protein: ");
				protein = Input.sc.nextLine();
				continue;
			}
			System.out.println("Enter in a new protein:  (whey, casein, isolate, or exit)");
			protein = Input.sc.nextLine();
		}
	}
	
	/*Adds creatine to user inventory*/
	public static void processCreatine(Player player) {
		System.out.println("Adding in Creatine to your inventory");
		Supplements creatine = new Creatine();
		player.addItemToInv(creatine);
	}
	
	/*Adds BCAA's to user inventory*/
	public static void processBCAA(Player player) {
		System.out.println("Adding BCAA's to your inventory");
		Supplements bcaa = new BCAA();
		player.addItemToInv(bcaa);
	}
	

}
