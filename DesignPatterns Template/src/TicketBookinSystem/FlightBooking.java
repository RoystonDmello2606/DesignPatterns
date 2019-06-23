package TicketBookinSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import Templates.TicketBooking;

public class FlightBooking extends TicketBooking {

	@Override
	public ArrayList<String> searchTickets(String source, String destination, Date date) {
		// TODO Auto-generated method stub
		ArrayList<String> tickets = new ArrayList<String>();
		tickets.add("Flight ticket 1");
		tickets.add("Flight ticket 2");
		tickets.add("Flight ticket 3");
		tickets.add("Flight ticket 4");
		tickets.add("Flight ticket 5");
		
		return tickets;
	}

	@Override
	public String pickTicket(ArrayList<String> tickets) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int index = random.nextInt(4);
		
		return tickets.get(index);
	}

	@Override
	public int purchaseTickets(String ticket, int number) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int rate = random.nextInt(200);
		
		System.out.println(String.format("Purchased %d flight tickets of type %s", number, ticket));
		
		return rate*number;
	}

}
