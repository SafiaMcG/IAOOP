public class Calculator {

    // Examples of non-static fields
    private int num1;
    private int num2;

    // Example of a static field
    private static final int pi = 3.1415926535;

    public Calculator(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    // Example of non-static method to add numbers
    public int add() {
        return num1 + num2;
    }

    // Example of a static method to multiply numbers
    static public int multiply (int a, int b) {
        return a * b;
    }
}

