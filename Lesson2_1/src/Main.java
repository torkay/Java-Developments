import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static String calculate(double num1, double num2, String option, String selection) {
        Scanner scan = new Scanner(System.in);
        double num3;

        switch (selection) {
            case "b":
                System.out.println("Area: " + ((num1 * num2) + ""));
                System.out.println("Input num 3");
                num3 = scan.nextDouble();
                System.out.println("Perimeter: " + ((2 * (num1 + num2)) + ""));
                break;

            case "a":
                switch (option) {
                    case "rectangle":
                        return ((num1 * num2) + "");
                    case "triangle":
                        return (((num1 * num2) / 2) + "");
                }
                break;

            case "p":
                switch (option) {
                    case "rectangle":
                        return ((2 * (num1 + num2)) + "");
                    case "triangle":
                        System.out.println("Input num 3");
                        num3 = scan.nextDouble();
                        return ((num1 + num2 + num3) + "");
                }
                break;

            default:
                return ("Invalid input/s. (Error finding selection)");
        }
        return("");
    }


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double num1;
        double num2;
        boolean selectShape = false;
        String option;
        String selection;

        while (!selectShape) {
            System.out.println("Select a shape: 'rectangle', 'triangle'");
            option = scan.nextLine();

            System.out.println("Input num 1");
            num1 = scan.nextDouble();
            scan.nextLine(); // add this line to consume the newline character left by nextDouble()

            System.out.println("Input num 2");
            num2 = scan.nextDouble();
            scan.nextLine(); // add this line to consume the newline character left by nextDouble()

            System.out.println("Would you like perimeter (type 'p') or area? (type 'a'), (for both type 'b')");
            selection = scan.nextLine();

            switch (option.toLowerCase()) {
                case "rectangle":
                case "triangle":
                    System.out.println(calculate(num1, num2, option, selection));
                    selectShape = true;
                    break;

                default:
                    System.out.println("Invalid shape selected. Please try again");

            }
        }
    }
}