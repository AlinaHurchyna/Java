package Cloth;

import Pilkarze.Team;

import java.util.Objects;

public class Cloth {
    private ClothType type;
    private ClothColor color;
    private double wieght;

    public Cloth(ClothType type, ClothColor color, double wieght) {
        this.type = type;
        this.color = color;
        this.wieght = wieght;
    }

    public ClothType getType() {
        return type;
    }

    public void setType(ClothType type) {
        this.type = type;
    }

    public ClothColor getColor() {
        return color;
    }

    public void setColor(ClothColor color) {
        this.color = color;
    }

    public double getWieght() {
        return wieght;
    }

    public void setWieght(double wieght) {
        this.wieght = wieght;
    }
}

