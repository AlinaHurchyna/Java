package person;
import java.util.Objects;

public final class Teacher extends Person implements Textable {
    private String subject;

    public Teacher(String firstName, String lastName, address address, Gender gender, String subject) {
        super(firstName, lastName, address, gender);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void doJob() {
        System.out.println("I'm teaching");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof final Teacher teacher)) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        return Objects.equals(getSubject(), teacher.getSubject());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSubject());
    }

    @Override
    public void write(String text) {

    }
}

