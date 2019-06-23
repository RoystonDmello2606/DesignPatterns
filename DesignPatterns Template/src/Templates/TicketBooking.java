package Templates;

import java.util.ArrayList;
import java.util.Date;

public abstract class TicketBooking {
	
	public abstract ArrayList<String> searchTickets(
			String source, String destination, Date date);
	
	public abstract String pickTicket(ArrayList<String> tickets);
	
	public abstract int purchaseTickets(String ticket, int number);
	
	public final int bookTickets(String source, String destination, Date date, int number) {
		ArrayList<String> tickets = searchTickets(source, destination, date);
		
		String ticket = pickTicket(tickets);
		
		int price = purchaseTickets(ticket, number);
		
		return price;
	}
}
