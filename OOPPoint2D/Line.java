package OOPPoint2D;
import java.util.Objects;

public class Line {

    private Point2D start;
    private Point2D end;

    public Line(Point2D start, Point2D end) {
        this.start = start;
        this.end = end;
    }

    public Line(float x1, float y1, float x2, float y2) {

        this(new Point2D(x1, y1), new Point2D(x2, y2));

    }

    public Point2D getStart() {
        return start;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }

    public float getLength() {
        float v = start.getX() - end.getX();
        float v1 = start.getY() - end.getY();

        return (float) Math.sqrt(v * v + v1 * v1);
    }

    public Point2D getCenter() {

        return new Point2D((start.getX() + end.getX()) / 2, (start.getY() + end.getY()) / 2);

    }

    @Override
    public String toString() {
        return "Line{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Objects.equals(getStart(), line.getStart()) && Objects.equals(getEnd(), line.getEnd());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStart(), getEnd());
    }
}