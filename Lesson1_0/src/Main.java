import java.util.Random;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What's your name?");
        String username = scan.nextLine();

        System.out.println("Hello, " + username + "! Let's start a math quiz.");

        Random random = new Random();
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10 - num1) + num1 + 1;

        int result = num1 * num2;
        System.out.println("What is " + num1 + " * " + num2 + "?");
        int answer = scan.nextInt();

        if (answer == result) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The answer is " + result);
        }

        scan.nextLine();
        System.out.println("Was the calculation multiplication, division, subtraction, or addition?");
        String operation = scan.nextLine();

        System.out.println("You selected " + operation + ". The correct operation was multiplication.");
    }
}