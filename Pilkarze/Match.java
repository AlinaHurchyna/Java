package Pilkarze;

public class Match {
    private Team hosts;
    private Team guests;

    public Match(Team hosts, Team guests) {
        this.hosts = hosts;
        this.guests = guests;
    }

    public Team getHosts() {
        return hosts;
    }

    public void setHosts(Team hosts) {
        this.hosts = hosts;
    }

    public Team getGuests() {
        return guests;
    }

    public void setGuests(Team guests) {
        this.guests = guests;
    }
}
