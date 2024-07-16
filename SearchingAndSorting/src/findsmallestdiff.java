import java.util.Scanner;
public class findsmallestdiff {
    public static int[] Sort(int arr[]){
        int a = arr.length;

        for(int i =0; i<a-1; i++){
            int min =i;
            for(int j =i+1; j<a; j++){
                if(arr[j] <arr[min]){
                    min =j;
                }
            }
            int temp = arr[i];
            arr[i]= arr[min];
            arr[min]= temp;
        }
        return arr;
    }
    public static int smallestDifferencePair(int []arr1, int n, int []arr2, int m) {

        Sort(arr1);
        Sort(arr2);
        int i =0; int j=0;
        int mindiff = Integer.MAX_VALUE;
        while(i<n&& j<m){
            int diff= Math.abs(arr1[i]-arr2[j]);
            mindiff = Math.min(diff, mindiff);

            if(arr1[i]<arr2[j]){
                i++;
            }
            else {
                j++;
            }
        }
        return mindiff;
    }

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);


                int n = scanner.nextInt(); // Size of arr1
                int m = scanner.nextInt(); // Size of arr2

                int[] arr1 = new int[n];
                int[] arr2 = new int[m];

                for (int i = 0; i < n; i++) {
                    arr1[i] = scanner.nextInt();
                }

                for (int i = 0; i < m; i++) {
                    arr2[i] = scanner.nextInt();
                }

                int result = smallestDifferencePair(arr1, n, arr2, m);
                System.out.println(result);



        }
    }

