package Aggregation;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Team {

    List<Player> players;

    public Team() {
        players = new ArrayList<>();
    }

    public void addPlayer (Player newPlayer) {
        players.add(newPlayer);
    }

    public void getTeamPlayers() {

        for (Player player : players) {
            System.out.println(player.firstName + " " + player.lastName);
        }
    }
}
