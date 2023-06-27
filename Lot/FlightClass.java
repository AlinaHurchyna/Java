package Lot;

public enum FlightClass {
    BUSINESS(2.0),
    ECONOMY(1.0),
    VIP(2.75);

    private double priceMultiplier;

    FlightClass(double priceMultiplier) {
        this.priceMultiplier = priceMultiplier;
    }

    public double getPriceMultiplier() {
        return priceMultiplier;
    }
}
