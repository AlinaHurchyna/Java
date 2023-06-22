package OOPPoint2D;
public class Square extends Rectangle{
    public Square(String colour, boolean filled, double length) {
        super(colour, filled, length, length);
    }

    @Override
    public String toString() {
        return "Square{} " + super.toString();
    }
}