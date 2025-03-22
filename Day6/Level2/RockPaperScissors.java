import java.util.*;
public class RockPaperScissors{
    public static String computerChoice(){
        Random random = new Random();
        String[] choices = {"rock","paper","Scissors"};
        return choices[random.nextInt(3)]; 
    }
    public static String Winner(String user, String computer){
        if(user.equals(computer)){
            return "Draw";
        }
        else if ((user.equals("rock") && computer.equals("Scissors"))||
        (user.equals("Scissors") && computer.equals("paper"))||
        (user.equals("paper") && computer.equals("rock"))) {
            return "User Wins";
        }else{
            return "Computer Wins";
        }
    }
    public static String[][] AverageAndPercentageOfWins(int draws, int totalGames, int computerWins,int userWins){
        double userWinRate = (userWins*100.0)/totalGames;
        double computerWinRate = (computerWins*100.0)/totalGames;
        return new String[][]{
            {"Total Games", String.valueOf(totalGames)},
            {"Player Wins", String.valueOf(userWins)},
            {"Computer Wins", String.valueOf(computerWins)},
            {"Draws", String.valueOf(draws)},
            {"Player Win %", String.format("%.2f%%", userWinRate)},
            {"Computer Win %", String.format("%.2f%%", computerWinRate)}
        };
    }
    public static void displayResults(String[][] data, String[][] stats) {
        System.out.println("\nGame Results:");
        System.out.println("+--------------+----------------+-----------------+");
        System.out.println("| Game Number  | Player Choice  | Computer Choice | Result          |");
        System.out.println("+--------------+----------------+-----------------+");

        for (String[] row : data) {
            System.out.printf("| %-12s | %-14s | %-15s | %-14s |\n", row[0], row[1], row[2], row[3]);
        }
        System.out.println("+--------------+----------------+-----------------+\n");

        System.out.println("Win Statistics:");
        System.out.println("+----------------+------------+");
        for (String[] row : stats) {
            System.out.printf("| %-14s | %-10s |\n", row[0], row[1]);
        }
        System.out.println("+----------------+------------+");
    }

    @SuppressWarnings("ConvertToStringSwitch")
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number of games to play: ");
        int totalGames = ip.nextInt();
        ip.nextLine();
        int userWins = 0, computerWins = 0, draws = 0;
        String[][] results = new String[totalGames][4];
        for (int i = 0; i < totalGames; i++) {
            System.out.print("\nEnter your choice (rock, paper, scissors): ");
            String userChoice = ip.nextLine().toLowerCase();
            while (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
                System.out.print("Invalid choice! Enter again (rock, paper, scissors): ");
                userChoice = ip.nextLine().toLowerCase();
            }
            String computerChoice = computerChoice();
            String result = Winner(userChoice, computerChoice);
            results[i][0] = String.valueOf(i + 1);
            results[i][1] = userChoice;
            results[i][2] = computerChoice;
            results[i][3] = result;
            if (result.equals("Player Wins")) {
                userWins++;
            } else if (result.equals("Computer Wins")) {
                computerWins++;
            } else {
                draws++;
            }
        }
        String[][] statistics = AverageAndPercentageOfWins(totalGames, userWins ,computerWins, draws);
        displayResults(results, statistics);
    }
}

