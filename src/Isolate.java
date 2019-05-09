
public class Isolate extends Protein{
	
	private int proteinAmount;
	private String name = "Isolate";
	private String description = "This is the fastest digesting protein!";

	
	Isolate(){
		proteinAmount = 30;
	}
	
	public String getProteinAmount() {
		return "Amount of protein in Whey is: " + proteinAmount + "g!";
	}
	
	@Override
	public String toString() {
		return name;
	}

	@Override
	public String info() {
		return description;
	}

}
