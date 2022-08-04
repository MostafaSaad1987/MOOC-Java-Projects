import java.util.ArrayList;
import java.util.Scanner;

public class Grade {

    int passingGrade;
    int total;

    int pointSize;
    int pointTotal;

    int numberOfGrads;
    int numberOfParty;

    ArrayList<Integer> gradeList = new ArrayList<>();

    public Grade() {
        passingGrade = 50;
        total = 0;

        pointSize = 0;
        pointTotal = 0;

        numberOfGrads = 0;
        numberOfParty = 0;
    }

    public void AddGrades() {
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        while (userInput != -1) {
            if (userInput >= 0 && userInput <= 100) {
                gradeList.add(userInput);
                total += userInput;
            }

            if (userInput >= 50 && userInput <= 100) {
                numberOfGrads++;
            }

            userInput = scanner.nextInt();
        }

        for (int i : gradeList) {
            if (i >= 50) {
                pointTotal += i;
                pointSize++;
            }
        }

        for (int i : gradeList) {
            if (i >= 0 && i <= 100) {
                numberOfParty++;
            }
        }
    }

    public void CalculateAverage() {
        System.out.println("Point average (all): " + ((float) total / gradeList.size()));
    }

    public void CalculatePointAverage() {
        if (pointSize == 0) {
            System.out.println("-");
        } else {
            System.out.println("Point average (passing): " + ((float) pointTotal / pointSize));
        }
    }

    public void PassPercentage() {
        System.out.println("Pass percentage: " + ((float) numberOfGrads / numberOfParty) * 100);
    }

    public void GradeDistribution() {
        int star0 = 0, star1 = 0, star2 = 0, star3 = 0, star4 = 0, star5 = 0;

        for (int i : gradeList) {
            if (i >= 0 && i < 50) {
                star0++;
            } else if (i < 60) {
                star1++;
            } else if (i < 70) {
                star2++;
            } else if (i < 80) {
                star3++;
            } else if (i < 90) {
                star4++;
            } else if (i <= 100) {
                star5++;
            }
        }

        String repeated = new String(new char[star5]).replace("\0", "*");
        System.out.println("5: " + repeated);
        repeated = new String(new char[star4]).replace("\0", "*");
        System.out.println("4: " + repeated);
        repeated = new String(new char[star3]).replace("\0", "*");
        System.out.println("3: " + repeated);
        repeated = new String(new char[star2]).replace("\0", "*");
        System.out.println("2: " + repeated);
        repeated = new String(new char[star1]).replace("\0", "*");
        System.out.println("1: " + repeated);
        repeated = new String(new char[star0]).replace("\0", "*");
        System.out.println("0: " + repeated);
    }
}

/*
Extend the program, such that it also prints the grade distribution. The grade distribution is as follows:
points 	grade
< 50 	failed, i.e. 0
< 60 	1
< 70 	2
< 80 	3
< 90 	4
>= 90 	5

Each point total is converted to a grade based on the above table. If a point total isn't within [0-100], it should be ignored.

The grade distribution is printed out as stars. E.g. if there is one point total giving the grade 5,
then it should print the row 5: *. If there are no point totals giving a particular grade, then no stars should be printed for it.
In the sample below this is true for e.g. the grade 4.
 */