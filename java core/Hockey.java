import java.util.Scanner;
import java.util.Arrays;

interface HockeyTeam {
    int calculateHockeyScore();

    int findHighestGoalByIndividualInHockey();

}

interface FootballTeam {
    int calculateFootballScore();

    int findHighestGoalByIndividualInFootball();
}

class Sport implements HockeyTeam, FootballTeam {

    private int[] hockeyPlayers;
    private int[] footballPlayers;

    public Sport(int[] hockeyPlayers, int[] footballPlayers) {
        this.hockeyPlayers = hockeyPlayers;
        this.footballPlayers = footballPlayers;
    }

    public int calculateHockeyScore() {
        int s = 0;
        for (int i = 0; i < hockeyPlayers.length; i++) {
            s = s + hockeyPlayers[i];
        }
        return s;
    }

    public int findHighestGoalByIndividualInHockey() {
        int max = Arrays.stream(hockeyPlayers).max().getAsInt();
        return max;
    }

    public int calculateFootballScore() {
        int s = 0;
        for (int i = 0; i < footballPlayers.length; i++) {
            s = s + footballPlayers[i];
        }
        return s;
    }

    public int findHighestGoalByIndividualInFootball() {
        int max = Arrays.stream(footballPlayers).max().getAsInt();
        return max;
    }

}

public class Hockey {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] hockeyPlayers = new int[11];
        int[] footballPlayers = new int[11];

        for (int i = 0; i < 11; i++) {
            hockeyPlayers[i] = sc.nextInt();
        }

        for (int i = 0; i < 11; i++) {
            footballPlayers[i] = sc.nextInt();
        }

        Sport s = new Sport(hockeyPlayers, footballPlayers);
        try {
            HockeyTeam.class.getMethod("calculateHockeyScore");
            HockeyTeam.class.getMethod("findHighestGoalByIndividualInHockey");
            FootballTeam.class.getMethod("calculateFootballScore");
            FootballTeam.class.getMethod("findHighestGoalByIndividualInFootball");

            if (s instanceof HockeyTeam && s instanceof FootballTeam) {
                System.out.println(s.calculateHockeyScore());
                System.out.println(s.calculateFootballScore());
                System.out.println(s.findHighestGoalByIndividualInHockey());
                System.out.println(s.findHighestGoalByIndividualInFootball());
            }
        } catch (NoSuchMethodException ex) {
            System.out.println("No such function is exits");
        }
    }
}

// 2 0 0 0 1 1 0 0 0 1 0
// 2 1 0 3 0 0 0 0 0 0 0