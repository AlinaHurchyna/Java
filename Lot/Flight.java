package Lot;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    private final List<Ticket> tickets = new ArrayList<>();
    private final int maxCapacity;

    public Flight(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void addTicket(Ticket ticket) {
        if (tickets.size() < maxCapacity) {
            tickets.add(ticket);
        } else {
            System.out.println("Nie można dodać nowego biletu. Brak miejsc.");
        }
    }

    // Gettery

    public List<Ticket> getTickets() {
        return tickets;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }
}
