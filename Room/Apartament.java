package Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Apartament {
    private List<Room> rooms;

    public Apartament() {
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        if (canAddRoom(room.getType())) {
            System.out.println("Nie można dodać pomieszczenia rodzaju" + room.getType());
            return;
        }
        rooms.add(room);


    }

    private boolean canAddRoom(RoomType roomType) {
        if (roomType == RoomType.ATTIC || roomType == RoomType.KITCHEN) {
            for (Room room : rooms) {
                if (room.getType() == roomType) {
                    return false;

                }

            }

        }
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Apartament)) return false;
        Apartament apartament = (Apartament) obj;
        return Objects.equals(rooms, apartament.rooms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rooms);
    }
    public double calculateTotalArea() {
        double totalArea = 0;
        for (Room room : rooms) {
            totalArea += room.getArea();
        }
        return totalArea;
    }

    public String toString() {
        return "Apartament{" +
                "rooms=" + rooms +
                '}';
    }
}
