
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            Random random = new Random();

            System.out.println("Welcome to Rock, Paper, Scissors!");
            System.out.println("Enter your choice: Rock / Paper / Scissors");
            String userChoice = scanner.nextLine().toLowerCase();

            String[] choices = {"rock", "paper", "scissors"};
            String computerChoice = choices[random.nextInt(choices.length)];

            System.out.println("Computer's choice: " + computerChoice);

            if (userChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("scissors"))
                    || (userChoice.equals("scissors") && computerChoice.equals("paper"))
                    || (userChoice.equals("paper") && computerChoice.equals("rock"))) {
                System.out.println("You win!");
            } else if ((userChoice.equals("rock") && computerChoice.equals("paper"))
                    || (userChoice.equals("paper") && computerChoice.equals("scissors"))
                    || (userChoice.equals("scissors") && computerChoice.equals("rock"))) {
                System.out.println("You lose!");
            } else {
                System.out.println("Invalid input! Please enter Rock, Paper, or Scissors.");
            }
        }
    }
}
