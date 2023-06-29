package Cloth;

import java.util.ArrayList;
import java.util.List;

public class Clothing {
    private List<Cloth> clothes;

    public Clothing() {
        this.clothes = new ArrayList<>();
    }

    public void addCloth(Cloth cloth) {
        clothes.add(cloth);
    }

    public double getTotalWeight() {
        double totalWeight = 0.0;
        for (Cloth cloth : clothes) {
            totalWeight = totalWeight + cloth.getWieght();
        }
        return totalWeight;
    }

    public boolean areAllSameColor() {
        if (clothes.isEmpty()) {
            return true;
        }

        ClothColor firstColor = clothes.get(0).getColor();
        for (Cloth cloth : clothes) {
            if (!cloth.getColor().equals(firstColor)) {
                return false;
            }
        }
        return true;
    }
}