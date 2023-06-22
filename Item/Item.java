package Item;
import Rózne.Metadatum;

import java.util.*;

public abstract sealed class Item permits ArmorItem, Sword {
    private final Map<Class<?>, Metadatum<?>> metadata = new HashMap<>();
    protected final String name;
    private String description;
    protected int value;

    protected Item(final String name, String description, int value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public abstract String getSound();

    public Map<Class<?>, Metadatum<?>> getMetadata() {
        return new HashMap<>(metadata);
    }

    public <T> void add(Class<T> clazz, Metadatum<T> metadatum) {
        metadata.put(clazz, metadatum);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", value=" + value +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Item item)) {
            return false;
        }
        return getValue() == item.getValue()
                && Objects.equals(getName(), item.getName())
                && Objects.equals(getDescription(), item.getDescription())
                && Objects.equals(getMetadata(), item.getMetadata());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getDescription(), getValue(), getMetadata());
    }
}

