package person;

public enum Gender {MALE("mężczyzna"),
    FEMALE("kobieta"),
    NON_BINARY("niebinarny/-a"),
    UNSPECIFIED("nieokreślony/-a");

    private final String pl;

    Gender(String pl) {
        this.pl = pl;
    }

    public String getPl() {
        return pl;
    }

}
