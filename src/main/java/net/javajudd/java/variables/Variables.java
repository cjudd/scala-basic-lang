package net.javajudd.java.variables;

public class Variables {
    public static void main(String[] args) {

        // Immutable variable
        final int x = 1;
        // x = 2; // Cannot assign a value to final variable 'x'
        System.out.println("Immutable variable: x " + x);

        // Mutable variable
        int y = 1;
        y = 2;
        System.out.println("Mutable variable: y " + y);

        // Mutable var
        // NOTE: Requires Java 10+
        // var z = 1;
        // z = 2;
        // System.out.println("Mutable variable: z " + z);
    }
}
