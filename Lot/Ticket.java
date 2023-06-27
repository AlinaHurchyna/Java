package Lot;

import java.util.ArrayList;
import java.util.List;

public class Ticket {
    private final List<Passenger> passengers = new ArrayList<>();
    private final FlightClass flightClass;
    private final double basePrice;

    public Ticket(FlightClass flightClass, double basePrice) {
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
