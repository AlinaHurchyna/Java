package OOPPoint2D;
public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String colour, boolean filled, double length, double width) {
        super(colour, filled);
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this("unknown", false, 1, 1);
    }
    public double getArea(){
        return length*width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }

    @Override
    public String print(){
        return "Rectangle width " + width + " and lenght " + length + " which is a subclass of " + super.print();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}