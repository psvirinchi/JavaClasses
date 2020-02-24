package Basics;

import java.util.Random;
import java.util.Scanner;

public class HiLoGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Hi-Lo game.");
        while (true) {
            int computerGuess = getRandomNumber();
            System.out.println("Please enter a number b/w 1-100 to begin guessing...");
            int tryCount = 0;
            while (tryCount < 5) {
                tryCount++;
                int userGuess = Integer.parseInt(input.nextLine());
                boolean didGuess = compareAnswer(computerGuess, userGuess, tryCount);
                if (didGuess) {
                    break;
                }
            }
            System.out.println("Do you want to play another game?");
            String loopChecker = input.nextLine();
            if (!(loopChecker.equals("yes") || loopChecker.equals("y"))){
                break;
            }
        }
    }

    public static int getRandomNumber() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public static boolean compareAnswer(int computerAnswer, int userAnswer, int tryCount) {
        if (computerAnswer == userAnswer) {
            System.out.println("Congrats! You guessed the right answer");
            return true;
        }
        if (tryCount < 5) {
            if (computerAnswer < userAnswer) {
                System.out.println("It's too high. Please guess something lower");
            } else {
                System.out.println("It's too low. Please guess something higher");
            }
        } else {
            System.out.println("You lost. The number was: " + computerAnswer);
        }
        return false;
    }
}
