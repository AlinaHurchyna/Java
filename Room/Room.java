package Room;

import java.util.Objects;

public class Room {
    private   RoomType roomType;
    private final double area;
    private final int windowCount;
    private  final int balconyCount;

    public Room(RoomType roomType, double area, int windowCount, int balconyCount) {
        this.area = area;
        this.windowCount = windowCount;
        this.balconyCount = balconyCount;
    }

    public RoomType getRoomType() {
        return roomType;
    }



    public double getArea() {
        return area;
    }

    public int getBalconyCount() {
        return balconyCount;
    }



    public int getWindowCount() {
        return windowCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Room room)) return false;
        return Double.compare(room.area, area) == 0 && windowCount == room.windowCount &&
                balconyCount == room.balconyCount && roomType == room.roomType;

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return "Room{" +
                "type=" + roomType +
                ",area=" + area +
                ",windowCount=" + windowCount +
                ",balconyCount=" + balconyCount +
                '}';
    }
}
