/**
 * A class to perform your own tests
 */

public class Executable {
    
    public static void main(String[] args) {
        //I can test my class here: create instances and call the method(s), check the results
        System.out.println("Hello World!");

        IntegerTriplet triplet = new IntegerTriplet(1, 2, 3);

        System.out.println("Sum of the triplet: " + triplet.sum());
    }
}