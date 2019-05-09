
public class BCAA implements Supplements {
	private String name = "BCAA";
	private String description = "BCAA's are perfect for when you're trying to cut!";
	private int amount = 12;
	
	@Override
	public String info() {
		return description;
	}
	
	public String getBCAAAmount() {
		return "The amount of BCAA's is: " + amount + "g!";
	}

	public String toString() {
		return name;
	}
	
}
