
public class Pitch extends Accomodation{
	int suitableForCamper;
	boolean hasBBQ; 
	
	
	public Pitch(int suitableForCamper, boolean HasBBQ, int noPeople, int availability, int noDaysStay, boolean hasBBQ) {
		super(noPeople, availability, noDaysStay, HasBBQ);
		
		this.suitableForCamper = suitableForCamper;
		this.hasBBQ = hasBBQ;
	}
	
	public String toString() {
		return super.toString() + "suitableForCamper: " + suitableForCamper;
	}
	
	public void setSuitableForCamper(int suitableForCamper) {
		this.suitableForCamper = suitableForCamper;
	}
	
	public void sethasBBQ(boolean hasBBQ) {
		this.hasBBQ = hasBBQ;
	}
}
