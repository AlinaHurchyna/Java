package Player;

import java.util.HashMap;
import java.util.Map;

public class Game {
    private  Map<Color,Team> teams;
    public Game(){
        this.teams= new HashMap<>();
    }
    public void addTeam(Color color, Team team){
        teams.put(color, team);
    }
    public Team getTeam (Color color){
        return teams.get(color);
    }
    public int getTotalPlayerCount(){
        int totalPlayerCount=0;
        for (Team team: teams.values()){
            totalPlayerCount+=team.getPlayerCount();
        }
        return totalPlayerCount;
    }
}
