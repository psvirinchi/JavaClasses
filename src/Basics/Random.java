package Basics;

public class Random {
    public static void main(String[] args) {
        // Generating random numbers b/w 0 to 100
        java.util.Random r = new java.util.Random();
        System.out.println(r.nextInt(100));
    }
}