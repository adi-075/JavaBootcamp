public class primitiveTypes {
    public static void main (String []args) {
        // Primitive Data types are just placeholders in memory for value

        // There's a defined maximum and minimum value for each Data Type
        int myValue=Integer.MAX_VALUE;
        int myValue2=Integer.MIN_VALUE;

        // Using the + sign in print will print different data types together as a single line of text
        System.out.println("Integer Maximum Value = " + myValue);
        System.out.print("Integer Minimum Value = " + myValue2);

        // Printing the range of Integer Values
        System.out.println("\nInteger Value Range (" + myValue + " to " + myValue2 + ")");

        // Wrapper Class are used for its primitive data types
        // All wrapper class start with the same name but their first letter is capitalized
        /*
        byte - Byte
        short - Short
        char - Character
        int - Integer
        long - long
        float - Float
        double - Double
        boolean - Boolean
         */

        /* Overflow and Underflow Situations */
        // Attempting to add 1 to max int value
        // This results in an Overflow - Minimum Value is printed
        System.out.println("Busted Max Value = " + (myValue + 1));

        // Opposite is true as well - Maximum Value of Int will be printed here ( This is Underflow )
        System.out.println("Busted Min Value = " + (myValue2 - 1));

        // Long can store more values than an int - possibly when you want to keep track of users visiting your website, you can use this to avoid overflow condition
        long myLongValue = Long.MAX_VALUE;
        System.out.println("Long Maximum Value = " + myLongValue);

        // You cannot use commas in numeric literals
        // int myMaxIntTest = 2,147,483,647;

        // Alternatively, you can use the following
        int myMaxIntTest = 2_147_483_647;
        System.out.println(myMaxIntTest);
    }
}
