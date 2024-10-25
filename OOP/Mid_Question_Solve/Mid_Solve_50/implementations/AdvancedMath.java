package implementations;

import advancedoperations.AdvancedMathOperations;

public class AdvancedMath implements AdvancedMathOperations {
    

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    
    public int power(int base, int exponent) {
        return (int) Math.pow(base, exponent);
    }

    public double divide(int a, int b){
        if(b == 0){
            System.out.println("Divisor can't be zero!");
            return 0;
        }
        else{
            return a / b;
        }
    }
}
