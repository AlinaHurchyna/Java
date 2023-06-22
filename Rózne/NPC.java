package Rózne;
import java.util.Objects;

public class NPC extends LivingEntity {
    private String role;

    public NPC(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void speak(String text) {
        System.out.println(text);
    }

    @Override
    public String toString() {
        return "NPC{" +
                "role='" + role + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NPC npc)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return Objects.equals(getRole(), npc.getRole());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRole());
    }
}

