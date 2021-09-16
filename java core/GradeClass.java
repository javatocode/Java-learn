import java.io.*;
import java.math.*;
import java.util.*;
import java.util.stream.IntStream;

class Result {

    public static String[] calculateGrade(int[][] students_marks) {
        ArrayList<String> grade = new ArrayList<String>();
        for (int i = 0; i < students_marks.length; i++) {
            int sum = IntStream.of(students_marks[i]).sum();
            float avg = sum / (students_marks[i].length);
            if (avg >= 90) {
                grade.add("A+");
            } else if ((avg >= 80) && (avg <= 90)) {
                grade.add("A");
            } else if ((avg >= 70) && (avg <= 80)) {
                grade.add("B");
            } else if ((avg >= 60) && (avg <= 70)) {
                grade.add("C");
            } else if ((avg >= 50) && (avg <= 60)) {
                grade.add("D");
            } else if ((avg <= 50)) {
                grade.add("F");
            }
        }
        String[] arr = grade.toArray(new String[grade.size()]);
        return arr;
    }

}

public class GradeClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students_marksRows = Integer.parseInt(sc.next().trim());
        int students_marksColumns = Integer.parseInt(sc.next().trim());

        int[][] students_marks = new int[students_marksRows][students_marksColumns];
        for (int i = 0; i < students_marksRows; i++) {
            for (int j = 0; j < students_marksColumns; j++) {
                students_marks[i][j] = Integer.parseInt(sc.next().trim());
            }
        }

        String[] result = Result.calculateGrade(students_marks);

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }

    }
}
