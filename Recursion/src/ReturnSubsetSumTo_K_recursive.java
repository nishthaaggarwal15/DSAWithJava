/*
Given an array A of size n and an integer K, return all subsets of A which sum to K.

Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
 */
import java.util.Scanner;

public class ReturnSubsetSumTo_K_recursive {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
public static int[][] subsetsSumK(int input[], int k){
return subsetsSumKHelper(input,k,0);
    }
    public static int[][] subsetsSumKHelper(int input[], int k, int startIndex) {
        if (startIndex == input.length) {
            if (k == 0) {
                return new int[1][0];
            } else {
                return new int[0][0];
            }}
            int SubsetwithCurrent[][] = subsetsSumKHelper(input, k, startIndex + 1);
            int smallouput[][] = subsetsSumKHelper(input, k - input[startIndex], startIndex + 1);
            int output[][] = new int[SubsetwithCurrent.length + smallouput.length][];
            int index = 0;
            for (int i = 0; i < SubsetwithCurrent.length; i++) {
                output[index++] = SubsetwithCurrent[i];
            }
            for (int i = 0; i < smallouput.length; i++) {
                output[index] = new int[smallouput[i].length + 1];
                output[index][0] = input[startIndex];
                for (int j = 1; j <= smallouput[i].length; j++) {
                    output[index][j] = smallouput[i][j - 1];
                }

            }
        return output;
        }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] input = takeInput();
        int k = s.nextInt();
        int output[][] = subsetsSumK(input, k);
        for(int i = 0; i < output.length; i++) {
            for(int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}
