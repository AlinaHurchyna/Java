package Ex.exercise13;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private final List<Car> carList = new ArrayList<>();

    public void addCar(final Car car) {
        carList.add(car);
    }

    public void removeCar(final Car car) {
        carList.remove(car);
    }


    public List<Car> showList() {
        return carList;
    }

    public List<Car> findV12() {
        return carList.stream()
                .filter(car -> car.engine().equals(Engine.V12))
                .toList();
    }
}

