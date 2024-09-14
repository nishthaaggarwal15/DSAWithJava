import java.util.Scanner;

public class printkeypad_recursive {
    public static void printKeypad(int input){
        // Write your code here
        if(input==0|| input==1){
            return ;
        }

        String[] combinations = getKeypadCombinations(input);

        // Print all combinations
        for (String combination : combinations) {
            System.out.println(combination);
        }

    }
    public static String[] getCharsForDigit(int digit) {
        switch (digit) {
            case 2: return new String[]{"a", "b", "c"};
            case 3: return new String[]{"d", "e", "f"};
            case 4: return new String[]{"g", "h", "i"};
            case 5: return new String[]{"j", "k", "l"};
            case 6: return new String[]{"m", "n", "o"};
            case 7: return new String[]{"p", "q", "r", "s"};
            case 8: return new String[]{"t", "u", "v"};
            case 9: return new String[]{"w", "x", "y", "z"};
            default: return new String[]{""}; // For digits 0 and 1
        }
    }
    public static String[] getKeypadCombinations(int input) {
        // Base case: if the input is 0, return an empty string array
        if (input == 0 || input == 1) {
            return new String[]{""};
        }

        // Recursive call: get combinations for all digits except the last one
        String[] smallOutput = getKeypadCombinations(input / 10);

        // Get the characters for the last digit
        String[] currentDigits = getCharsForDigit(input % 10);

        // Combine the results
        String[] output = new String[smallOutput.length * currentDigits.length];
        int index = 0;

        for (String prefix : smallOutput) {
            for (String suffix : currentDigits) {
                output[index++] = prefix + suffix;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        printKeypad(input);
    }
}
