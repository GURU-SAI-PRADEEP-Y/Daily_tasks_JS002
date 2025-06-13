import mathutils.Calculator;
public class PackageCreation {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 10,b=5;
        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
    }
}

