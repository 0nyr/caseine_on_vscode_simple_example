
/**
 * A class representing a triplet of three integers
 */
public class IntegerTriplet {
    
    private int a;
    private int b;
    private int c;

    /**
     * Constructor using three values representing a triplet of integers
     */
    public IntegerTriplet(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    /**
     * @return the first integer of the triplet
     */
    public int getA() {
        return this.a;    
    }
    
    /**
     * @return the second integer of the triplet
     */
    public int getB() {
        return this.b;
    }
    
    /**
     * @return the third integer of the triplet
     */
    public int getC() {
        return this.c;
    }
    
    /**
     * @return the sum of the elements in the triplet
     */
    public int sum() {
        return getA() + getB() + getC();
    }

    /**
     * @return the average value of the triplet
     */
    public double average() {
        return (sum())/3.0;
    }

    /**
     * @return the string obtained by concatenating the three integers
     */
    public String concatenate() {
        return ""+ getA() + getB() + getC();
    }
    
    /**
     * Add a given quantity to the first integer of the triplet
     * @param value: the quantity to add to the first integer of the triplet
     */
    public void addFirst(int value) {
        a= getA() + value;
    }

}