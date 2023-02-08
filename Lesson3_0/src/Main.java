import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input First Num: ");
        int num1 = scan.nextInt();

        System.out.println("Input Second Num: ");
        int num2 = scan.nextInt();

        int result = num1 + num2;
        System.out.println(result);
    }
}