package person;
import java.util.Objects;

public non-sealed class Student extends Person implements Textable {
    private int indexNumber;

    public Student(String firstName, String lastName, address address, Gender gender, int indexNumber) {
        super(firstName, lastName, address, gender);
        this.indexNumber = indexNumber;
    }

    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }

    @Override
    public void doJob() {
        System.out.println("I'm studying");
    }

    @Override
    public String toString() {
        return "Student{" +
                "indexNumber=" + indexNumber +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof final Student student)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return getIndexNumber() == student.getIndexNumber();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getIndexNumber());
    }

    @Override
    public void write(String text) {

    }
}

