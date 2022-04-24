
public class Client {
	
	protected int ID;
	protected String name;
	protected int creditCardNo;
	protected Reservation[] reservation = new Reservation[5];
	
	boolean doesClientExist;
	
	public Client(int ID, String name, int creditCardNo) {
		ID = this.ID;
		name = this.name;
		creditCardNo = this.creditCardNo;
		
	}
	
	
	public void setID(int newID) {
		ID = newID;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public int getCreditCardNo() {
		return creditCardNo;
	}
	
	// method:
	
	public boolean doesClientExist() {
		for (int i=0;i<reservation.length;i++)
			if (i==ID) {
				doesClientExist = true;
			} else continue;
		return doesClientExist;
	}
	
	
	// toString
	public String toString() {
		return name + "\n" + ID + "\n" + creditCardNo;
	}
	
	
	// only showing info regarding reservations:
	public Reservation[] tostring() {
		for (int i=0; i<reservation.length; i++)
		return reservation;
		
	}
	
	// set reservation:
	
	public void setReservation(Reservation[] reservation) {
		this.reservation = reservation;
	}
	
	public Reservation[] getReservation() {
		return reservation;
	}
	
	
}


