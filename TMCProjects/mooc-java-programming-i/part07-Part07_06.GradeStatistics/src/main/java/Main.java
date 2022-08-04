public class Main {

    public static void main(String[] args) {

        Grade grade = new Grade();
        System.out.println("Enter point totals, -1 stops:");
        grade.AddGrades();
        grade.CalculateAverage();
        grade.CalculatePointAverage();
        grade.PassPercentage();
        grade.GradeDistribution();
    }
}
