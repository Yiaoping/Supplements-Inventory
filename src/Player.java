import java.util.ArrayList;

public class Player {
	
	private static ArrayList<Supplements> list = new ArrayList<Supplements>();
	
	//adds an item to the inventory
	public void addItemToInv(Supplements item) {
		list.add(item);
		System.out.println("Added item: " + item);
	}
	
	//prints out the items in the inventory
	public void printInv() {
		if (list.size()==0) {
			System.out.println("There's nothing in your inventory! Add something first!");
			return;
		}
		System.out.println("\nItems in your inventory: ");
		for(Supplements x : list) {
			System.out.println(x);
		}
	}
	
	//removes the items in the inventory
	public void removeItem(String item) {
		System.out.println("Removing item..");
		if(item.equals("whey")) {
			for(Supplements x : list) {
				if (x instanceof Whey) {
					list.remove(x);
					System.out.println("Removed item: " + x);
					return;
				}
			}
			System.out.println("There's no Whey item to remove!");
		}
		
		else if(item.equals("casein")) {
			for(Supplements x: list) {
				if(x instanceof Casein) {
					list.remove(x);
					System.out.println("Removed item: " + x);
					return;
				}
			}
			System.out.println("There's no Casein item to remove!");
		}
		
		else if(item.equals("isolate")) {
			for(Supplements x: list) {
				if(x instanceof Isolate) {
					list.remove(x);
					System.out.println("Removed item: " + x);
					return;
				}
			}
			System.out.println("There's no Isolate protein to remove!");
		}
		
		else if (item.equals("creatine")) {
			for(Supplements x: list) {
				if(x instanceof Creatine) {
					list.remove(x);
					System.out.println("Removed item: " + x);
					return;
				}
			}
			System.out.println("There's no creatine to remove!");
			
		}
		
		else if (item.equals("bcaa")) {
			for(Supplements x: list) {
				if(x instanceof BCAA) {
					list.remove(x);
					System.out.println("Removed item: " + x);
					return;
				}
			}
			System.out.println("There's no bcaa to remove!");
			
		}
		
	}
	
	
	

}
