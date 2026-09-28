
package labsheet1;

import java.util.Scanner;


public class Labsheet1 {

    public static void main(String[] args) {
        
        
        Scanner scanner=new Scanner(System.in);
        
        
        
        String[] teams = {"Taam A", "Team B", "Team C", "Team D"};
        int teamCount = teams.length;

        int[] wins = new int[teamCount];
        int[] draws = new int[teamCount];
        int[] losses = new int[teamCount];
        int[] goalsFor = new int[teamCount];
        int[] goalsAgainst = new int[teamCount];
        int[] points = new int[teamCount];
        int[] goalDiff = new int[teamCount];

        int[] home = {0, 2, 0, 1, 3, 0};
        int[] away = {1, 3, 2, 3, 1, 3};

        System.out.println("=====================================");
        System.out.println("---TOURNAMENT FiXTURE ---");
        for (int i = 0; i < home.length; i++) {
            System.out.println("Match " + (i + 1) + ": " + teams[home[i]] + " vs " + teams[away[i]]);
        }
        System.out.println("=========================================");
        System.out.println();

        for (int i = 0; i < home.length; i++) {
            int h = home[i];
            int a = away[i];

            System.out.println("Enter score for Match " + (i + 1) + " (" + teams[h] + " vs " + teams[a] + "):");
            System.out.print(teams[h] + " goals: ");
            int homeGoals = scanner.nextInt();
            System.out.print(teams[a] + " goals: ");
            int awayGoals = scanner.nextInt();

            goalsFor[h] += homeGoals;
            goalsAgainst[h] += awayGoals;

            goalsFor[a] += awayGoals;
            goalsAgainst[a] += homeGoals;

            if (homeGoals > awayGoals) {
                wins[h]++;
                losses[a]++;
                points[h] += 3;
            } else if (awayGoals > homeGoals) {
                wins[a]++;
                losses[h]++;
                points[a] += 3;
            } else {
                draws[h]++;
                draws[a]++;
                points[h] += 1;
                points[a] += 1;
            }
            System.out.println();
        }

        for (int i = 0; i < teamCount; i++) {
            goalDiff[i] = goalsFor[i] - goalsAgainst[i];
        }

        System.out.println("=========================================================================================================");
        System.out.println("--- STANDINGS TABLE ---");
        System.out.println("Team       Matchas Played   Wins   Draws   Losses   Goals For   Goals Against   Goal Difference   Points");
        System.out.println("-------------------------------------------------------------------------------------------------");

        for (int i = 0; i < teamCount; i++) {
            int played = wins[i] + draws[i] + losses[i];
            System.out.println(teams[i] + "              " + played + "           " + wins[i] + "      " + draws[i] + "     " + losses[i] + "        " + goalsFor[i] + "           " + goalsAgainst[i] + "               " + goalDiff[i] + "                 " + points[i]);
        }
        System.out.println("=============================================================================================");
        System.out.println();

        int champ = 0;

        for (int i = 1; i < teamCount; i++) {
            if (points[i] > points[champ]) {
                champ = i;
            } else if (points[i] == points[champ]) {
                if (goalDiff[i] > goalDiff[champ]) {
                    champ = i;
                }
            }
        }

        System.out.println("**************************************************");
        System.out.println("Tournament Champion: " + teams[champ]);
        System.out.println("********************************************************");

        scanner.close();
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    

