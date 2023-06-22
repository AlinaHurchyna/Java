package Player;

public class Team {
    private static final int MaxPlayers=8;
    private Color color;
    private Player[] players;
    private int playerCount;

    public Team(Color color){
        this.color=color;
        this.players= new Player[MaxPlayers];
        this.playerCount=0;
    }

    public Color getColor() {
        return color;
    }

    public void addPlayer(Player player){
        if (playerCount < MaxPlayers) {
            players[playerCount]=player;
            playerCount++;
        }else {
            System.out.println("Cannot add more players to the team");
        }
    }

    public int getPlayerCount() {
        return playerCount;
    }

    public void setPlayerCount(int playerCount) {
        this.playerCount = playerCount;
    }
}
