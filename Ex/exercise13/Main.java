package Ex.exercise13;

import java.util.List;

public class Main {
    public static void main(final String[] args) {
        final CarService carService = new CarService();
        final List<Car> v12 = carService.findV12();
    }
}
