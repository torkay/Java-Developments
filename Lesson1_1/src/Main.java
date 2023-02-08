import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("What's your name?");
            String username = scan.nextLine();
            System.out.println("Hello, " + username + ", let's start!");

            Random rand = new Random();
            int score = 0;

            for (int i = 0; i < 10; i++) {
                int num1 = rand.nextInt(10) + 1;
                int num2 = rand.nextInt(10) + 1;
                int operation = rand.nextInt(4);
                int result = 0;

                switch (operation) {
                    case 0:
                        while (num2 <= num1) {
                            num2 = rand.nextInt(10) + 1;
                        }
                        result = num1 * num2;
                        System.out.println("What is " + num1 + " x " + num2 + "?");
                        break;
                    case 1:
                        while (num2 == 0 || num2 >= num1) {
                            num2 = rand.nextInt(10) + 1;
                        }
                        result = num1 / num2;
                        System.out.println("What is " + num2 + " / " + num1 + "?");
                        break;
                    case 2:
                        result = num2 - num1;
                        System.out.println("What is " + num2 + " - " + num1 + "?");
                        break;
                    case 3:
                        result = num1 + num2;
                        System.out.println("What is " + num1 + " + " + num2 + "?");
                        break;
                }
                scan.nextLine();
                int answer = scan.nextInt();
                if (answer == result) {
                    score++;
                    System.out.println("Correct!");
                } else {
                    System.out.println("Incorrect, the right answer was " + result);
                }
            }

            System.out.println("You got " + score + " out of 10. Thank you for playing, " + username + "!");

            System.out.println("Would you like to play again? (yes/no)");
            String playAgain = scan.nextLine();
            if (!playAgain.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}