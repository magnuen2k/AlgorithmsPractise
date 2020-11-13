import Recursion.Factorial;
import Recursion.MergeSort;

public class Main {
    public static void main(String[] args) {

        // TODO change later?
        // Sample array used in all sorting algorithms
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        // Separator for every new task
        System.out.println("------------------------------------");
        System.out.println("Factorial - Recursion vs Iterative");
        System.out.println("------------------------------------");

        // Factorial (Recursion)
        int factorialOfFourRecursion = Factorial.recursiveFactorial(4);
        int factorialOfFourIterative = Factorial.iterativeFactorial(4);

        System.out.println(factorialOfFourRecursion);
        System.out.println(factorialOfFourIterative);

        // Separator for every new task
        System.out.println("------------------------------------");
        System.out.println("Merge Sort (Recursion)");
        System.out.println("------------------------------------");

        // Merge Sort (Recursion)
        MergeSort.mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
