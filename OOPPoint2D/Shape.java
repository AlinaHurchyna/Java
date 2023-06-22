package OOPPoint2D;
import java.util.Objects;

public class Shape {
    private String colour;
    private boolean filled;

    public Shape() {
        this("unknown", false);
    }

    public Shape(String colour, boolean filled) {
        this.colour = colour;
        this.filled = filled;
    }


    public String print(){
        return "Shape with color of " + colour + " and " + (filled? "filled" : "not filled");
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "colour='" + colour + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return isFilled() == shape.isFilled() && Objects.equals(getColour(), shape.getColour());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColour(), isFilled());
    }
}