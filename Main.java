import java.io.IOException;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws IOException {

		showMenu();
		manage();
		
	}
	
	
	public static void showMenu() {
		System.out.println("Press 1 to see accommodation items available");
		System.out.println("Press 2 to see the cleaning costs.");
		System.out.println("Press 3 to reserve an accommodation");
		System.out.println("Press 4 to see costs of reservations");
		System.out.println("Press 5 to see information regarding your accommodation");
		System.out.println("Press 6 to see what web operator will earn");
		System.out.println("Press 7 to see accommodations reserved by VIP Customers");
	}
	
	public static void manage() throws IOException {
		int choiceentry  = -1;
		while(choiceentry < 1 || choiceentry > 7) {
			try (Scanner scanchoice = new Scanner(System.in)) {
				scanchoice.nextInt();
			}
		}
	
		if (choiceentry == 1) {
			Accomodation.toString();
		}
		
		else if (choiceentry == 2) {
			// method needs array of clients.
		}
		
		else if (choiceentry == 3) {

			System.out.println("Choose pitch or cabin: (p or c)"); // this is wrong.
			Scanner res = new Scanner(System.in);
			if (res == "p") {
			
				Reservation[] reservation = new Reservation[];
				reservation[0] = new Reservation("p");
			} if(res =="c") {
				Reservation[] reservation = new Reservation[];
				reservation[0] = new Reservation("c");
			}else break;
		
	}
	
	
	
	
	
	
}
