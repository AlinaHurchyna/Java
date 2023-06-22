package Item;
import Rózne.Material;
import java.util.Objects;
public abstract sealed class ArmorItem extends Item permits Helmet, Chestplate, Leggins, Boots {
    private final NestedCalculation nestedCalculation = new NestedCalculation();
    private final InnerCalculation innerCalculation = new InnerCalculation();
    private int armor;
    private Material material;

    protected ArmorItem(String name, String description, int value, int armor, Material material) {
        super(name, description, value);
        this.armor = armor;
        this.material = material;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        if (armor >= 0 && armor <= 100) {
            this.value = innerCalculation.calculate();
            this.armor = armor;
        }
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public void setValue(int value) {
        super.setValue(innerCalculation.calculate());
        innerCalculation.realValue = value;
    }

    @Override
    public String toString() {
        return "ArmorItem{" +
                "armor=" + armor +
                ", material=" + material +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ArmorItem armorItem)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return getArmor() == armorItem.getArmor()
                && getMaterial() == armorItem.getMaterial();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getArmor(), getMaterial());
    }

    private static class NestedCalculation {
        private int realValue;

        public int calculate(int armor) {
            return (int) (realValue * armor / 100.);
        }
    }

    private class InnerCalculation {
        private int realValue;

        public int calculate() {
            return (int) (realValue * armor / 100.);
        }
    }
}

