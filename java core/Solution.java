
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Player[] players = new Player[n];
        for (int i = 0; i < players.length; i++) {
            int id = sc.nextInt();
            int matchesPlayed = sc.nextInt();
            int totalRuns = sc.nextInt();
            sc.nextLine();
            String name = sc.nextLine();
            String team = sc.nextLine();
            players[i] = new Player(id, matchesPlayed, totalRuns, name, team);
        }
        int d = sc.nextInt();
        Player f1 = findPlayerWithMinimumMatchesPlayed(players);
        Player f2 = searchPlayerById(players, d);

        if (f1 == null) {
            System.out.println("No Player found with mentioned attribute");
        } else {
            System.out.println("id-" + f1.getId());
            System.out.println("matchesPlayed-" + f1.getMatchesPlayed());
            System.out.println("totalRuns-" + f1.getTotalRuns());
            System.out.println("name-" + f1.getName());
            System.out.println("team-" + f1.getTeam());
        }

        if (f2 == null) {
            System.out.println("No Player found with mentioned attribute");
        } else {
            System.out.println("id-" + f2.getId());
            System.out.println("matchesPlayed-" + f2.getMatchesPlayed());
            System.out.println("totalRuns-" + f2.getTotalRuns());
            System.out.println("name-" + f2.getName());
            System.out.println("team-" + f2.getTeam());
        }
    }

    public static Player findPlayerWithMinimumMatchesPlayed(Player[] players) {
        Player f = players[0];
        for (int i = 0; i < players.length; i++) {
            if (players[i].getMatchesPlayed() < f.getMatchesPlayed()) {
                f = players[i];
            }
        }
        return f;

    }

    public static Player searchPlayerById(Player[] players, int id) {
        Player f = null;
        for (int i = 0; i < players.length; i++) {
            if (players[i].getId() == id) {
                f = players[i];
                return f;
            }
        }
        return null;

    }

}

class Player {
    private int id;
    private int matchesPlayed;
    private int totalRuns;
    private String name;
    private String team;

    public Player(int id, int matchesPlayed, int totalRuns, String name, String team) {

        super();
        this.id = id;
        this.matchesPlayed = matchesPlayed;
        this.totalRuns = totalRuns;
        this.name = name;
        this.team = team;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public int getTotalRuns() {
        return totalRuns;
    }

    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}