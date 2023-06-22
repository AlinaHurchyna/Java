package Rózne;
import Item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Inventory {
    private final List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public void add(Item Item) {
        items.add(Item);
    }

    public void remove(Item item) {
        items.remove(item);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "items=" + items +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Inventory inventory)) {
            return false;
        }
        return Objects.equals(items, inventory.items);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(items);
    }
}

