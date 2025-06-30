import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    private static final Map<String, Boolean> VALID_ANSWERS = Map.of(
            "Y", true,
            "YES", true,
            "N", false,
            "NO", false
    );

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int die1;
        int die2;
        int die3;
        int roll;
        boolean rollAgain = false;

        do {
            roll = 1;
            printHeader();
            while (true) {
                die1 = rollDice(rand);
                die2 = rollDice(rand);
                die3 = rollDice(rand);

                printDice(roll, die1, die2, die3);
                if (checkForTriple(die1, die2, die3)) break;
                roll ++;
            }
            rollAgain = checkRollAgain(in);
        } while (rollAgain);
        in.close();
        System.out.println("Thanks for playing!");
    }

    private static void printHeader() {
        System.out.println("Roll\tDie1\tDie2\tDie3\tSum");
        System.out.println("------------------------------------------------");
    }

    private static void printDice(int roll, int die1, int die2, int die3) {
        int sumOfDice = die1 + die2 + die3;
        System.out.println(roll + "\t\t" + die1 + "\t\t" + die2 + "\t\t" + die3 + "\t\t" + sumOfDice);
    }

    private static int rollDice(Random rand) {
        return rand.nextInt(6) + 1;
    }

    private static boolean checkForTriple(int die1, int die2, int die3) {
        return ((die1 == die2) && (die2 == die3));
    }

    private static boolean checkRollAgain(Scanner in) {
        while(true) {
            System.out.print("Play again? Y/N: ");
            String userInput = in.nextLine()
                    .trim()
                    .toUpperCase();

            // don't throw an error if the user just hits enter.
            if (userInput.isEmpty()) continue;

            // Use our map of valid choices to determine if the user gave a valid answer
            Boolean userChoice = VALID_ANSWERS.get(userInput);

            if (userChoice != null) { // the user gave a valid choice
                return userChoice;
            }
            System.out.println( userInput + " is an invalid answer. Please type Y or N." );
        }
    }
}