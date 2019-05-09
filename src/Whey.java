
public class Whey extends Protein{
	
	private int proteinAmount;
	private String description = "This is a kinda fast digesting protein!";
	private String name = "Whey";
	
	
	
	Whey() {
		proteinAmount = 25;
	}
	
	
	
	@Override
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
