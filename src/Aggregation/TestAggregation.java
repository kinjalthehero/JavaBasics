package Aggregation;

public class TestAggregation {

    public static void main(String[] args) {
        Player player1 = new Player("Kinjal", "Mistry");
        Player player2 = new Player("Jignesh", "Mistry");

        Team newTeam = new Team();
        newTeam.addPlayer(player1);
        newTeam.addPlayer(player2);

        newTeam.getTeamPlayers();

        // After destroying team, team players can exist independently
        newTeam = null;
        System.out.println(player1.firstName);
        System.out.println(player2.firstName);
    }



}
