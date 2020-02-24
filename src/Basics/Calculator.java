package Basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first value");
            double value1 = Double.parseDouble(input.nextLine());
            System.out.println("Enter second value");
            double value2 = Double.parseDouble(input.nextLine());
            System.out.println("Enter operation name");
            String operationName = input.nextLine();
            double result = operation(operationName, value1, value2);
            System.out.println("Result of the " + operationName + " is " + result);
            System.out.println("Do you want to continue?");
            String loopChecker = input.nextLine();
            if (!(loopChecker.equals("yes") || loopChecker.equals("y"))){
                break;
            }
        }
    }
    public static double operation(String operationName, double value1, double value2){
        if (operationName.equals("add")){
            return value1 + value2;
        }
        if (operationName.equals("sub")){
            return value1 - value2;
        }
        if (operationName.equals("mul")){
            return value1 * value2;
        }
        if (operationName.equals("div")){
            if (value2 != 0){
                return value1 / value2;
            }
            else{
                System.out.println("Error");
                return 0;
            }
        }
        return 0;
    }
}
