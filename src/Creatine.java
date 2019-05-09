
public class Creatine implements Supplements {
	
	private int amount;
	private String name = "Creatine";
	private String description = "Creatine will help make you stronger!";
	Creatine(){
		amount = 5;
	}
	
	public String info() {
		return description;
	}
	
	public String getCreatineAmount() {
		return "The amount of creatine is: " + amount + "g!";
	}
	
	public String toString() {
		return name;
	}

}
