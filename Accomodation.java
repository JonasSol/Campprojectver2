
public class Accomodation {
	protected int noPeople;
	protected int availability;
	protected int noDaysStay;
	protected boolean hasBBQ;
	
	public Accomodation(int noPeople, int availability, int noDaysStay, boolean hasBBQ) {
		this.noPeople = noPeople;
		this.availability = availability;
		this.noDaysStay = noDaysStay;
		this.hasBBQ = hasBBQ;
	}
	
	public void setNoPeople(int newNoPeople) {
		noPeople = newNoPeople;
	}
	
	public void setAvailability(int newAvailability) {
		availability = newAvailability;
	}
	
	public int getNoDaysStay() {
		return noDaysStay;
	}
	
	public boolean getHasBBQ() {
		return hasBBQ;
	}
	
	public String toString() {
		return noPeople + "\n" + availability + "\n" + noDaysStay;
	}
	
	
	
	
	
}
