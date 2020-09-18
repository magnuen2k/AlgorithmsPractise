import Recursion.Factorial;

public class Main {
    public static void main(String[] args) {

        // FACTORIAL
        int factorialOfFourRecursion = Factorial.recursiveFactorial(4);
        int factorialOfFourIterative = Factorial.recursiveFactorial(4);

        System.out.println(factorialOfFourRecursion);
        System.out.println(factorialOfFourIterative);
    }
}
