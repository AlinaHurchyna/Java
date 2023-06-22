package Rózne;
import java.util.Objects;

public class Metadatum<T> {
    private T value;

    public Metadatum(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Metadatum{" +
                "value=" + value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Metadatum<?> metadatum)) {
            return false;
        }
        return Objects.equals(getValue(), metadatum.getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getValue());
    }
}

