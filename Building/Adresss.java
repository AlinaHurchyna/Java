package Building;

import java.util.Objects;

public class Adresss {
    private String street;
    private String city;
    private String country;

    public Adresss(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;}

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Adresss{"+
                "street='"+ street+'\''+
                ",city='"+ city+'\''+
                ",country='"+country+'\''+'}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Adresss address)){
            return false;
        }
        return Objects.equals(getStreet(),address.getStreet())
                && Objects.equals(getCity(),address.getCity())
                && Objects.equals(getCountry(),address.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStreet(), getCity(), getCountry());
        }
    }



