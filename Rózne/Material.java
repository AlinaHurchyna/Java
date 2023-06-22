package Rózne;

public enum Material {
    IRON(0.3, "iron"),
    SILVER(0.5, "silver"),
    BRONZE(0.7, "bronze");

    private final double value;
    private final String name;

    Material(double value, String name) {
        this.value = value;
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}
