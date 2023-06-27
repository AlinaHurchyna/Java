package Pilkarze;

import java.util.ArrayList;
import java.util.List;

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
}


