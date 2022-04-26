
public class Reservation extends Accomodation {
	protected int IDReservation;
	protected int date;
	// no days stay? - must be extended from Accomodation class?
	
	public Reservation(int noPeople, int availability, int noDaysStay, boolean hasBBQ, int IDReservation, int date) {
		super(noPeople, availability, noDaysStay, hasBBQ);
		IDReservation = this.IDReservation;
		date = this.date;
		
	}
	
	public void setIDReservation(int newIDReservation) {
		IDReservation = newIDReservation;
	}
	public void setDate(int newDate) {
		date = newDate;
	}
	
	public String toString() {
		return "date: " + date + "\n" + "IDReservation: " + IDReservation;
	}
	

	
	
	public boolean CabinHasBBQ() {
		return hasBBQ;
	}
	
	
	
	
}
