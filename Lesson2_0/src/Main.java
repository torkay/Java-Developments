import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String dayOfWeek;
        boolean isValidInput = false;

        while (!isValidInput)
        {
            System.out.println("What's the day of the week");
            dayOfWeek = scan.nextLine();

            switch (dayOfWeek.toLowerCase())
            {
                case "mon":
                case "monday":
                    System.out.println("Learning C# Today!");
                    isValidInput = true;
                    break;

                case "tues":
                case "tuesday":
                    System.out.println("It's Tuesday, nothing's on today");
                    isValidInput = true;
                    break;

                case "wed":
                case "wednesday":
                    System.out.println("Learning Java Today!");
                    isValidInput = true;
                    break;

                case "thurs":
                case "thur":
                case "thursday":
                    System.out.println("It's Thursday, nothing's on today");
                    isValidInput = true;
                    break;

                case "fri":
                case "friday":
                    System.out.println("Learning SA5 Today!");
                    isValidInput = true;
                    break;

                case "sat":
                case "saturday":
                    System.out.println("It's Saturday!");
                    isValidInput = true;
                    break;

                case "sun":
                case "sunday":
                    System.out.println("It's Sunday!");
                    isValidInput = true;
                    break;

                default:
                    System.out.println("Invalid input, please try again");
                    break;
            }
        }
    }
}