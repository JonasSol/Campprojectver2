
public class Cabin extends Accomodation {
	int noBedrooms;
	boolean wifi;
	
	public Cabin(int noPeople, int availability, int noDaysStay, boolean hasBBQ, int noBedrooms, boolean wifi) {
		super(noPeople, availability, noDaysStay, hasBBQ);
	
		this.noBedrooms = noBedrooms;
		this.wifi = wifi;
	}
	
	public void setNoBedrooms(int newNoBedrooms) {
		noBedrooms = newNoBedrooms;
	}
	
	public boolean getWifi() {
		return wifi;
	}
	
	
	
	
}
