package Item;
import Rózne.Material;
public final class Leggins extends ArmorItem {
    public Leggins(String name, String description, int value, int armor, Material material) {
        super(name, description, value, armor, material);
    }

    @Override
    public String getSound() {
        return "Scratch-scratch";
    }

    @Override
    public String toString() {
        return "Leggins{} " + super.toString();
    }

}
