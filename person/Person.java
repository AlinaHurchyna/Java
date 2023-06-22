package person;
import java.util.Objects;

public abstract sealed class Person permits Student, Teacher {
    private String firstName;
    private String lastName;
    private address address;
    private Gender gender;

    protected Person(String firstName, String lastName, address address, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public address getAddress() {
        return address;
    }

    public void setAddress(address address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public abstract void doJob();

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof final Person person)) {
            return false;
        }
        return Objects.equals(getFirstName(), person.getFirstName())
                && Objects.equals(getLastName(), person.getLastName())
                && Objects.equals(getAddress(), person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getAddress());
    }

    public class Pet {
        private String name;
        private Gender gender;

        public Pet(String name) {
            this.name = name;
            System.out.println(Person.this.gender.toString());
        }
    }
}

