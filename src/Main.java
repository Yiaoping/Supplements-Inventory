import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {

		Player player = new Player();
		
		System.out.println("Enter in the type of supplement you want to add: \n1) Protein \n2) Creatine \n3) BCAAs \n4) Exit");
		Scanner s = new Scanner(System.in);
		
		
		
		while(true) {
			String supplementChoice = s.nextLine();
			try {
				int numberChosen = Integer.parseInt(supplementChoice);
			}catch (NumberFormatException e) {
				System.out.println("Enter choices 1-4! Not a string!");
				continue;
			}
			int numberChosen = Integer.parseInt(supplementChoice);
			
			if(numberChosen== 1) {
				System.out.println("Type in a protein: (whey, casein, or isolate)");
				String protein = s.nextLine();
				while(true) {
					System.out.println("Enter in a protein")
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
						protein = s.nextLine();
						continue;
					}
					protein = s.nextLine();
				}
			}
			else if(numberChosen == 2) {
				System.out.println("Adding in Creatine to your inventory");
				Supplements creatine = new Creatine();
				player.addItemToInv(creatine);
				
				
			}
			else if (numberChosen == 3) {
				System.out.println("Adding BCAA's to your inventory");
				Supplements bcaa = new BCAA();
				player.addItemToInv(bcaa);
			}
			else if (numberChosen == 4) {
				System.out.println("Exiting...");
				break;
			}
			
			System.out.println("\nSelect what you want to add: \n1) Protein \n2) Creatine \n3) BCAAs \n4 Exit");
		}
		
		player.printInv();

	}

}
