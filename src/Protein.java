
public abstract class Protein implements Supplements {
	
	private int proteinAmount=30;
	private String type;
	
	public String getProteinAmount() {
		return ("Amount of protein is regular protein is: " + proteinAmount + "g!");
	}
	
	public abstract String toString();	
	public abstract String info();

}
