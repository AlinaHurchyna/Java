package OOPPoint2D;
import java.util.Objects;

public class MovableCircle implements Movable {
    private MovablePoint movablePoint;
    private double radius;

    public MovableCircle(MovablePoint movablePoint, double radius) {
        this.movablePoint = movablePoint;
        this.radius = radius;
    }

    @Override
    public Movable moveUp() {
        movablePoint.moveUp();
        return this;
    }

    @Override
    public Movable moveDown() {
        movablePoint.moveDown();
        return this;
    }

    @Override
    public Movable moveLeft() {
        movablePoint.moveLeft();
        return this;
    }

    @Override
    public Movable moveRight() {
        movablePoint.moveRight();
        return this;
    }

    public MovablePoint getMovablePoint() {
        return movablePoint;
    }

    public void setMovablePoint(MovablePoint movablePoint) {
        this.movablePoint = movablePoint;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "movablePoint=" + movablePoint +
                ", radius=" + radius +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovableCircle that = (MovableCircle) o;
        return Double.compare(that.getRadius(), getRadius()) == 0 && Objects.equals(getMovablePoint(), that.getMovablePoint());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMovablePoint(), getRadius());
    }
}
