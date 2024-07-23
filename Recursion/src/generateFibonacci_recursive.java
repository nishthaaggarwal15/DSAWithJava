public class generateFibonacci_recursive {
    public static int[] generateFibonacciNumbers(int n) {
        // Create an array to store Fibonacci numbers
        int result[] = new int[n];

        // Initialize the first Fibonacci numbers
        if (n > 0) {
            result[0] = 0; // The first Fibonacci number is 0
        }
        if (n > 1) {
            result[1] = 1; // The second Fibonacci number is 1
        }

        // Fill the array using the recursive helper method with memoization
        generate(result, n, n - 1);
        return result;
    }

    private static int generate(int result[], int n, int index) {
        // Base case
        if (index < 2) {
            return result[index];
        }

        // If the Fibonacci number is already calculated, return it
        if (result[index] != 0) {
            return result[index];
        }

        // Calculate the Fibonacci number recursively and store it
        result[index] = generate(result, n, index - 1) + generate(result, n, index - 2);
        return result[index];
    }

    public static void main(String[] args) {
        int n = 10; // Example value
        int[] fibonacciNumbers = generateFibonacciNumbers(n);
        for (int num : fibonacciNumbers) {
            System.out.print(num + " ");
        }
    }
}
