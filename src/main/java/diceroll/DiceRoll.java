package diceroll;

import java.util.Random;
import java.util.Scanner;

public class DiceRoll {

    public static void diceMain() {

        var scanner = new Scanner(System.in);
        var random = new Random();
        System.out.print("Enter the number of dice");
        int numberOfDice = scanner.nextInt();
        int total = 0;
        if (numberOfDice > 0) {
            for (int i=0; i <numberOfDice ; i++) {
                int roll = random.nextInt(1,7); //between 1 and 6

                total +=roll;
                printDie(roll);
                System.out.println("You rolled " + roll );
            }
            System.out.println("Total: "+ total);


        }else {
            System.out.println("Number of dice must be greater than 0");
        }
        scanner.close();
        // Get the dice from the user
        // Check if the number of dice > 0
        // roll the dice
        // get the total
        // display ascii of dice
    }

    static void printDie(int roll) {

        String dice1 = """
                -------
               |       |
               |   ꔷ   |
               |       |
                -------
                """;

        String dice2 =  """
                -------
               | ꔷ     |
               |       |
               |     ꔷ |
                -------
                """;

        String dice3 = """
                -------
               | ꔷ     |
               |   ꔷ   |
               |     ꔷ |
                -------
                """;

        String dice4 =
                """
                -------
               | ꔷ    ꔷ|
               |       |
               | ꔷ    ꔷ|
                -------
                """;
        String dice5  =
                """
                -------
               | ꔷ    ꔷ|
               |   ꔷ   |
               | ꔷ    ꔷ|
                -------
                """;
        String dice6=
                """
                -------
               | ꔷ    ꔷ|
               | ꔷ    ꔷ|
               | ꔷ    ꔷ|
                -------
                """;


        switch (roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid Roll");
        }

    }
}
