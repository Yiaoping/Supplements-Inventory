
public class Casein extends Protein{
	
	private int proteinAmount;
	private String name = "Casein";
	private String description = "This is the slowest digesting protein!";

	
	Casein(){
		proteinAmount = 20;
	}
	
	
	public String getProteinAmount() {
		return "Amount of protein in Whey is: " + proteinAmount + "g!";
	}
	
	@Override
	public String info() {
		return description;
	}

	@Override
	public String toString() {
		return name;
	}

}
