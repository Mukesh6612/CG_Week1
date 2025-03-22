import java.util.*;

class StudentMarks {
    public static int[][] getStudentRandomMarks(int number) {
        int[][] studentMarks = new int[number][3];
        Random rand = new Random();

        for (int i = 0; i < number; i++) {
            studentMarks[i][0] = 10 + rand.nextInt(90); 
            studentMarks[i][1] = 10 + rand.nextInt(90); 
            studentMarks[i][2] = 10 + rand.nextInt(90); 
        }
        return studentMarks;
    }
    public static double[][] calculate(int[][] studentMarks) {
        double[][] studentTotal = new double[studentMarks.length][3];

        for (int i = 0; i < studentMarks.length; i++) {
            double total = studentMarks[i][0] + studentMarks[i][1] + studentMarks[i][2];
            double average = total / 3;
            double percentage = (total / 300) * 100;

            studentTotal[i][0] = Math.round(total * 100.0) / 100.0; // Total marks
            studentTotal[i][1] = Math.round(average * 100.0) / 100.0; // Average marks
            studentTotal[i][2] = Math.round(percentage * 100.0) / 100.0; // Percentage
        }
        return studentTotal;
    }

    public static char[] grade(double[][] studentTotal) {
        char[] studentGrade = new char[studentTotal.length];

        for (int i = 0; i < studentTotal.length; i++) {
            double percentage = studentTotal[i][2];

            if (percentage >= 80) {
                studentGrade[i] = 'A';
            } else if (percentage >= 70) {
                studentGrade[i] = 'B';
            } else if (percentage >= 60) {
                studentGrade[i] = 'C';
            } else if (percentage >= 50) {
                studentGrade[i] = 'D';
            } else if (percentage >= 40) {
                studentGrade[i] = 'E';
            } else {
                studentGrade[i] = 'F';
            }
        }
        return studentGrade;
    }

    public static void displayScorecard(int[][] studentMarks, double[][] studentTotal, char[] studentGrade) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Avg", "Grade");

        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < studentMarks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10c\n",
                    i + 1, studentMarks[i][0], studentMarks[i][1], studentMarks[i][2],
                    studentTotal[i][0], studentTotal[i][1], studentGrade[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();

        int[][] studentMarks = getStudentRandomMarks(number);
        double[][] studentTotal = calculate(studentMarks);
        char[] studentGrade = grade(studentTotal);

        displayScorecard(studentMarks, studentTotal, studentGrade);
    }
}
