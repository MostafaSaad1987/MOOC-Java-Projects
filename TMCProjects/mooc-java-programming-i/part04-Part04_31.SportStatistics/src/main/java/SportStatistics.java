
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        int gamesPlayed = 0;
        int pointsHome = 0;
        int pointsVisiting = 0;
        int win = 0;
        int lose = 0;

        try (Scanner fileS = new Scanner(Paths.get(fileName))) {

            while (fileS.hasNextLine()) {
                String[] j = fileS.nextLine().split(",");

                if (team.equals(j[0]) || team.equals(j[1])) {
                    gamesPlayed++;
                }

                if (team.equals(j[0])) {
                    pointsHome = Integer.parseInt(j[2]);
                    pointsVisiting = Integer.parseInt(j[3]);
                } else if (team.equals(j[1])) {
                    pointsHome = Integer.parseInt(j[3]);
                    pointsVisiting = Integer.parseInt(j[2]);
                }

                if(pointsHome > pointsVisiting){
                    win++;
                } else if (pointsHome < pointsVisiting) {
                    lose++;
                }

                pointsHome = 0;
                pointsVisiting = 0;
            }


        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        System.out.println("Games: " + gamesPlayed);
        System.out.println("Wins: " + win);
        System.out.println("Losses: " + lose);
    }
}
