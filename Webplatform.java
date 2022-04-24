
public class Webplatform {
	String name;
	int percentage;
	
	public Webplatform(String name, int percentage) {
		name = this.name;
		percentage = this.percentage;
	}
	
	public int getPercentage() {
		return percentage;
	}
	
	// This must show all available cabins/pitches * percentage for 1 week.
	public void calcWebEarnings() {
		//totalEarning = (Campsite.calculatePrice() * percentage); // *7 days
		// return totalEarning
	}
	
	public String toString() {
		return name + "\n" + percentage;
	}
}
