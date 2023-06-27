package Lot;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private List<Passenger> passengers;
    private FlightClass flightClass;
    private double basePrice;

    public Ticket(FlightClass flightClass, double basePrice) {
        this.passengers = new ArrayList<>();
        this.flightClass = flightClass;
        this.basePrice = basePrice;
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getRealPrice() {
        return basePrice * flightClass.getPriceMultiplier();
    }
}
