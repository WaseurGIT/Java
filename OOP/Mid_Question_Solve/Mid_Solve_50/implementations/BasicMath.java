package implementations;

import mathoperations.MathOperation;

public class BasicMath implements MathOperation {
    
    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b){
        return a * b;
    }
}
