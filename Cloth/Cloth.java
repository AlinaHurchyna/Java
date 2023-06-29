package Cloth;

import Pilkarze.Team;

import java.util.Objects;

public class Cloth {
    private  final ClothType type;
    private final ClothColor color;
    private  final double wieght;

    public Cloth(ClothType type, ClothColor color, double wieght) {
        this.type = type;
        this.color = color;
        this.wieght = wieght;
    }

    public ClothType getType() {
        return type;
    }



    public ClothColor getColor() {
        return color;
    }



    public double getWieght() {
        return wieght;
    }


}

