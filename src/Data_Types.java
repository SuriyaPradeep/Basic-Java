public class Data_Types {
    public static void main(String[] args) {
        // Creating and initializing custom character
        char a = 'G';

        //String
        String str = "Hi!!!!";

        // Integer data type is generally
        // used for numeric values
        int i = 89;

        //Boolean Values contains true or false
        boolean bool = true;

        // use byte and short
        // if memory is a constraint
        //The byte data type is an 8-bit signed two’s complement integer.
        byte b = 4;

        // this will give error as number is
        // larger than byte range
        // byte b1 = 7888888955;

        //The short data type is a 16-bit signed two’s complement integer.

        short s = 56;

        // this will give error as number is
        // larger than short range
        // short s1 = 87878787878;

        // by default fraction value
        // is double in java
        double d = 4.355453532;

        // for float use 'f' as suffix as standard
        float f = 4.7333434f;

        // need to hold big range of numbers then we need
        // this data type
        long l = 12121;

        System.out.println("char: " + a);
        System.out.println("String: "+ str);
        System.out.println("Boolean: "+bool);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
    }
}
