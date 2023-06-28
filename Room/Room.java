package Room;

import java.util.Objects;

public class Room {
    private RoomType type;
    private final double area;
    private final int windowCount;
    private int balconyCount;

    public Room(RoomType type, double area, int windowCount, int balconyCount) {
        this.area = area;
        this.windowCount = windowCount;
        this.balconyCount = balconyCount;
    }

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    public double getArea() {
        return area;
    }

    public int getBalconyCount() {
        return balconyCount;
    }

    public void setBalconyCount(int balconyCount) {
        this.balconyCount = balconyCount;
    }

    public int getWindowCount() {
        return windowCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Room room)) return false;
        return Double.compare(room.area, area) == 0 && windowCount == room.windowCount &&
                balconyCount == room.balconyCount && type == room.type;

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "Room{" +
                "type=" + type +
                ",area=" + area +
                ",windowCount=" + windowCount +
                ",balconyCount=" + balconyCount +
                '}';
    }
}
