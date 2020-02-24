package Basics;

import java.util.Random;
import java.util.Scanner;

public class HighLowGame {
    public static void main(String[] args) {
        while (true) {
            Random r = new Random();
            int computerNumber = r.nextInt(100);
            System.out.println(computerNumber);
            Scanner input = new Scanner(System.in);
            int i = 0;
            int userNumber = 0;
            System.out.println("You have only 5 guesses!! All the best!!");
            while (i < 5 && userNumber != computerNumber) {
                i++;
                System.out.println("What's your guess #" + i + "?");
                userNumber = Integer.parseInt(input.nextLine());
                userNumberGuess(userNumber, computerNumber);
            }
            if (userNumber == computerNumber) {
                System.out.println("Congratulations!!!");
            } else {
                System.out.println("You failed!! The correct answer is: " + computerNumber);
            }
            System.out.println("New Game?");
            String loopChecker = input.nextLine();
            if (!(loopChecker.equals("yes") || loopChecker.equals("y"))) {
                break;
            }

        }
    }
    public static void userNumberGuess(int userNumber, int computerNumber){
        if (userNumber > computerNumber){
            System.out.println("The user number "+ userNumber + " is greater than the generated number");
        }
        if (userNumber < computerNumber){
            System.out.println("The user number "+ userNumber + " is less than the generated number");
        }
    }
}
