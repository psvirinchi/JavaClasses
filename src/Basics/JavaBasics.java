package Basics;

public class JavaBasics {
    public static void main(String[] args) {
        int intValue = 3;
        System.out.println("intValue: " + intValue);
        double decimalValue = 4.5;
        System.out.println("decimalValue: " + decimalValue);
        boolean boolValue = true;
        System.out.println("boolValue: " + boolValue);
        String strValue = "Hello World!";
        System.out.println("strValue: " + strValue);

        if (intValue > 2) {
            System.out.println("Int value is greater than 2");
        } else {
            System.out.println("Int value is less than 2");
        }

        int[] intArray = { 1, 2, 3, 4 };
        System.out.println("intArray at last index: " + intArray[3]);
        intArray[3] = 21;
        System.out.println("intArray at last index now is: " + intArray[3]);
        boolean[] boolArray = { true, false, true, true };

        int[] intArray2 = new int[10];
        System.out.println("intArray2 at 8th index: " + intArray2[7]);

        for (int i=0; i<intArray.length; i++) {
            System.out.println("intArray at " + i + " index: " + intArray[i]);
        }
    }

    // int, double, char, boolean, String, arrays
    /*
    PRIMITIVE:
    int 0
    double 0.0
    boolean false
    String [null]

    CUSTOM TYPE:
    Is something that is a combination of the primitive types
     */

    // Access Specifiers: public / private / protected
    // static: TODO

    // returntype functionName(arguments) { functionBody }

    public static void printVirinchi() {
        System.out.println("Virinchi");
    }
}