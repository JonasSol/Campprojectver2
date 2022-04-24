
public class Pitch extends Accomodation{
	int suitableForCamper;
	//boolean hasBBQ; // Denne er også i Accomodation (burde heller være her.
	
	
	public Pitch(int suitableForCamper, boolean HasBBQ, int noPeople, int availability, int noDaysStay) {
		super(noPeople, availability, noDaysStay, HasBBQ);
		
		this.suitableForCamper = suitableForCamper;
	}
	
	public String toString() {
		return super.toString() + "suitableForCamper: " + suitableForCamper;
	}
	
	public void setSuitableForCamper(int suitableForCamper) {
		this.suitableForCamper = suitableForCamper;
	}
	
	//Set hasBBQ?
}
