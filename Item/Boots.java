package Item;
import Rózne.Material;
public final class Boots extends ArmorItem {
    public Boots(String name, String description, int value, int armor, Material material) {
        super(name, description, value, armor, material);
    }

    @Override
    public String getSound() {
        return "Tip toe";
    }

    @Override
    public String toString() {
        return "Boots{} " + super.toString();
    }
}
