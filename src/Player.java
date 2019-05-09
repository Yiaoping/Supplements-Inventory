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
		
		if (list.contains(item)) {
			list.remove(item);
			System.out.println("Item removed: " + item);
		}
		else
			System.out.println("No such item to remove.");
	}
	
	

}
