
public class Reservation {
	protected int IDReservation;
	protected int date;
	// no days stay? - must be extended from Accomodation class?
	
	public Reservation(int IDReservation, int date) {
		IDReservation = this.IDReservation;
		date = this.date;
		// make super()
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
	
	
}
