import java.util.Scanner;

public class ReturnSubsetArray_recursive {
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }
    public static int[][] subsetHelper(int input[], int startIndex){
        if(startIndex==input.length){
            int output[][]= new int[1][0];
            return output;
        }
        int[][] smallOutput= subsetHelper(input,startIndex+1);
         int [][] output = new int[2* smallOutput.length][];
         int k=0;
         for (int i=0; i<smallOutput.length; i++){
             output[k]= new int[smallOutput[i].length];
             for(int j=0; j<smallOutput[i].length; j++){
                 output[k][j]= smallOutput[i][j];
             }
             k++;
         }
         for(int i=0; i<smallOutput.length;i++){
             output[k]= new int[smallOutput[i].length+1];
             output[k][0]= input[startIndex];
             for( int j=1; j<= smallOutput[i].length; j++){
                 output[k][j]= smallOutput[i][j-1];
             }
             k++;
         }
return output;
    }
    public static int[][] subsets(int input[]){

        return subsetHelper(input,0);

    }
    public static void main(String[] args) {
        int[] input = takeInput();
        int output[][] = subsets(input);
        for(int i = 0; i < output.length; i++) {
            for(int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}
