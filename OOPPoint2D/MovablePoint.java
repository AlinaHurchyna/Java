package OOPPoint2D;

import java.util.Objects;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public Movable moveUp() {
        y += ySpeed;
        return this;
    }

    @Override
    public Movable moveDown() {
        y -= ySpeed;
        return this;
    }

    @Override
    public Movable moveLeft() {
        x -= xSpeed;
        return this;
    }

    @Override
    public Movable moveRight() {
        x += xSpeed;
        return this;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovablePoint that = (MovablePoint) o;
        return getX() == that.getX() && getY() == that.getY() && getxSpeed() == that.getxSpeed() && getySpeed() == that.getySpeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getX(), getY(), getxSpeed(), getySpeed());
    }
}