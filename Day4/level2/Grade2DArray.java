import java.util.Scanner;

class Grade2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        int[][] marks = new int[number][3];
        int[] totalMarks = new int[number];
        double[] percentage = new double[number];
        char[] grade = new char[number];
        String[] subjects = {"Maths", "Physics", "Chemistry"};
        for (int i = 0; i < number; i++) {
            System.out.printf("Enter marks for Student %d:\n", (i + 1));
            for (int j = 0; j < 3; j++) {
                marks[i][j] = getValidMarks(input, subjects[j]);
                totalMarks[i] += marks[i][j]; // Calculate total marks
            }
            percentage[i] = (double) totalMarks[i] / 3;
            grade[i] = getGrade(percentage[i]);
        }
        System.out.println("\n--- Student Results ---");
        System.out.println("Student | Maths | Physics | Chemistry | Total Marks | Percentage | Grade");
        System.out.println("------------------------------------------------------------------------");

        for (int i = 0; i < number; i++) {
            System.out.printf("   %d    |   %3d  |   %3d   |    %3d    |    %3d     |   %.2f%%    |   %c\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], totalMarks[i], percentage[i], grade[i]);
        }
    }
    public static int getValidMarks(Scanner input, String subject) {
        int marks;
        while (true) {
            System.out.printf("Enter %s marks (0-100): ", subject);
            marks = input.nextInt();
            if (marks >= 0 && marks <= 100) {
                return marks;
            }
            System.out.println("Invalid marks! Please enter a valid number between 0 and 100.");
        }
    }
    public static char getGrade(double percentage) {
        if (percentage >= 80) return 'A';
        else if (percentage >= 70) return 'B';
        else if (percentage >= 60) return 'C';
        else if (percentage >= 50) return 'D';
        else if (percentage >= 40) return 'E';
        else return 'R';
    }
}
