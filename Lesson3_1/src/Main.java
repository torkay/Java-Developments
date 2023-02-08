import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        boolean playAgainLoop = true;

        while (playAgainLoop == true) {
            int num = rand.nextInt(1, 201);
            int oddOrEven = num % 2;

            System.out.println("I've got a number, guess whether it's odd, or even!");

            boolean safetyNet = true;

            String guess = null;
            while (safetyNet == true) {
                guess = scan.nextLine().toUpperCase();

                if (guess.equals("EVEN") || guess.equals("ODD")) {
                    safetyNet = false;
                } else {
                    System.out.println("Invalid input, please re-read the instruction and try again");
                }
            }

            switch (guess) {
                case "EVEN":
                    if (oddOrEven == 0) {
                        System.out.println("Correct!");
                        break;
                    } else {
                        System.out.println("Incorrect!");
                        break;
                    }

                case "ODD":
                    if (oddOrEven == 1) {
                        System.out.println("Correct!");
                        break;
                    } else {
                        System.out.println("Incorrect!");
                        break;
                    }

            }
            System.out.println("The number was " + num + ", Want to play again? ['yes'] for yes, or press enter to close");
            String playAgainQuestion = scan.nextLine();

            if (!playAgainQuestion.toUpperCase().equals("YES"))
            {
                playAgainLoop = false;
            }
        }
    }
}