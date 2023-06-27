package Pilkarze;

public class Player {
    private String firstName;
    private String lastName;
    private int number;
    private Position position;

    public Player(String firstName, String lastName, int number, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
        this.position = position;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", number=" + number +
                ", position=" + position +
                '}';
    }
}
