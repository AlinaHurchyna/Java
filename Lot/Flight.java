package Lot;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private List<Ticket> tickets;
    private int maxCapacity;

    public Flight(int maxCapacity) {
        this.tickets = new ArrayList<>();
        this.maxCapacity = maxCapacity;
    }

    public void addTicket(Ticket ticket) {
        if (tickets.size() < maxCapacity) {
            tickets.add(ticket);
        } else {
            System.out.println("Nie można dodać nowego biletu. Brak miejsc.");
        }
    }


    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
