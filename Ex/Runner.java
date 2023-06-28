package Ex;
import java.util.Arrays;

public enum Runner {
    EXPERT(200),
    INTERMEDIATE(300),
    BEGINNER(Integer.MAX_VALUE);

    private final double time;

    Runner(final double time) {
        this.time = time;
    }

    public static Runner getFitnessLevel(final int time) {
        return Arrays.stream(values())
                .filter(value -> value.time < time)
                .findFirst()
                .orElse(null);
    }
}
