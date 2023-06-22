package Item;
import Rózne.Material;
import java.util.Objects;
public non-sealed class Sword extends Item {
    private Material material;

    public Sword(String name, String description, int value, Material material) {
        super(name, description, value);
        this.material = material;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String getSound() {
        return "cling";
    }

    @Override
    public String toString() {
        return "Sword{" +
                "material=" + material +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Sword sword)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return getMaterial() == sword.getMaterial();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMaterial());
    }
}

