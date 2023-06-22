package OOPPoint2D;

public class main6 {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint(0, 0, 1, 1);

        MovableCircle movableCircle = new MovableCircle(movablePoint, 5);

        movableCircle.moveUp()
                .moveUp()
                .moveLeft();

        System.out.println(movableCircle);

    }
}