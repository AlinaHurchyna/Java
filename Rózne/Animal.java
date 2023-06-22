package Rózne;
import  java.util.Random;

public class Animal extends LivingEntity {
    private static final Random random = new Random();

    @Override
    public void speak(String text) {
        int limit = random.nextInt(4) + 2;
        for (int i = 0; i < limit; i++) {
            System.out.println(text);
        }
    }

    @Override
    public String toString() {
        return "Animal{} " + super.toString();
    }
}
