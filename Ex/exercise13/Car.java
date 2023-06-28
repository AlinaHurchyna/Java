package Ex.exercise13;

import java.util.List;

public record Car(String make, String model, double price, int yearOfProduction, List<Manufacturer> manufacturers,
                  Engine engine) {
}
