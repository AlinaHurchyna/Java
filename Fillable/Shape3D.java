package Fillable;
import OOPPoint2D.Shape;
public abstract class Shape3D implements Fillable {
    public abstract double calculateVolume();

    @Override
    public FillStatus fill(double fluid) {
        if (fluid < calculateVolume()) {
            return FillStatus.NOT_ENOUGH;
        }
        if (fluid > calculateVolume()) {
            return FillStatus.TOO_MUCH;
        }
        return FillStatus.ENOUGH;
    }
}