public class wholeNumberPrimitives {
    public static void main (String []args){
        // short is shorter than int
        short sh = Short.MAX_VALUE;
        System.out.println(sh);

        // Byte is the shortest datatype - 8-bit integer (1st bit is the sign)
        byte bt = Byte.MAX_VALUE;
        System.out.println(bt);
        byte bt2 = Byte.MIN_VALUE;
        System.out.println("\nThe range of Byte is: ("+ bt + " to " + bt2+ ")" );


        // Overflow Condition
        byte ovf = (byte) (127+1);
        System.out.println(ovf);

        // Underflow Condition
        byte und = (byte) (-128 - 1);
        System.out.println(und);

        // To represent a long value add either L or l to the end of the value
        // This is really an int - Int always fits inside a long
        long myLongValue =  100;

        long bigLongLiteralValue = 2_147_483_647;
        /* To test this condition - (Uncomment this block)
        bigLongLiteralValue =  2_147_483_647_234;
        // This should result in an error because it's being treated as an Int
        System.out.println(bigLongLiteralValue); */

        // This is a long
        bigLongLiteralValue =  2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);
    }
}
