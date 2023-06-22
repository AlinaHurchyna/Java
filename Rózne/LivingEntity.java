package Rózne;
import java.util.Objects;

public abstract class LivingEntity extends Entity implements Speakable {
    protected int health;
    private Inventory inventory = new Inventory();

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health >= 0 && health <= 100) {
            this.health = health;
        }
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "LivingEntity{" +
                "health=" + health +
                ", inventory=" + inventory +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LivingEntity entity)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return getHealth() == entity.getHealth()
                && Objects.equals(getInventory(), entity.getInventory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getHealth(), getInventory());
    }
}

