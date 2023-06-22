package Player;

public class Main {
    public static void main(String[] args){
        Game game=new Game();

        Team redTeam= new Team(Color.RED);
        Team greenTeam= new Team(Color.GREEN);
        Team blueTeam= new Team(Color.BLUE);

        Player player1 = new Player("Player 1", 100);
        Player player2 = new Player("Player 2", 100);
        Player player3 = new Player("Player 3", 100);
        Player player4 = new Player("Player 4", 100);

        redTeam.addPlayer(player1);
        redTeam.addPlayer(player2);
        greenTeam.addPlayer(player3);
        greenTeam.addPlayer(player4);

        game.addTeam(Color.RED, redTeam);
        game.addTeam(Color.GREEN, greenTeam);
        game.addTeam(Color.BLUE, blueTeam);

        Color color = Color.RED;
        Team team = game.getTeam(color);
        if (team != null) {
            System.out.println("Team color: " + team.getColor());
            System.out.println("Number of players in the team: " + team.getPlayerCount());
        } else {
            System.out.println("Team not found.");
        }
        int totalPlayerCount = game.getTotalPlayerCount();
        System.out.println("Total number of players in all teams: " + totalPlayerCount);

    }
}
