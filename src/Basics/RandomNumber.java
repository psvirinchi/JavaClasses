package Basics;

import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        // Generating random numbers b/w 0 to 100
        Random r = new Random();
        System.out.println(r.nextInt(100));
    }
}