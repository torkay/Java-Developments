import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        int rangeLow = 1;
        int rangeHigh = 101;

        boolean playGame = true;
        boolean playingFair = true;

        while (playGame == true && playingFair == true)
        {

            if (rangeHigh - rangeLow == 0)
                {
                    System.out.println("Wait a second... you're not playing fair!");
                    playingFair = false;
                    break;
                }

            int guess = rand.nextInt(rangeLow, rangeHigh);

            System.out.println("Hmm... I think " + guess + "\nAm I: 'correct', 'too high', or 'too low'");
            String response = null;

            boolean safetyNet = true;

            while (safetyNet == true)
            {
                response = scan.nextLine();

                if (response.equals("correct") || response.equals("too high") || response.equals("too low"))
                {
                    safetyNet = false;
                }
                else
                {
                    System.out.println("Invalid response, please re-read my question!");
                }
            }

            switch (response)
            {
                case "correct":
                    System.out.println("Yay! I always win.");
                    playGame = false;
                    break;

                case "too high":
                    rangeHigh = guess-1;
                    break;

                case "too low":
                    rangeLow = guess+1;
                    break;
            }
        }
    }
}