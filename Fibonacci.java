
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Change this value to print a different number of Fibonacci numbers
        printFibonacciSeries(n);
    }

    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series of " + n + " numbers: ");

        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(first);
            } else {
                System.out.print(first + ", ");
            }

            int next = first + second;
            first = second;
            second = next;
        }
    }
}