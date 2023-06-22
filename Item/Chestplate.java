package Item;
import Rózne.Material;
public final class Chestplate extends ArmorItem {
    public Chestplate(String name, String description, int value, int armor, Material material) {
        super(name, description, value, armor, material);
    }

    @Override
    public String getSound() {
        return "Bim-bam";
    }

    @Override
    public String toString() {
        return "Chestplate{} " + super.toString();
    }
}

