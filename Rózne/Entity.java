package Rózne;
import java.util.Objects;

public class Entity implements Movable {
    private String name;
    private Location location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Location getLocation() {
        return location;
    }

    @Override
    public void setLocation(Location location) {
        if (location != null) {
            this.location = location;
        }
    }

    @Override
    public String toString() {
        return "Entity{" +
                "name='" + name + '\'' +
                ", location=" + location +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Entity entity)) {
            return false;
        }
        return Objects.equals(getName(), entity.getName())
                && Objects.equals(getLocation(), entity.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLocation());
    }
}

