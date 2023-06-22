package Item;
import java.util.Objects;

public class adress {

    public class Address {
        private String street;
        private String city;
        private String country;

        public Address(String street, String city, String country) {
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
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof Address address)) {
                return false;
            }
            return Objects.equals(getStreet(), address.getStreet())
                    && Objects.equals(getCity(), address.getCity())
                    && Objects.equals(getCountry(), address.getCountry());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getStreet(), getCity(), getCountry());
        }
    }


}
