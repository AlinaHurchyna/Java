package Item;
import Rózne.Material;
public final class Helmet extends ArmorItem {
    public Helmet(String name, String description, int value, int armor, Material material) {
        super(name, description, value, armor, material);
    }

    @Override
    public String getSound() {
        return "Knock-knock";
    }

    @Override
    public String toString() {
        return "Helmet{} " + super.toString();
    }
}

