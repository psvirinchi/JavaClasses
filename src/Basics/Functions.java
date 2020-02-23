package Basics;

public class Functions {
    public static void main(String[] args) {
        sayHello("Virinchi", null, 0);
        sayHello("Virinchi", "Pala", 27);
        int sum = add(1, 4);
        System.out.println("Sum = " + sum);
    }

    /*
    <Access_Specifier> <static/non-static> <Return_type> <function_name> (<argument_1_type> <argument_1_name>, ....,) {
        function body
        DO calculations here
    }
     */

    /*
    public static void sayHello(String name) {
        System.out.println("Hello my dear, " + name);
    }

    public static void sayHello(String firstName, String lastName) {
        System.out.println("Hello my dear, " + firstName + " " + lastName);
    }

    public static void sayHello(String firstName, int age) {
        System.out.println("Hello my dear, " + firstName + ", whose age is " + age);
    }
     */

    public static void sayHello(String firstName, String lastName, int age) {
        System.out.print("Hello my dear, " + firstName);
        if (lastName != null) {
            System.out.print(" " + lastName);
        }
        if (age > 0) {
            System.out.print(" , Age: " + age);
        }
        System.out.println();
    }

    public static int add(int value1, int value2) {
        return value1 + value2;
    }
}
