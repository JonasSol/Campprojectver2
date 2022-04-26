
public class Campsite {
	protected int area;
	protected String name;
	protected double price;
	// newReservation is in Client.
	
	
	public Campsite(int area, String name, double price) {
		area = this.area;
		name = this.name;
		price = this.price;
		
	}
	
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public int getArea() {
		return area;
	}
	

	public String toString() {
		return area + "\n" + name + "\n" + price;
	}
	
	
	
	public String setNewReservation() {
		String newReservation = null;
		return newReservation;
	}
	
	// methods:
	
	public int posReservation() {
		for (int i = 0; i<reservation.length; i++) {
			if (i = Client.ID) { // why not working?
				return i;
			}else {
				break;
			}
		} return posReservation();
	}
	
	
	public static double calculatePrice() {
		double accPrice = 0;
		boolean reservationFound = false;
		// should there not be something here?
		// yes - find pos (ID) in reserv-array, multiply by noDaysStay and price.
		for (int i = 0; i<reservation.length; i++) {
			if (reservation[i] = Client.ID) { // how to connect to Client Class?
				reservationFound = true;
				accPrice = (Accomodation.noDaysStay*price);
				break;
			}		
		}
			return accPrice;

			
	}
	
	
	public int showPercentage() {
		int percentage = 0;
		if(VIPCustomer.VIPCardNo = null) {
			percentage = 5;
		}else {
			percentage = 10;
		}
		return showPercentage();
		
	}
	
	// method show reservations of client.
	public String toStringClient() {
		for(int i=0; i<reservation.lenght; i++) {
			if (i = Client.ID){
				return Client.ID;
			}else break;
		}return Client.ID + "\n" + name + "\n" + area;
		
	}
			
		
	public int freeCabins() {
		return freeCabins();
	}
	
	
}

