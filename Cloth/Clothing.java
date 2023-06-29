package Cloth;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Clothing {
    private final  List<Cloth> clothes;

    public Clothing() {
        this.clothes = new ArrayList<>();
    }

    public void addCloth(Cloth cloth) {
        clothes.add(cloth);
    }

    public double getTotalWeight() {
        return clothes.stream()
        .mapToDouble(Cloth::getWieght)
                .sum();

    }

    public boolean areAllSameColor() {
        return clothes.stream()
                .map(Cloth::getColor)
                .distinct()
                .count() == 1;
    }
}