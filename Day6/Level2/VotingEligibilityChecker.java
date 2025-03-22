import java.util.Random;
import java.util.Scanner;
public class VotingEligibilityChecker {
    public static int[] generateAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(90) + 10;
        }
        return ages;
    }
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else if (ages[i] >= 18) {
                result[i][1] = "true"; 
            } else {
                result[i][1] = "false"; 
            }
        }
        return result;
    }
    public static void displayResults(String[][] data) {
        System.out.println("Student Age10\tCan Vote?");
        for (String[] row : data) {
            System.out.printf("| %-10s | %-10s |\n", row[0], row[1]);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int[] studentAges = generateAges(n);
        String[][] eligibilityResults = checkVotingEligibility(studentAges);
        displayResults(eligibilityResults);
        input.close();
    }
}
