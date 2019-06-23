package Client;

import java.util.Date;

import Templates.TicketBooking;
import TicketBookinSystem.FlightBooking;
import TicketBookinSystem.TrainTicketBooking;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketBooking trainBooking = new TrainTicketBooking();
		TicketBooking flightBooking = new FlightBooking();
		
		trainBooking.bookTickets("MUM", "BLR", new Date(), 2);
		flightBooking.bookTickets("BLR", "MUM", new Date(), 3);
	}
}
