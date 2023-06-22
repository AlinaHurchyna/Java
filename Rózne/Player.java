package Rózne;
import java.util.Objects;
import Item.*;

public class Player extends LivingEntity implements Jumpable{
    private int level;
    private int gold;
    private Item ItemInHand;
    private Helmet Helmet;
    private Chestplate Chestplate;
    private Leggins Leggins;
    private Boots Boots;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level > 0) {
            this.level = level;
        }
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        if (level > 0) {
            this.gold = gold;
        }
    }

    public Item getItemInHand() {
        return ItemInHand;
    }

    public void setItemInHand(Item ItemInHand) {
        this.ItemInHand = ItemInHand;
    }

    public Helmet getHelmet() {
        return Helmet;
    }

    public void setHelmet(Helmet helmet) {
        this.Helmet = helmet;
    }

    public Chestplate getChestplate() {
        return Chestplate;
    }

    public void setChestplate(Chestplate chestplate) {
        this.Chestplate = chestplate;
    }

    public Leggins getLeggins() {
        return Leggins;
    }

    public void setLeggins(Leggins leggins) {
        this.Leggins = leggins;
    }

    public Boots getBoots() {
        return Boots;
    }

    public void setBoots(Boots boots) {
        this.Boots = boots;
    }

    @Override
    public void speak(String text) {
        System.out.println(getName() + ": " + text);
    }

    @Override
    public String toString() {
        return "Player{" +
                "level=" + level +
                ", gold=" + gold +
                ", itemInHand=" + ItemInHand +
                ", helmet=" + Helmet +
                ", chestplate=" + Chestplate +
                ", leggins=" + Leggins +
                ", boots=" + Boots +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Player player)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return getLevel() == player.getLevel()
                && getGold() == player.getGold()
                && Objects.equals(getItemInHand(), player.getItemInHand())
                && Objects.equals(getHelmet(), player.getHelmet())
                && Objects.equals(getChestplate(), player.getChestplate())
                && Objects.equals(getLeggins(), player.getLeggins())
                && Objects.equals(getBoots(), player.getBoots());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLevel(), getGold(), getItemInHand(), getHelmet(), getChestplate(), getLeggins(), getBoots());
    }

    @Override
    public void jump() {
        System.out.println(getName() + " is jumping!");
    }

}
