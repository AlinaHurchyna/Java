package OOPPoint2D;
import java.util.Objects;
public class Circle extends Shape{
    private double radius;

    public Circle(String colour, boolean filled, double radius) {
        super(colour, filled);
        this.radius = radius;
    }

    public Circle() {
        this("unknown", false, 1);
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public String print(){
        return "Circle with radius " + radius + " which is a subclass of " + super.print();
    }


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRadius());
    }
}