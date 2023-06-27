package Pilkarze;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Team {
    private List<Player> players;
    private String country;

    public Team(String country) {
        this.players = new ArrayList<>();
        this.country = country;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public void removePlayer(Player player) {
        players.remove(player);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Team)) return false;
        Team team = (Team) o;
        return Objects.equals(players, team.players) && Objects.equals(country, team.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(players, country);
    }

    @Override
    public String toString() {
        return "Team{" +
                "players=" + players +
                ", country='" + country + '\'' +
                '}';
    }
}


